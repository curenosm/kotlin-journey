// Static Factory Method, popularizado por Joshua Bloch en Effective Java

fun main() {
    // val server = Server(8080) // No se puede llamar al constructor directamente
    val server = Server.withPort(8080)
}

// Ventajas:

// Caching: Mediante el uso de un metodo statico valueOf podemos verificar si en 
// la cache ya fue parseado el valor

// Subclassing: Mediante el llamado de un metodo de creacion estatico podemos
// crear cualquier tipo de instancia derivada de una clase, no solo la 
// especificada en el constructor.

// Los metodos estaticos (que no pertenecen a una instancia de una clase)
// se declaran dentro de un companion object


// Si queremos hacer ue la unica manera de instaciar nuestro objetp sea mediante
// el static factory method, podemos hacer privado el constructor
class Server private constructor(port: Long) {
    init {
        println("Server started on port $port")
    }

    // Los companion objects pueden ser nombrados para clarificar la intecion 
    // como
    // companion object parser {

    // Al igual que un metodo estatico de Java, la inicializacion de un objeto
    // se realizara de manera peresosa cuando la clase que lo contiene sea
    // accedida por vez primera.

    // Ademas solo puede haber un companion object por clase
    companion object {
        fun withPort(port: Long) = Server(port)
    }
}

