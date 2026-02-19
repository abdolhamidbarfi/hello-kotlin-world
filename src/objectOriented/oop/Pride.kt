package objectOriented.oop

class Pride : Car3() {

  companion object {
    private var count = 0

    fun getCount() = count
  }

  init {
    count ++
    x = 20
    // x = 20 can not set value in intial must be override
    //  test = 5  -> is private
    protectedTestValue = 10
  }

  override val color = "red"

  override fun fill() {
    println("fill")
    super.fill()
  }

}