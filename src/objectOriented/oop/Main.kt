package objectOriented.oop

fun main(args: Array<String>) {
  val car1 = Car3()
  println("car1.fuel: ${car1.fuel}")
  car1.fuel = 10
  println("car1.fuel: ${car1.fuel}")
  car1.fill()
  println("car1.fuel: ${car1.fuel}")
  println()
  // car1.fuelCapacity --> can not access in instance, is companion object
  var feul = Car3.fuelCapacity
  println("feul: $feul")
  // Pride.fuelCapacity --> does not exist
  println()
  var car2 = Pride()
  println("car2.fuel: ${car2.fuel}")
  car2.fuel = 20
  println("car2.fuel: ${car2.fuel}")
  car2.fill()
  println("car2.fuel: ${car2.fuel}")

  //car1.test --> can not access, is private
//  car1.protectedTestValue = 10 ---> can not access, is protected

  println("Pride.count  ${Pride.getCount()}")
  val pride1 = Pride()
  val pride2 = Pride()
  val pride3 = Pride()
  println("Pride.count  ${Pride.getCount()}")

  car1.sample()
  pride1.sample()
  pride2.sample()

  Car3.staticSample()
//  Pride.staticSample() --> we dont access

  var p1 = Person(name = "Mike", age = 10, isMale = true , lastName = "Zanjani")

  var p2 = p1.copy(
    name = "Samuel",
    age = 20,
  )

  println(p1)
  println(p2)

  p1.sayHello()
  p2.sayHello()

  p1.sayHello2()
  p2.sayHello2()
}

fun Car3.sample() {
  println("sample")
}

fun Car3.Companion.staticSample() {
  println("static sample from companion")
}

