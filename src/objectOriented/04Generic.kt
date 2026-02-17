package objectOriented

fun main() {
  val a = Num(2.0)
  val b = Num(2)
//  val c = Num("Hello") ---> can not add string value

  var d = Num(1000000000).multiply(10000000)
  println(d)

  var e = Num(5).devide(2)
  println(e)
}