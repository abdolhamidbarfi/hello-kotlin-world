package objectOriented

class Num<T : Number>(value: T) {
  var value = value
  fun multiply(other: T) : T {
    return (value.toDouble() * other.toDouble()) as T
  }

  fun devide(other: T) : Double {
    return (value.toDouble() / other.toDouble())
  }

  operator fun plus(other: Num<T>) : T {
    return (value.toDouble() + other.value.toDouble()) as T
  }

  operator fun plus(other: Num<Double>) : Double {
    return (value.toDouble() + other.value.toDouble()) as Double
  }

  operator fun plus(other: String) : String {
    return "" + value + other
  }

  operator fun plus(other: Double) : Double {
    return (value.toDouble() + other)
  }

  operator fun plus(other: Car01) : String {
    return "" + value + other.fuel
  }

  operator fun minus(other: Num<T>) : T {
    return (value.toDouble() - other.value.toDouble()) as T
  }

}