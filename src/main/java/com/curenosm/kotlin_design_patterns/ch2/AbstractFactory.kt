package com.curenosm.kotlin_design_patterns.ch2

// A menudo confundido con el patron Factory Method.

// El patron de diseño Abstract Factory es una fábrica de fábricas.

// Es decir un envoltorio de multiple métodos factory.

// A menudo se utiliza en frameworks y librerías que obtienen sus
// configuraciones a partir de archivos de configuración.

interface Property {
  val name: String
  val value: Any
}

interface ServerConfiguration {
  val properties: List<Property>
}

data class PropertyImpl(override val name: String, override val value: Any) : Property

data class ServerConfigurationImpl(override val properties: List<Property>) : ServerConfiguration

fun property(prop: String): Property {
  val (name, value) = prop.split(":")
  return when (name) {
    "port" -> IntProperty(name, value.trim().toInt())
    "environment" -> StringProperty(name, value.trim())
    else -> throw RuntimeException("Unknown property: $name")
  }
}

fun main() {
  val portProperty = property("port: 8080")
  val environment = property("environment: production")
  // Un safe cast no va a tronar el programa, pero si el tipo no es el
  // correcto va a devolver null.
  val port: Int? = portProperty.value as? Int

  if (port != null) {
    // No estamos reasignando un valor, sino haciendo un shadowing
    val port: Int = port
  }
}

// Subclassing
data class IntProperty(override val name: String, override val value: Int) : Property

data class StringProperty(override val name: String, override val value: String) : Property
