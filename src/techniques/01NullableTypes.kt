package techniques

fun main() {
  var a: String? = "Hello"
  a = null

  //we get Error with a.length
  //println(a.length)

  if (a is String) println(a.length) else if (a == null) println("a is Null")

  //OR

  println(a?.length)

}