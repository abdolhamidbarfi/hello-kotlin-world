import kotlin.math.pow

fun main() {
  for (i in 1 to 10) {
    println(i)
  }

  println(2 p 3)
}

infix fun Int.to(other: Int) : IntRange {
  return this..other
}

infix fun Int.p(other: Int) : Int {
  return this.toDouble().pow(other).toInt()
}