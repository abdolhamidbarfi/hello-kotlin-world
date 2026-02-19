package objectOriented.oop

fun main(args: Array<String>) {
  val car1 = Car3()
  println("car1.fuel: ${car1.fuel}")
  car1.fuel = 10
  println("car1.fuel: ${car1.fuel}")
  car1.fill()
  println("car1.fuel: ${car1.fuel}")
  
  var car2 = Pride()
  println("car2.fuel: ${car2.fuel}")
  car2.fuel = 20
  println("car2.fuel: ${car2.fuel}")
  car2.fill()
  println("car2.fuel: ${car2.fuel}")

  //car1.test --> can not access, is private
//  car1.protectedTestValue = 10 ---> can not access, is protected
}