package objectOriented

class Num<T : Number>(value: T) {
  var value = value
  fun multiply(other: T) : T {
    return (value.toDouble() * other.toDouble()) as T
  }

  fun devide(other: T) : Double {
    return (value.toDouble() / other.toDouble())
  }
}