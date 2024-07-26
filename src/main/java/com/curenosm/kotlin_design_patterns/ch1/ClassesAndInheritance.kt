package com.curenosm.kotlin_design_patterns.ch1

// Para utilizar funciones definidas en otros paquetes
import kotlin.random.*

fun main() {
  // Classes

  // Instancia de una clase
  val player = Player("Anthony") // sin palabra reservada new

  // Para asociar atributos al jugador, hacemos uso del constructor principal
  println(player.name) // Roland
}

// Con modificador para poder alterar el estado
// e indicando que Player implementa la interfaz DiceRoller
class Player(var name: String) : DiceRoller {

  // Si no queremos especificar el valor en tiempo de creación, podemos
  // declararla en el cuerpo de la clase, además, necesitamos proveer un valor
  // por defecto en este caso, pues se trata de un tipo Int
  var score: Int = 0
    set(value) {
      field =
        if (value >= 0) {
          value
        } else {
          0
        }
    }

  // Si queremos tener algo de lógica adicional para alguna propiedad mutable
  // podemos hacer uso de la sintaxis set.

  // Implementación de la interfaz
  override fun rollDice() = Random.nextInt(0, 6)
}

// Interfaces
interface DiceRoller {

  // Podemos utilizar una definición por defecto en caso de que no se dependa
  // del estado de la implementación de la interfaz.
  open fun rollDice() = Random.nextInt(0, 6)
}

// Clases Abstractas

// Requieren ser extendidas antes de ser instanciadas, de la misma forma que una
// interfaz, con la diferencia de que pueden tener estado y métodos concretos.

abstract class Moveable() {
  protected var x: Int = 0 // Propiedades visibles para la clase y sus hijas
  protected var y: Int = 0

  open fun move(x: Int, y: Int) {
    this.x = x
    this.y = y
  }
}

// Cualquier clase que implemente Moveable, heredara la función move

// MODIFICADORES DE ACCESO

// Las propiedades o funciones privadas solo son accesibles dentro de la clase
// en la que se definen.

// La visibilidad por defecto es pública, por lo que no hay razón para estar
// utilizando public

// Para extender de una clase abstracta la listamos después de los dos puntos,
// pero utilizamos paréntesis para indicar que se trata de una clase y no de una
// interfaz
open class ActivePlayer(name: String) : Moveable(), DiceRoller {
  // Implementación de la interfaz
  override fun rollDice() = Random.nextInt(0, 6)
}

// HERENCIA
// Podemos pasar argumentos a la clase Padre a través de la clase Hija
// como llamamos `super` en Java, pero todas las clases son final en Kotlin
// por lo que debemos marcarlas como open para poder extenderlas.

class ConfusedPlayer(name: String) : ActivePlayer(name) {
  override fun move(x: Int, y: Int) {
    this.x = y // must be declared protected
    this.y = x // must be declared protected
  }
}

// Mientras que en Java existe la anotación opcional @Override, en Kotlin es
// obligatoria la palabra reservada override, tampoco podemos sobreescribir un
// método que no sea open.

// Además, debemos declarar las propiedades como protected para que puedan ser
// accedidas por las clases hijas.
