package ch1

fun main() {
    // Kotlin checa que no haya nulls en tiempo de compilacion
    // val s: String = null // No compila
}

fun printLength(s: String) {
    println(s.length)
}

// printLength(null) // No compila

// Si queremos que una funcion reciba valores nulos opcionalmente:
fun printLength(stringOrNull: String?) { 
    if (stringOrNull != null) {
        println(stringOrNull.length)
    } else {
        println("String is null")
    }
}
