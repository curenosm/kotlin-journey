package com.curenosm.kotlin_design_patterns.ch2

// Factory Method nos permite crear objetos sin necesidad de llamar un
// constructor

fun main() {
  val notations = listOf("pa8", "qc3")
  val pieces = mutableListOf<ChessPiece>()
  for (n in notations) {
    pieces.add(createPiece(n))
  }
  println(pieces)
}

// Las interfaces pueden tener propiedades
interface ChessPiece {
  val file: Char
  val rank: Char
}

// Cada pieza de ajedrez va a ser una data class que implementa nuestra interfaz
data class Pawn(
    // Sobreescribimos las propiedades de la interfaz
    override val file: Char,
    override val rank: Char
) : ChessPiece

data class Queen(override val file: Char, override val rank: Char) : ChessPiece

// TODO: Agregar las datas classes de las demas piezas

fun createPiece(notation: String): ChessPiece {
  // Destructuring declaration, cualquier data class puede ser destructurada
  val (type, file, rank) = notation.toCharArray()

  // Dependiendo del valor de type, creamos una pieza de ajedrez, de eso
  // se trata a grandes rasgos el patron Factory Method
  return when (type) {
    'q' -> Queen(file, rank)
    'p' -> Pawn(file, rank)
    // ...
    else -> throw RuntimeException("Unknown piece: $type")
  }
}
