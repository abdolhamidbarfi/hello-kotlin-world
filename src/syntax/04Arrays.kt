package syntax

fun main() {
  val result = getAllPrimitives(8)

  println(result)
}

//Static Array
/*
* arrayOf
* intArrayOf
* floatArrayOf
* doubleArrayOf
* longArrayOf
* shortArrayOf
* byteArrayOf
* booleanArrayOf
*/
fun staticArrays() {
  val a = arrayOf(1, 2, 3)
  val b = intArrayOf(1, 2, 3)
  val c = doubleArrayOf(1.0, 2.0, 3.0)
  val d = longArrayOf(4L, 5L, 6L)
  val e = shortArrayOf(1 , 2, 3)
  val f = floatArrayOf(3.14F, 3.14F, 3.14F)
  val g = byteArrayOf(1, 2, 3)
  val h = booleanArrayOf(true, false, true)

  val collectionOfArray = arrayOf("string", 1, 1.0, 2L, arrayOf(1, 2, 3) , arrayOf("string", 2))
  val cities = arrayOf("Tehran", "Shiraz", "Gorgan", "Kordkuy", "Tabriz")

  println(collectionOfArray.contentToString())
  println(collectionOfArray.contentDeepToString())

  for (city in cities) {
    println(city)
  }
}

//Dynamic Arrays
/*
* listOf ----------> imutable
* mutableListOf ---> mutable
* */
fun mutableArrays() {
  val imutableList = listOf(1, 2, 3)
  val mutableList = mutableListOf(1, 2, 3)

  println(mutableList)
  mutableList.add(4)
  println(mutableList)
  mutableList.remove(3)
  println(mutableList)
  mutableList.removeAt(1)
  println(mutableList)

}

fun getAllPrimitives(n : Int) : MutableList<Int> {
  val result = mutableListOf<Int>()
  for (i in 1..n) {
    result.add(i)
  }
  return result
}