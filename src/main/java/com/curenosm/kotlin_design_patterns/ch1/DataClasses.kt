package com.curenosm.kotlin_design_patterns.ch1

// DATA CLASSES

// Nos permite ahorrarnos mucho código repetitivo

// Ademas podemos declarar una data class como un record de java para
// utilizarlo mediante la interoperabilidad

@JvmRecord
data class User(val username: String, private val password: String) {
  fun hidePassword() = "*".repeat(password.length)
}

// Nos genera dos getters y ningún setter, pues se tratan de propiedades
// inmutables, también la función equals, hashCode y clone
fun main() {
  // Estas data classes siempre son finales, es decir que no podemos heredar
  // de ellas
  val user = User("Alexey", "abcd1234")
  println(user.hidePassword())
}
