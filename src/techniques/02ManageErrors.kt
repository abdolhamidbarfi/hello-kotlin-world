package techniques

fun main() {
  //crate Error
  val a : Int = 3

  try {
    //wrong cast
    val b = a as Long
    println(b)
  } catch (e: NullPointerException) {
    println("Error Null Pointer Exception")
  } catch(e: ClassCastException) {
    println("Error Cast Exception")
  } catch (e: Exception) {
    println("Error")
  } finally {
    println("Finally")
  }


  try {
    sample()
  } catch (e: ClassCastException) {
    println("I handled error")
  }

}

//ایجاد یک تابع دارای خطا و ایجاد کرش در برنامه
//با نوشن @Throws میگیم که این فانکشن ممکنه خطا داشته باشه
@Throws(ClassCastException::class)
fun sample() {
  val a: Int = 1

  val b = a as Long
  println(b)
}