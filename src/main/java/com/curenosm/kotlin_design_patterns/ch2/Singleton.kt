package com.curenosm.kotlin_design_patterns.ch2

// Para el patron Singleton, necesitamos tener una unica instancia de una clase
// en el sistema y ademas esta instancia deberia ser accesible desde cualquier
// part del mismo.

// Por medio del uso de object, podemos obtener una implementacion de un
// singleton que cumple con ser: perezoso, seguro en cuanto a hilos y eficiente.

// Aunque la palabra reservada object se utiliza de igual manera con otros fines

// Un singleton puede implementar una interfaz, sin embargo no puede tener
// constructores, si requerimos una inicializacion podemos usar el bloque init
object NoMoviesList : List<String> {
  // Si el singleton nunca es instanciado, no se va a ejecutar el bloque,
  // por lo que es perezoso
  init {
    println("I was accessed for the first time")
    // Logica de inicializacion
  }

  override val size = 0

  override fun contains(element: String) = false

  override fun containsAll(elements: Collection<String>) = false

  override fun get(index: Int) = throw IndexOutOfBoundsException()

  override fun indexOf(element: String) = -1

  override fun isEmpty() = true

  override fun iterator() = emptyList<String>().iterator()

  override fun lastIndexOf(element: String) = -1

  override fun listIterator() = emptyList<String>().listIterator()

  override fun listIterator(index: Int) = emptyList<String>().listIterator()

  override fun subList(fromIndex: Int, toIndex: Int) =
      emptyList<String>().subList(fromIndex, toIndex)
}

fun main() {
  val myFavoriteQuickAndAngryMovies = NoMoviesList
  val yourFavoriteQuickAndAngryMovies = NoMoviesList
  // Referential equality
  println(myFavoriteQuickAndAngryMovies === yourFavoriteQuickAndAngryMovies)
}

// Creamos una funcion que imprime la lista de peliculas

fun printMovies(movies: List<String>) {
  for (m in movies) {
    println(m)
  }
}

//
