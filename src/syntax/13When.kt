fun main() {

  var n = 100
  if (n == 1) {
    println("One")
  } else if (n == 2) {
    println("Two")
  } else if (n == 3) {
    println("Three")
  } else {
    println("None of One, Two, Three")
  }

  when {
    n == 1 -> println("One")
    n == 2 -> println("Two")
    n == 3 -> println("Three")
    else -> println("None of Two, Two, Three") // else is Optional
  }

  when (n) {
    1 -> println("One")
    2 -> println("Two")
    3, 4 , 5 -> println("Three")
    in 0..Int.MAX_VALUE -> println("true")
    is Int -> println("$n")
    else -> {
      println("None of Two, Two, Three")
    }
  }

}