package objectOriented.oop

open class Car3{
  public var fuel = 0
  open val fuelCapacity = 20
  var x = 10

  private var test = 2
  protected var protectedTestValue = 5

  open fun fill() {
    fuel = fuelCapacity
  }
}