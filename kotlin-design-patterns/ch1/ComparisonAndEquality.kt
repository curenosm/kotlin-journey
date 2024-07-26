package ch1

val a = 1000
val b = 1000

fun main() {

    println(a == b) // true
    println(a.equals(b)) // true
    // println(a === b) // false // Referential equality

    greet(getGreeting())
}

// Declarar funciones incluso despues de la funcion main
fun greet(greeting: String) {
    println(greeting)
}

fun getGreeting(): String {
    return "Hello, Kotlin!"
}

// Funcion Corta
fun getGreeting2() = "Hello, Kotlin!"
