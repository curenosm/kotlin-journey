package com.curenosm.kotlin_design_patterns.ch1

fun archenemy(heroName: String) =
    when (heroName) {
      "Batman" -> "Joker"
      "Superman" -> "Lex Luthor"
      "Spiderman" -> "Green Goblin"
      else -> "Unknown"
    }

fun main() {
  val hero = "Batman"
  // Podemos interpolar llamadas a funciones dentro de llaves y después del
  // signo $, si se trata de una variable, podemos omitir las llaves
  println("Archenemy of $hero is ${archenemy(hero)}")

  // Kotlin cuenta con raw strings o cadenas multilínea
  println(
      """Twinkle, Twinkle Little Bat
               How I wonder what you're at!
               Up above the world you fly,
               Like a tea tray in the sky.
               Twinkle, twinkle, little bat!
               How I wonder what you're at!""")

  // Como respeta los espacios en blanco el texto no está indented
  // correctamente, lo hacemos con:
  println(
      """Twinkle, Twinkle Little Bat
               How I wonder what you're at!
               Up above the world you fly,
               Like a tea tray in the sky.
               Twinkle, twinkle, little bat!
               How I wonder what you're at!"""
          .trimIndent())

  // También nos permite no escapar algunos caracteres
  println(""" From " Alice's Adventures in Wonderland" """)
}
