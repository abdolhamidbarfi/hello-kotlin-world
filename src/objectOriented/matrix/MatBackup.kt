package objectOriented.matrix

class MatBackup (rows: Int, cols: Int) {
   private var data = IntArray(rows * cols)

  var rows = rows
  var cols = cols
  constructor(rows: Int, cols: Int, vararg values: Int) : this(rows, cols) {
    data(*values)
  }

  fun data(vararg values: Int) : MatBackup {
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


  operator fun get( row: Int, col: Int) : Int{
    return data[(row -1 ) * cols + (col - 1)]
  }

  operator fun set ( row: Int, col: Int , value: Int) {
     data[(row -1 ) * cols + (col - 1)] = value
  }

  operator fun plus (other : MatBackup ) : MatBackup? {
    if (rows != other.rows || cols != other.cols) {
      println("dimentions mismatch")
      return null
    }
    val result = MatBackup(rows, cols)
    for (i in 1..rows) {
      for (j in 1..cols) {
        result[i , j] = get(i , j) +  other[i , j]
      }
    }
    return result
  }

  operator fun minus(other: MatBackup) : MatBackup? {
    if (rows != other.rows || cols != other.cols) {
      println("dimentions mismatch")
      return null
    }
    val result = MatBackup(rows, cols)
    for(i in 1..rows) {
      for (j in 1..cols) {
        result[i , j] = get(i , j) - other[i , j]
      }
    }
    return result
  }

  operator fun times(other: MatBackup) : MatBackup? {
    if (cols != other.rows) {
      println("dimentions mismatch")
      return null
    }
    val result = MatBackup(rows, other.cols)

    for (i in 1..rows) {
      for (j in 1..other.cols) {
        var sum = 0
        for (k in 1..cols) {
          sum = sum + get(i, k) * other[i, k]
        }
        result[i , j] = sum
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



  infix fun x(other: MatBackup): MatBackup? {
    if (rows != other.rows || cols != other.cols) {
      println("dimentions mismatch")
      return null
    }
    val result = MatBackup(rows, cols)
    for (i in 1..rows) {
      for (j in 1..cols) {
        result[i , j] = get(i , j) *  other[i , j]
      }
    }
    return result
  }
}