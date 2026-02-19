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

  fun <U: Number, V: Number> plusCore(other: Mat<U>): Mat<V>? {
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


  fun <U: Number, V: Number> minusCore(other: Mat<U>): Mat<V>? {
    if (rows != other.rows || cols != other.cols) {
      println("dimentions mismatch")
      return null
    }
    val result = Mat<V>(rows, cols)
    for (i in 1..rows) {
      for (j in 1..cols) {
        result[i, j] = (get(i, j).toDouble() - other[i, j].toDouble()) as V
      }
    }
    return result
  }

  fun <U: Number , V : Number> timesCore(other: Mat<U>): Mat<V>? {
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



  infix fun<U: Number, V: Number> xCore(other: Mat<U>): Mat<V>? {
    if (rows != other.rows || cols != other.cols) {
      println("dimentions mismatch")
      return null
    }
    val result = Mat<V>(rows, cols)
    for (i in 1..rows) {
      for (j in 1..cols) {
        result[i, j] = (get(i, j).toDouble() * other[i, j].toDouble()) as V
      }
    }
    return result
  }
}

//@formatter:off
@JvmName("plusIntInt")        operator fun Mat<Int>.plus(other :  Mat<Int>)        :   Mat<Int>?     =   this.plusCore(other)
@JvmName("plusIntDouble")     operator fun Mat<Int>.plus(other :  Mat<Double>)     :   Mat<Double>?  =   this.plusCore(other)
@JvmName("plusIntFloat")      operator fun Mat<Int>.plus(other :  Mat<Float>)      :   Mat<Float>?   =   this.plusCore(other)
@JvmName("plusIntLong")       operator fun Mat<Int>.plus(other :  Mat<Long>)       :   Mat<Long>?    =   this.plusCore(other)

@JvmName("plusDoubleInt")     operator fun Mat<Double>.plus(other : Mat<Int>)     :   Mat<Double>?  =   this.plusCore(other)
@JvmName("plusDoubleDouble")  operator fun Mat<Double>.plus(other : Mat<Double>)  :   Mat<Double>?  =   this.plusCore(other)
@JvmName("plusDoubleFloat")   operator fun Mat<Double>.plus(other : Mat<Float>)   :   Mat<Double>?  =   this.plusCore(other)
@JvmName("plusDoubleLong")    operator fun Mat<Double>.plus(other : Mat<Long>)    :   Mat<Double>?  =   this.plusCore(other)

@JvmName("plusFloatInt")      operator fun Mat<Float>.plus(other : Mat<Int>)      :   Mat<Float>?   =   this.plusCore(other)
@JvmName("plusFloatDouble")   operator fun Mat<Float>.plus(other : Mat<Double>)   :   Mat<Double>?  =   this.plusCore(other)
@JvmName("plusFloatFloat")    operator fun Mat<Float>.plus(other : Mat<Float>)    :   Mat<Float>?   =   this.plusCore(other)
@JvmName("plusFloatLong")     operator fun Mat<Float>.plus(other : Mat<Long>)     :   Mat<Long>?    =   this.plusCore(other)

@JvmName("plusLongInt")       operator fun Mat<Long>.plus(other : Mat<Int>)       :   Mat<Long>?    =   this.plusCore(other)
@JvmName("plusLongLong")      operator fun Mat<Long>.plus(other : Mat<Long>)      :   Mat<Long>?    =   this.plusCore(other)
@JvmName("plusLongDouble")    operator fun Mat<Long>.plus(other : Mat<Double>)    :   Mat<Double>?  =   this.plusCore(other)
@JvmName("plusLongFloat")     operator fun Mat<Long>.plus(other : Mat<Float>)     :   Mat<Long>?    =   this.plusCore(other)



@JvmName("minusIntInt")        operator fun Mat<Int>.minus(other :  Mat<Int>)        :   Mat<Int>?     =  this.minusCore(other)
@JvmName("minusIntDouble")     operator fun Mat<Int>.minus(other :  Mat<Double>)     :   Mat<Double>?  =  this.minusCore(other)
@JvmName("minusIntFloat")      operator fun Mat<Int>.minus(other :  Mat<Float>)      :   Mat<Float>?   =  this.minusCore(other)
@JvmName("minusIntLong")       operator fun Mat<Int>.minus(other :  Mat<Long>)       :   Mat<Long>?    =  this.minusCore(other)

@JvmName("minusDoubleInt")     operator fun Mat<Double>.minus(other : Mat<Int>)     :   Mat<Double>?  =   this.minusCore(other)
@JvmName("minusDoubleDouble")  operator fun Mat<Double>.minus(other : Mat<Double>)  :   Mat<Double>?  =   this.minusCore(other)
@JvmName("minusDoubleFloat")   operator fun Mat<Double>.minus(other : Mat<Float>)   :   Mat<Double>?  =   this.minusCore(other)
@JvmName("minusDoubleLong")    operator fun Mat<Double>.minus(other : Mat<Long>)    :   Mat<Double>?  =   this.minusCore(other)

@JvmName("minusFloatInt")      operator fun Mat<Float>.minus(other : Mat<Int>)      :   Mat<Float>?   =   this.minusCore(other)
@JvmName("minusFloatDouble")   operator fun Mat<Float>.minus(other : Mat<Double>)   :   Mat<Double>?  =   this.minusCore(other)
@JvmName("minusFloatFloat")    operator fun Mat<Float>.minus(other : Mat<Float>)    :   Mat<Float>?   =   this.minusCore(other)
@JvmName("minusFloatLong")     operator fun Mat<Float>.minus(other : Mat<Long>)     :   Mat<Long>?    =   this.minusCore(other)

@JvmName("minusLongInt")       operator fun Mat<Long>.minus(other : Mat<Int>)       :   Mat<Long>?    =   this.minusCore(other)
@JvmName("minusLongLong")      operator fun Mat<Long>.minus(other : Mat<Long>)      :   Mat<Long>?    =   this.minusCore(other)
@JvmName("minusLongDouble")    operator fun Mat<Long>.minus(other : Mat<Double>)    :   Mat<Long>?  =   this.minusCore(other)
@JvmName("minusLongFloat")     operator fun Mat<Long>.minus(other : Mat<Float>)     :   Mat<Long>?    =   this.minusCore(other)



@JvmName("timesIntInt")        operator fun Mat<Int>.times(other :  Mat<Int>)        :   Mat<Int>?     =   this.timesCore(other)
@JvmName("timesIntDouble")     operator fun Mat<Int>.times(other :  Mat<Double>)     :   Mat<Double>?  =   this.timesCore(other)
@JvmName("timesIntFloat")      operator fun Mat<Int>.times(other :  Mat<Float>)      :   Mat<Float>?   =   this.timesCore(other)
@JvmName("timesIntLong")       operator fun Mat<Int>.times(other :  Mat<Long>)       :   Mat<Long>?    =   this.timesCore(other)

@JvmName("timesDoubleInt")     operator fun Mat<Double>.times(other : Mat<Int>)     :   Mat<Double>?  =   this.timesCore(other)
@JvmName("timesDoubleDouble")  operator fun Mat<Double>.times(other : Mat<Double>)  :   Mat<Double>?  =   this.timesCore(other)
@JvmName("timesDoubleFloat")   operator fun Mat<Double>.times(other : Mat<Float>)   :   Mat<Double>?  =   this.timesCore(other)
@JvmName("timesDoubleLong")    operator fun Mat<Double>.times(other : Mat<Long>)    :   Mat<Double>?  =   this.timesCore(other)

@JvmName("timesFloatInt")      operator fun Mat<Float>.times(other : Mat<Int>)      :   Mat<Float>?   =   this.timesCore(other)
@JvmName("timesFloatDouble")   operator fun Mat<Float>.times(other : Mat<Double>)   :   Mat<Double>?  =   this.timesCore(other)
@JvmName("timesFloatFloat")    operator fun Mat<Float>.times(other : Mat<Float>)    :   Mat<Float>?   =   this.timesCore(other)
@JvmName("timesFloatLong")     operator fun Mat<Float>.times(other : Mat<Long>)     :   Mat<Long>?    =   this.timesCore(other)

@JvmName("timesLongInt")       operator fun Mat<Long>.times(other : Mat<Int>)       :   Mat<Long>?    =   this.timesCore(other)
@JvmName("timesLongLong")      operator fun Mat<Long>.times(other : Mat<Long>)      :   Mat<Long>?    =   this.timesCore(other)
@JvmName("timesLongDouble")    operator fun Mat<Long>.times(other : Mat<Double>)    :   Mat<Double>?  =   this.timesCore(other)
@JvmName("timesLongFloat")     operator fun Mat<Long>.times(other : Mat<Float>)     :   Mat<Long>?    =   this.timesCore(other)



@JvmName("xIntInt")        infix fun Mat<Int>.x(other :  Mat<Int>)        :   Mat<Int>?     =   this.xCore(other)
@JvmName("xIntDouble")     infix fun Mat<Int>.x(other :  Mat<Double>)     :   Mat<Double>?  =   this.xCore(other)
@JvmName("xIntFloat")      infix fun Mat<Int>.x(other :  Mat<Float>)      :   Mat<Float>?   =   this.xCore(other)
@JvmName("xIntLong")       infix fun Mat<Int>.x(other :  Mat<Long>)       :   Mat<Long>?    =   this.xCore(other)

@JvmName("xDoubleInt")     infix fun Mat<Double>.x(other : Mat<Int>)     :   Mat<Double>?  =   this.xCore(other)
@JvmName("xDoubleDouble")  infix fun Mat<Double>.x(other : Mat<Double>)  :   Mat<Double>?  =   this.xCore(other)
@JvmName("xDoubleFloat")   infix fun Mat<Double>.x(other : Mat<Float>)   :   Mat<Double>?  =   this.xCore(other)
@JvmName("xDoubleLong")    infix fun Mat<Double>.x(other : Mat<Long>)    :   Mat<Double>?  =   this.xCore(other)

@JvmName("xFloatInt")      infix fun Mat<Float>.x(other : Mat<Int>)      :   Mat<Float>?   =   this.xCore(other)
@JvmName("xFloatDouble")   infix fun Mat<Float>.x(other : Mat<Double>)   :   Mat<Double>?  =   this.xCore(other)
@JvmName("xFloatFloat")    infix fun Mat<Float>.x(other : Mat<Float>)    :   Mat<Float>?   =   this.xCore(other)
@JvmName("xFloatLong")     infix fun Mat<Float>.x(other : Mat<Long>)     :   Mat<Long>?    =   this.xCore(other)

@JvmName("xLongInt")       infix fun Mat<Long>.x(other : Mat<Int>)       :   Mat<Long>?    =   this.xCore(other)
@JvmName("xLongLong")      infix fun Mat<Long>.x(other : Mat<Long>)      :   Mat<Long>?    =   this.xCore(other)
@JvmName("xLongDouble")    infix fun Mat<Long>.x(other : Mat<Double>)    :   Mat<Double>?  =   this.xCore(other)
@JvmName("xLongFloat")     infix fun Mat<Long>.x(other : Mat<Float>)     :   Mat<Long>?    =   this.xCore(other)
//@formatter:on