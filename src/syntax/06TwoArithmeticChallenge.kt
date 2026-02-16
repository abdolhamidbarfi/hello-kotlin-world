
fun main() {
  println(4/2)
  println()
  println(5/2)
  println(5.0/2)
  println()
  println(1/2)
  println(1.0/2)

  println()

  println(4.0 - 3.9)
  println(String.format("%.2f", 4.0 - 3.9))
  println((4.0 - 3.9).formatted())

  println()

  for (i in 1..12) {
    println(String.format("%02d", i))
  }
}

fun Double.formatted(): String {
  return String.format("%.2f", this)
}