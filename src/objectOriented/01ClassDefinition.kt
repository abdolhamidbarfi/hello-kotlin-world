package objectOriented

fun main() {

  val c1 = Car01()
  val c2 = Car01()
  val c3 = Car01()

  c1.name = "C1"
  c2.name = "C2"
  c3.name = "C3"

  c1.fuel = 20
  c2.fuel = 10
  c3.fuel = 5

  // c1.fuelCapacity = 10 ---> val in classes just read-only

  c1.turnOn()
  c2.turnOn()
  c3.turnOn()
  c1.turnOn()

  // c1.state ---> state is private, can not access
  c1.getState()
  c2.getState()
  c3.getState()

  //c1.setState("ON") ---> setState is private, can not access
  c1.turnOff()
  c1.turnOff()



}