package com.curenosm.kotlin_design_patterns.ch1

fun main() {
  // Listas.
  // Inferencia del tipo de elementos de la lista
  val hobbits = listOf("Frodo", "Sam", "Pippin", "Merry")
  val hobbitsExplicitTypes: List<String> = listOf("Frodo", "Sam", "Pippin", "Merry")

  println(hobbits[1]) // Sam

  // Conjuntos

  val footballChampions =
    setOf("France", "Germany", "Spain", "Italy", "Brazil", "France", "Brazil", "Germany")

  println(footballChampions) // [France, Germany, Spain, Italy, Brazil]

  // Checar pertenencia
  println("Israel" in footballChampions)
  println("Italy" in footballChampions)

  // Mapas
  val movieBatmans =
    mapOf(
      "Batman Returns" to "Michael Keaton",
      "Batman Forever" to "Val Kilmer",
      "Batman & Robin" to "George Clooney",
    )
  println(movieBatmans["Batman Returns"]) // Michael Keaton

  // Verificando existencia en los mapas
  println(" Batman Begins " !in movieBatmans)
}
