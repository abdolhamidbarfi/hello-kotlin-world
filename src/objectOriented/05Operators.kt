package objectOriented

fun main() {

  var a = 2
  var b = a.plus(2)
  println(b)

  var sum = Num(2) + Num(3.6)
  var sum2 = Num(2) + Num(3)
  var sum3 = Num(2) + Num(3.6)
  val sum4 = Num(2) + 3.6
  val sum5 = Num(2) + "Hello"
  val sum6 = Num(2) + Car01()

  println(sum)

  var mines = Num(2.5) - Num(3.6)
  println(mines)
}