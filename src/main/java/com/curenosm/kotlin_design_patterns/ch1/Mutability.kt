package com.curenosm.kotlin_design_patterns.ch1

import java.util.TreeMap

fun main() {
  // Se recomienda lidiar con estructuras de datos inmutables,
  // pero también es posible usar versiones mutables para construir los
  // resultados de una función
  val editableHobbits = mutableListOf("Frodo", "Sam", "Pippin", "Merry")
  editableHobbits.add("Bilbo")

  // Para llamar otras implementaciones
  val treeMap =
      TreeMap(mapOf("Practical Pig" to "bricks", "Fifer" to "straw", "Fiddler" to "sticks"))

  // Los nombres de las llaves terminan en orden lexicográfico
  println(treeMap.keys) // [Fiddler, Fifer, Practical Pig]
}
