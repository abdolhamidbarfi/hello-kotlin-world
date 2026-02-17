package objectOriented

class Car01{

  //متغییری که داخل کلاس تعریف بشه بهش میگیم Field
  private var state : String = "OFF"
  var fuel: Int = 0
    get() = field * 2
    set(value) {
      if (value < 0) {
        println("fuel must be positive integer")
        return
      }
      field = value
    }

  var name: String = "No Name"
  //متغیری که با val تعریف بشه فقط قابل خوندن هست
  val fuelCapacity: Int = 40

  //وقتی یه فانکشن داخل یک کلاس تعریف بشه بهش میگن Method
  fun turnOn() {
    if (fuel <= 0) return
    if (state == "ON") {
      println("${name}: Already turned on")
      return
    }
    println("${name}: Turning on $fuel")
    setState("ON")
  }

  fun turnOff() {
    if (state == "OFF") {
      println("${name}: Already turned off")
      return
    }
    println("${name}: Turning off ")
    setState("OFF")
  }

  fun getState(): String {
    return state
  }

  private fun setState(value: String) {
    state = value
  }
}

class Car02( name: String) {

  var fuel = 0
  var name = name

  init {
    println("Primary Constructor Called ${this.name}")
  }


  constructor(name: String , fuel: Int) : this(name) {
    println("Secondary Constructor Called ${this.name}")
    this.fuel = fuel
    
  }

}


