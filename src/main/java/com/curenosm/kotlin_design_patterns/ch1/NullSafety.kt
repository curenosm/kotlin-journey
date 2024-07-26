package com.curenosm.kotlin_design_patterns.ch1

fun main() {
  // Kotlin checa que no haya nulls en tiempo de compilación
  // val s: String = null // No compila
  printLength(null)
}

// printLength(null) // No compila

// Si queremos que una función reciba valores nulos opcionalmente:
fun printLength(stringOrNull: String?) {
  if (stringOrNull != null) {
    println(stringOrNull.length)
  } else {
    println("String is null")
  }
}
