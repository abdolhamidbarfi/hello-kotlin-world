package techniques.dsl

fun main() {
  println(getCommunity())
}

data class Contact(
  var address: String? = "",
  var phone: String? = "",
)

data class Person(
  var name: String,
  var age: Int? = null,
  var contacts: MutableList<Contact>? = null
) {
  operator fun Contact.unaryPlus() {
    if (contacts == null) {
      contacts = mutableListOf()
    }
    contacts?.add(this)
  }
}

data class Comunity(
  var person: MutableList<Person>? = null,
) {
  operator fun Person.unaryPlus() {
    if (person == null) {
      person = mutableListOf()
    }
    person?.add(this)
  }
}

fun community(block: Comunity.()->Unit) = Comunity().apply(block)
fun person(name: String, block: Person.()->Unit) = Person(name).apply(block)
fun contact(block: Contact.()->Unit) = Contact().apply(block)


fun getCommunity() = community {
  +person("Mohammad") {
    age = 30
    +contact {
      address = "Tehran"
      phone = "+91-2103"
    }

    +contact {
      address = "Karaj"
      phone = "+9821"
    }
  }

  +person("Behnam") {
    age = 24

    +contact {
      address = "Tehran"
    }
    for (i in 1..10) {
      +contact {
        address = "Tehran p$i"
        phone = "+91-2103$i"
      }
    }
  }
}