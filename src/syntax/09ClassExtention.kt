fun main() {
  println(12)

  14.printLn()

  0.5.printLn()

  2L.printLn()

  (1..10).action {
    println(it)
  }

}

fun Number.printLn() {
  println(this)
}

fun IntRange.action(block: (Int) -> Unit) {
  for (i in this){
    block(i)
  }
}