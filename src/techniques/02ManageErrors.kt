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
  }catch (e: Exception) {
    println("Error")
  } finally {
    println("Finally")
  }
}