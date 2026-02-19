package objectOriented.oop

data class Person(
  var name: String = "",
  var lastName: String = "",
  var age: Int = 0,
  var isMale: Boolean = false
) {
  fun sayHello() {
    println("Hello, $name!")
  }
}

fun Person.sayHello2() {
  println("Hello, $name $lastName!")
}