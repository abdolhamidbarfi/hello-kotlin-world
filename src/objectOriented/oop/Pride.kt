package objectOriented.oop

class Pride : Car3() {

  init {
    x = 20
    // x = 20 can not set value in intial must be override
    //  test = 5  -> is private
    protectedTestValue = 10
  }
  override val fuelCapacity = 35

  override fun fill() {
    println("fill")
    super.fill()
  }

}