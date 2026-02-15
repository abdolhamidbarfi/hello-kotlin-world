package syntax

//define constant
const val PI = 3.14
val URL = "http://www.example.com"
/*
When something is defined as const, it is computed at compile time, and we can perform more and stricter operations during compilation.

But if we don’t use const, it is computed at run time, and we can use methods and perform more flexible operations with it.
*/

fun main() {
  val a : Long = 2 //define and asign a value to constant
  //a = 4 => can not reasign to constant
  val b : Int //define
  b = 3 //asign value
  //b = 4 => can not reasign

  var c : Double = 5.4 //define and asign
  c = 6.3 //reasign value

  //kotlin is Staticaly Type Language
  /* Staticaly Type languages: C, C++, Java, Rust, Go, Scala, Kotlin
  * The data **type** must be explicitly specified.
  * Kotlin Data Types
  * Numbers:
  * Type      Bit width
  * Double    64
  * Float     32
  * Long      64
  * Int       32
  * Short     16
  * Byte      8
  */

  val doubleVal = 2.0
  val floutVal = 3f
  val longVal = 2L
  val intVal = 3
  val shortVal : Short = 2
  val byteVal: Byte = 3

  //Type and Print
  //how we can print type of value
  println(PI::class.simpleName)
  //print full type
  println(URL::class.qualifiedName)

  println("PI is $PI")
  println("PI is ${PI * 2}")
}

//How we can define function

//simple function
fun fnName(x : Int) = x * 2
fun sum(a: Int, b: Int) = a + b

//clasic function
fun sum2(a: Int, b: Int) : Int {
  return a + b
}
