package syntax

fun main(){

  val maximumNumber = max(1, -2, 36, 52, -53, 5, 56)
  val minimumNumber = min(1, -2, 36, 52, -53, 5, 56)
  val sumValues = sum(1,2,3,4,5,6,7,8,9)
  val averateValues = average(1,2,3,4,5,6,7,8,9)

  val finalValue = averateValues
  println("finalValue = $finalValue and typeOF is ${typeOf(finalValue)} and fullTypeOf is ${fullTypeOf(finalValue)}")
}

fun typeOf(value: Any) = value::class.simpleName
fun fullTypeOf(value: Any) = value::class.qualifiedName

fun max(vararg numbers: Number) : Number {
  var max  = numbers[0]
  for (i in 0 .. numbers.size - 1) {
    if (numbers[i].toDouble()> max.toDouble()) {
      max = numbers[i]
    }
  }
  return max
}

fun min(vararg numbers: Number) : Number {
  var min  = numbers[0]
  for (i in 0 .. numbers.size - 1) {
    if (numbers[i].toDouble()< min.toDouble()) {
      min = numbers[i]
    }
  }
  return min
}

fun sum(vararg numbers: Number) : Number {
  var sum = 0.0
  for (number in numbers) {
    sum += number.toDouble()
  }
  return sum
}

fun average(vararg numbers: Number): Double {
  var sum = 0.0
  for (number in numbers) {
    sum += number.toDouble()
  }

  return sum / numbers.size
}