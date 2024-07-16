fun main() {
    // Podemos la funcionalidad de una clase sin heredar de ella mediante 
    // el uso de un prefijo delante del nombre de la funcion como el nombre de
    // la clase que deseamos extender.
    val password: String = "secretpassword"
    println("Password: ${password.hidePassword()}")
}

// A la clase String se le conoce como el method receiver
// O recibidor del metodo
fun String.hidePassword() = "*".repeat(this.length)
