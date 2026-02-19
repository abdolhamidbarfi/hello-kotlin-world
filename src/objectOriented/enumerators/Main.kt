package objectOriented.enumerators

fun main() {
  var s1 = Status.PENDING
  var red = Color.RED

  when (s1) {
    Status.PENDING -> println("Pending")
    Status.FAILED -> println("Failed")
    Status.SUCCEEDED -> println("Succeeded")
    Status.QUEUE -> println("Queued")
  }

  if ( s1 === Status.FAILED) {
    println("Failed")
  }

  println(s1)
  println(red)
  println(red.code)
  println(red.getCode())

  val m1 = Month.Ordibehesht
  println(m1)
  println(m1.ordinal)
}

enum class Status {
  QUEUE,
  PENDING,
  SUCCEEDED,
  FAILED
}

enum class Color(val code : String) {
  BLACK("000000"),
  RED("0000FF"),
  WHITE("FFFFFF"),
}

fun Color.getCode(): String {
  return code
}
enum class Month {
  Farvardin,
  Ordibehesht,
  Khordad
}