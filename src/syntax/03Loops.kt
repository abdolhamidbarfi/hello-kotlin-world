package syntax
// for (i in 1..5)
// for (i in 5 downTo 1)
// for (i in 1..10 step 2)
// for (i in 10 downTo 1 step 2)
fun main() {
  for (i in 1..10) {
    if (i %2 == 0) println(i)
  }
}

