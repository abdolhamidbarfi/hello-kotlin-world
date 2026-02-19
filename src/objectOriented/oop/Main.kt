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

}

fun Car3.sample() {
  println("sample")
}