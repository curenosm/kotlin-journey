package com.curenosm.kotlin_design_patterns.ch1

fun main() {
    // For-each

    // Nos permite iterar sobre strings, estructuras de datos, y basicamente
    // cualquier cosa que sea iterable
    for (c in "Word") {
        println(c)
    }

    // Ahora con una coleccion
    val jokers = listOf("Heath Ledger", "Joaquin Phoenix", "Jack Nicholson")
    for (j in jokers) {
        println(j)
    }

    // For loop, un for-each sobre un rango (.. es el range operator)
    // Y es inclusivo en ambos extremos.
    for (i in 0..9) {
        println(i)
    }

    // Podemos hacerlo exclusivo
    for (i in 0 until 9) {
        println(i)
    }

    // Si queremos en orden inverso, hacemos uso de infix call, tanto en la 
    // funcion until como en downTo.
    for (i in 9 downTo 0) { 
        println(i)
    }

    // Ciclo while
    var x = 0 // Estamos forzados a definirla como var, pues va a mutar
    while (x < 10) {
        x++
        println("while $x")
    }

    // Do-while
    x = 5
    do {
        println("do while $x")
        x--
    } while (x > 0)

}