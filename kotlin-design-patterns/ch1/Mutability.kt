import java.util.*

fun main() {
    // Se recomienda lidiar con estructuras de datos inmutables
    // pero tambien es posible usar versiones mutables para construir los
    // resultados de una funcion
    val editableHobbits = mutableListOf("Frodo", "Sam", "Pippin", "Merry")
    editableHobbits.add("Bilbo")

    // Para llamar otras implementaciones
    val treeMap = java.util.TreeMap(
        mapOf(
            "Practical Pig" to "bricks",
            "Fifer" to "straw",
            "Fiddler" to "sticks"
        )
    )
    
    // Los nombres de las llaves terminan en orden lexicografico
    println(treeMap.keys) // [Fiddler, Fifer, Practical Pig]
}