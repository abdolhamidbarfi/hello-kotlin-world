package objectOriented.matrix

fun main() {
val a = Mat(2 , 3 ,
  1,2,3,
          4,5,6
)

  var b = a[2 , 2]
  a[1 , 1] = 4
  var c = a[1 , 1]


  val d = Mat(2 , 3 , -1,1,0,6,-2,-1)
  val e = Mat(2 , 3 , -1,1,0,-6,-2,-2)

  var f = d - e
  var g = d + e
  var h = Mat(2 , 3 , 1, 2 , 3, 4 ,5 ,6 ) * Mat(3, 2, 1, 2, 3, 4, 5, 6)
  var i = d x e

  println(f)
  println()
  println(g)
  println()
  print(h)
  println()
  print(i)

}