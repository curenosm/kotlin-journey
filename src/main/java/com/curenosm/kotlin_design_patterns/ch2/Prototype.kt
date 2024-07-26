package com.curenosm.kotlin_design_patterns.ch2

// Prototype en general se trata de poder crear copias
// "baratas" de un objeto base al que todas las copias
// se parecen.

data class User(
    val name: String,
    val role: Role,
    private val permissions: Set<String>,
    val tasks: List<String>,
) {
  fun hasPermission(permission: String) = permission in permissions
}

enum class Role {
  ADMIN,
  SUPER_ADMIN,
  REGULAR_USER
}

// When creating a new user, we assign it permissions that are
// similar to another user's permissions with the same role.

// In real application this would be a database of users
val allUsers = mutableListOf<User>()

fun createUser(_name: String, role: Role) {
  for (u in allUsers) {
    if (u.role == role) {
      // The pattern is so common that Kotlin has a built-in
      // function to copy objects.

      // Even the private properties will be copied
      allUsers += u.copy(name = _name)
      return
    }
  }
  // Handle case that no other user with such a role exists
}

// To be able to clone it easily

fun main() {
  println("Creating a new user")
  println(allUsers)
}
