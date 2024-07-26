package com.curenosm.kotlin_design_patterns.ch1

fun main(args: Array<String>) {
    // En Kotlin los arreglos de algun tipo en particular se denotan
    val musketeers: Array<String> = arrayOf("Athos", "Porthos", "Aramis")

    // Para convertir alguna coleccion existente a un arreglo
    listOf(1, 2, 3, 5).toTypedArray()

    println(args.joinToString(", "))
}
