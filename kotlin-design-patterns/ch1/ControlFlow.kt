fun main() {

}

// En Kotlin, los if son expresiones, por lo que pueden devolver un valor
fun getUnixSocketPolling(isBsd: Boolean): String {
    return if (isBsd) {
        "kqueue"
    } else {
        "epoll"
    }
}

// O podemos utilizar la version corta de la firma de la funcion, aunque hay
// que asegurarnos de que son funciones entendibles no solo para uno mismo sino
// para otros desarrolladores.
fun getUnixSocketPollingShort(isBsd: Boolean): String
    = if (isBsd) "kqueue" else "epoll"

// En Kotlin, en lugar de switch, tenemos when, por regla general se utilizan
// cuando tenemos mas de una condiciones a evaluar
fun archenemy(heroName: String) = when (heroName) {
    "Batman" -> "Joker"
    "Superman" -> "Lex Luthor"
    "Spiderman" -> "Green Goblin"
    else -> "Unknown"
}
