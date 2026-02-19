package objectOriented.matrix

class Mat<T: Number>(rows: Int, cols: Int) {
  private var data = mutableListOf<T>()

  init {
    repeat(rows * cols) {
      data.add(0 as T)
    }
  }

  var rows = rows
  var cols = cols

  constructor(rows: Int, cols: Int, vararg values: T): this(rows, cols) {
    data(*values)
  }

  fun data(vararg values: T): Mat<T> {
    if (values.size != this.data.size) {
      println("Data size mismatch")
      return this
    }

    var index = 0
    for (value in values) {
      data[index] = value
      index++
    }

    return this
  }


  operator fun get(row: Int, col: Int): T {
    return data[(row - 1) * cols + (col - 1)]
  }

  operator fun set(row: Int, col: Int, value: T) {
    data[(row - 1) * cols + (col - 1)] = value
  }

  fun <U: Number, V: Number> plus(other: Mat<U>): Mat<V>? {
    if (rows != other.rows || cols != other.cols) {
      println("dimentions mismatch")
      return null
    }
    val result = Mat<V>(rows, cols)
    for (i in 1..rows) {
      for (j in 1..cols) {
        result[i, j] = (get(i, j).toDouble() + other[i, j].toDouble()) as V
      }
    }
    return result
  }

   fun <U: Number> minus(other: Mat<U>): Mat<T>? {
    if (rows != other.rows || cols != other.cols) {
      println("dimentions mismatch")
      return null
    }
    val result = Mat<T>(rows, cols)
    for (i in 1..rows) {
      for (j in 1..cols) {
        result[i, j] = (get(i, j).toDouble() - other[i, j].toDouble()) as T
      }
    }
    return result
  }

  fun <U: Number , V : Number> times(other: Mat<U>): Mat<V>? {
    if (cols != other.rows) {
      println("dimentions mismatch")
      return null
    }
    val result = Mat<V>(rows, other.cols)

    for (i in 1..rows) {
      for (j in 1..other.cols) {
        var sum = 0.0
        for (k in 1..cols) {
          sum = sum + get(i, k).toDouble() * other[i, k].toDouble()
        }
        result[i, j] = sum as V
      }
    }
    return result
  }

  override fun toString(): String {
    var output = ""
    for (i in 0 until rows) {
      output = output + "|"
      for (j in 0 until cols) {

        var index = i * cols + j
        var cell = data[index]

        output = output + cell
        output = output + " "
      }
      output = output + "|\n"
    }
    return output
  }


  infix fun x(other: Mat<T>): Mat<T>? {
    if (rows != other.rows || cols != other.cols) {
      println("dimentions mismatch")
      return null
    }
    val result = Mat<T>(rows, cols)
    for (i in 1..rows) {
      for (j in 1..cols) {
        result[i, j] = (get(i, j).toDouble() * other[i, j].toDouble()) as T
      }
    }
    return result
  }
}

//@formatter:off
@JvmName("plusIntInt")        operator fun Mat<Int>.plus(other :  Mat<Int>)        :   Mat<Int>?     =   this.plus(other)
@JvmName("plusIntDouble")     operator fun Mat<Int>.plus(other :  Mat<Double>)     :   Mat<Double>?  =   this.plus(other)
@JvmName("plusIntFloat")      operator fun Mat<Int>.plus(other :  Mat<Float>)      :   Mat<Float>?   =   this.plus(other)
@JvmName("plusIntLong")       operator fun Mat<Int>.plus(other :  Mat<Long>)       :   Mat<Long>?    =   this.plus(other)

@JvmName("plusDoubleInt")     operator fun Mat<Double>.plus(other : Mat<Int>)     :   Mat<Double>?  =   this.plus(other)
@JvmName("plusDoubleDouble")  operator fun Mat<Double>.plus(other : Mat<Double>)  :   Mat<Double>?  =   this.plus(other)
@JvmName("plusDoubleFloat")   operator fun Mat<Double>.plus(other : Mat<Float>)   :   Mat<Double>?  =   this.plus(other)
@JvmName("plusDoubleLong")    operator fun Mat<Double>.plus(other : Mat<Long>)    :   Mat<Double>?  =   this.plus(other)

@JvmName("plusFloatInt")      operator fun Mat<Float>.plus(other : Mat<Int>)      :   Mat<Float>?   =   this.plus(other)
@JvmName("plusFloatDouble")   operator fun Mat<Float>.plus(other : Mat<Double>)   :   Mat<Double>?  =   this.plus(other)
@JvmName("plusFloatFloat")    operator fun Mat<Float>.plus(other : Mat<Float>)    :   Mat<Float>?   =   this.plus(other)
@JvmName("plusFloatLong")     operator fun Mat<Float>.plus(other : Mat<Long>)     :   Mat<Long>?    =   this.plus(other)

@JvmName("plusLongInt")       operator fun Mat<Long>.plus(other : Mat<Int>)       :   Mat<Long>?    =   this.plus(other)
@JvmName("plusLongLong")      operator fun Mat<Long>.plus(other : Mat<Long>)      :   Mat<Long>?    =   this.plus(other)
@JvmName("plusLongDouble")    operator fun Mat<Long>.plus(other : Mat<Double>)    :   Mat<Double>?  =   this.plus(other)
@JvmName("plusLongFloat")     operator fun Mat<Long>.plus(other : Mat<Float>)     :   Mat<Long>?    =   this.plus(other)
//@formatter:on

//@formatter:off
@JvmName("plusIntInt")        operator fun Mat<Int>.minus(other :  Mat<Int>)        :   Mat<Int>?     =   this.plus(other)
@JvmName("plusIntDouble")     operator fun Mat<Int>.minus(other :  Mat<Double>)     :   Mat<Double>?  =   this.plus(other)
@JvmName("plusIntFloat")      operator fun Mat<Int>.minus(other :  Mat<Float>)      :   Mat<Float>?   =   this.plus(other)
@JvmName("plusIntLong")       operator fun Mat<Int>.minus(other :  Mat<Long>)       :   Mat<Long>?    =   this.plus(other)

@JvmName("plusDoubleInt")     operator fun Mat<Double>.minus(other : Mat<Int>)     :   Mat<Double>?  =   this.plus(other)
@JvmName("plusDoubleDouble")  operator fun Mat<Double>.minus(other : Mat<Double>)  :   Mat<Double>?  =   this.plus(other)
@JvmName("plusDoubleFloat")   operator fun Mat<Double>.minus(other : Mat<Float>)   :   Mat<Double>?  =   this.plus(other)
@JvmName("plusDoubleLong")    operator fun Mat<Double>.minus(other : Mat<Long>)    :   Mat<Double>?  =   this.plus(other)

@JvmName("plusFloatInt")      operator fun Mat<Float>.minus(other : Mat<Int>)      :   Mat<Float>?   =   this.plus(other)
@JvmName("plusFloatDouble")   operator fun Mat<Float>.minus(other : Mat<Double>)   :   Mat<Double>?  =   this.plus(other)
@JvmName("plusFloatFloat")    operator fun Mat<Float>.minus(other : Mat<Float>)    :   Mat<Float>?   =   this.plus(other)
@JvmName("plusFloatLong")     operator fun Mat<Float>.minus(other : Mat<Long>)     :   Mat<Long>?    =   this.plus(other)

@JvmName("plusLongInt")       operator fun Mat<Long>.minus(other : Mat<Int>)       :   Mat<Long>?    =   this.plus(other)
@JvmName("plusLongLong")      operator fun Mat<Long>.minus(other : Mat<Long>)      :   Mat<Long>?    =   this.plus(other)
@JvmName("plusLongDouble")    operator fun Mat<Long>.minus(other : Mat<Double>)    :   Mat<Double>?  =   this.plus(other)
@JvmName("plusLongFloat")     operator fun Mat<Long>.minus(other : Mat<Float>)     :   Mat<Long>?    =   this.plus(other)
//@formatter:on

//@formatter:off
@JvmName("plusIntInt")        operator fun Mat<Int>.times(other :  Mat<Int>)        :   Mat<Int>?     =   this.plus(other)
@JvmName("plusIntDouble")     operator fun Mat<Int>.times(other :  Mat<Double>)     :   Mat<Double>?  =   this.plus(other)
@JvmName("plusIntFloat")      operator fun Mat<Int>.times(other :  Mat<Float>)      :   Mat<Float>?   =   this.plus(other)
@JvmName("plusIntLong")       operator fun Mat<Int>.times(other :  Mat<Long>)       :   Mat<Long>?    =   this.plus(other)

@JvmName("plusDoubleInt")     operator fun Mat<Double>.times(other : Mat<Int>)     :   Mat<Double>?  =   this.plus(other)
@JvmName("plusDoubleDouble")  operator fun Mat<Double>.times(other : Mat<Double>)  :   Mat<Double>?  =   this.plus(other)
@JvmName("plusDoubleFloat")   operator fun Mat<Double>.times(other : Mat<Float>)   :   Mat<Double>?  =   this.plus(other)
@JvmName("plusDoubleLong")    operator fun Mat<Double>.times(other : Mat<Long>)    :   Mat<Double>?  =   this.plus(other)

@JvmName("plusFloatInt")      operator fun Mat<Float>.times(other : Mat<Int>)      :   Mat<Float>?   =   this.plus(other)
@JvmName("plusFloatDouble")   operator fun Mat<Float>.times(other : Mat<Double>)   :   Mat<Double>?  =   this.plus(other)
@JvmName("plusFloatFloat")    operator fun Mat<Float>.times(other : Mat<Float>)    :   Mat<Float>?   =   this.plus(other)
@JvmName("plusFloatLong")     operator fun Mat<Float>.times(other : Mat<Long>)     :   Mat<Long>?    =   this.plus(other)

@JvmName("plusLongInt")       operator fun Mat<Long>.times(other : Mat<Int>)       :   Mat<Long>?    =   this.plus(other)
@JvmName("plusLongLong")      operator fun Mat<Long>.times(other : Mat<Long>)      :   Mat<Long>?    =   this.plus(other)
@JvmName("plusLongDouble")    operator fun Mat<Long>.times(other : Mat<Double>)    :   Mat<Double>?  =   this.plus(other)
@JvmName("plusLongFloat")     operator fun Mat<Long>.times(other : Mat<Float>)     :   Mat<Long>?    =   this.plus(other)
//@formatter:on