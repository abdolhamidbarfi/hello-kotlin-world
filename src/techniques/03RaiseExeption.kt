package techniques

fun main() {

  try {
    println(sample("Hello"))
  } catch (e: Exception) {
    println(e.message)
  }

}

fun sample(value : String?) : Int {
  if (value == null) {
    throw InputArgumentInvalidException()

  }
  return value.length
}

//create out own Type Error
class InputArgumentInvalidException : Exception("Input argument is invalid")