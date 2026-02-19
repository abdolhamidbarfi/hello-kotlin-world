package objectOriented.oop

open class Car3{
  companion object {
    val fuelCapacity = 20

  }

  open val color = "black"

  public var fuel = 0
  var x = 10

  private var test = 2
  protected var protectedTestValue = 5

  open fun fill() {
    fuel = fuelCapacity
  }


}

