fun main() {
  println(min(2 , 4, 6, 7, -1, 10, 50, 32, 12))
  println(average(2 , 4.5, 6f, 7L, -1, 10, 50, 32, 12))

}

//private fun max(a: Int, b: Int) = if (a > b) a else b
private fun max1(vararg numbers: Int): Int {
  var max = numbers[0]
  for (number in numbers) {
    if (number > max) {
      max = number
    }
  }
  return max
}

private fun min1(vararg numbers: Int): Int {
  var min = numbers[0]
  for (number in numbers) {
    if (number < min) {
      min = number
    }
  }
  return min
}

fun sum1(vararg numbers: Number): Double {
  var sum = 0.0
  for (number in numbers) {
    sum += number.toDouble()
  }
  return sum
}

fun average1(vararg numbers: Number): Double {
  var sum = 0.0
  for (number in numbers) {
    sum += number.toDouble()
  }

  return sum / numbers.size
}
