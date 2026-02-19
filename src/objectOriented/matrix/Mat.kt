package objectOriented.matrix

class Mat (rows: Int, cols: Int) {
   var data = IntArray(rows * cols)

  var rows = rows
  var cols = cols
  constructor(rows: Int, cols: Int, vararg values: Int) : this(rows, cols) {
    data(*values)
  }

  fun data(vararg values: Int) : Mat {
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
}