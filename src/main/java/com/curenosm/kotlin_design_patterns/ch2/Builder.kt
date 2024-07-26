package com.curenosm.kotlin_design_patterns.ch2

// Design Pattern: Builder

// Downsides:
//   - The properties of our resulting class are being repeated
//   - For every new property we need to add a new method
//   - It's verbose

data class Mail_V1(
    val to: List<String>,
    val cc: List<String>, // Carbon copy
    val title: String,
    val message: String,
    val important: Boolean, // Trailing comma Kotlin 1.4+
)

class MailBuilder {
  private var to: List<String> = listOf()
  private var cc: List<String> = listOf()
  private var title: String = ""
  private var message: String = ""
  private var important: Boolean = false

  // As it is internal it will be visible only in the same module
  class Mail
  internal constructor(
      val to: List<String>,
      val cc: List<String>,
      val title: String?,
      val message: String?,
      val important: Boolean
  )

  fun to(to: List<String>): MailBuilder {
    this.to = to
    return this
  }

  fun cc(cc: List<String>): MailBuilder {
    this.cc = cc
    return this
  }

  fun title(title: String): MailBuilder {
    this.title = title
    return this
  }

  fun message(message: String): MailBuilder {
    this.message = message
    return this
  }

  fun important(important: Boolean): MailBuilder {
    this.important = important
    return this
  }

  fun build(): Mail {
    if (to.isEmpty()) throw RuntimeException("To property is empty")
    return Mail(to, cc, title, message, important)
  }
}

// Fluent Setters
data class Mail_V2(
    // Underscore is a convention to indicate that the property is private
    val to: List<String>,
    private var _message: String? = null,
    private var _cc: List<String>? = null,
    private var _title: String? = null,
    private var _important: Boolean = false
) {

  // Returns the reference to an object after applying the action
  fun message(message: String) = apply { _message = message }

  fun cc(cc: List<String>) = apply { _cc = cc }

  fun title(title: String) = apply { _title = title }

  fun important(important: Boolean) = apply { _important = important }
}

data class Mail_V2_1(
    val to: List<String>,
    var message: String? = null,
    var cc: List<String>? = null,
    var title: String? = null,
    var important: Boolean = false
)

// Default Arguments
data class Mail_V3(
    val to: List<String>,
    val cc: List<String> = listOf(),
    val title: String = "",
    val message: String = "",
    val important: Boolean = false,
)

fun main() {

  val mail = Mail_V1(listOf("manager@company.com"), listOf(), "Ping", "Hello", true)
  val email = MailBuilder().to(listOf("hello@hello.com")).title("What's up?").build()
  println(email)

  val mailV2 = Mail_V2(listOf("manager@company.com")).title("Ping").message("Hello")
  println(mailV2)

  // When could ever omit the setters declaration
  val mail2 =
      Mail_V2_1(listOf("hello@mail.com")).apply {
        message = "Hello"
        title = "Apply"
      }
  println(mail2)

  // Using named arguments so we can skip the cc field
  val mail3 = Mail_V3(title = "Hello", message = "There", to = listOf("my@dear.cat"))

  println(mail3)
}
