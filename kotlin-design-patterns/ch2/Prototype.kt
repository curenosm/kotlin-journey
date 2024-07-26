package ch2

// Prototype en general se trata de poder crear copias
// "baratas" de un objeto base al que todas las copias
// se parecen.

data class User(
    val name: String,
    val role: Role,
    val permissions: Set<String>,
) {
    fun hasPermission(permission: String) =
        permission in permissions
}

enum class Role {
    ADMIN, SUPER_ADMIN, REGULAR_USER
}

// When creating a new user, we assign it permissions that are
// similar to another user's permissions with the same role.

// In real application this would be a database of users

val allUsers = mutableLisOf<User>()

fun createUser(name: String, role: Role) {
    for (u in allUsers) {
        if (u.role == role) {
            allUsers += User(name, role, u.permissions)
            return
        }
    }
    // Handle case that no other user with such a role exists
}


fun main() {

}
