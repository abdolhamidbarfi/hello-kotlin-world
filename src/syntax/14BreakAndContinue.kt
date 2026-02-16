fun main() {
  //break
  for (i in 1..100) {
    println(i)
    if (i == 10) {
      break
    }
  }

  //jump
  L1@ for (i in 100 downTo 1) {
    for (j in 1..100) {
      var result = i + j
      if (result <= 100) {
        break@L1
      }
    }
  }

  //continue
  for (i in 1..100) {
    if (i <50 ) {
      continue
    }
    println("$i")
  }
}