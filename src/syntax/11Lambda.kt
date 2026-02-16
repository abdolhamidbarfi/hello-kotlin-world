
fun main() {
  for (i in 1..10) {
    println(i)
  }

  count0To10 ({
    println(it)
  })

  count(1 , 10) {
    println(it)
  }

//  for (i in 1..10  ) {
//    for (j in 1..10 ) {
//      println(String.format("%-3d", i * j))
//    }
//  }

  multiplyTableUsingLambda(10 , { i , j ->
    print(String.format("%-3d", i * j))
  } , {
    println()
  })
}
fun count0To10(block: (Int)  -> Unit) {
  for (i in 0..10) {
    block(i)
  }
}

fun count(start: Int, to: Int, block: (Int) -> Unit) {
  for ( i in start..to) {
    block(i)
  }
}
fun multiplyTableUsingLambda(to: Int, block: (Int , Int) -> Unit , afterFirstIteraion: () -> Unit) {
  for (i in 1..to  ) {
    for (j in 1..to ) {
      block(i , j)
    }
    afterFirstIteraion()
  }
  println()

  connect("http://sampleaddress.com" , skipSSL = true, onSucces = {
    println("Connected")
  },
    onFail = {
      println("Fail with error code $it")
    })

}

private fun connect(url: String, port: Int = 21, timeout: Int = 3000 , skipSSL: Boolean = false , canRedirect: Boolean = true, onSucces: () -> Unit = {}, onFail: (Int) -> Unit = {}) : Boolean  {
  var result = -1
  if (result < 0) {
    onFail(result)
  } else {
    onSucces()
  }
  return true
}

fun someLambdaFunctions() {
  val a : Int
  val b : (Int) -> Int
  val c : (Int , Double) -> Unit
  val d : () -> Boolean
  val e : () -> Unit

  a = 2
  b = {
      some -> some * 2
  }
  c = {
      i , d -> println(i + d)
  }
  d = { false }

  e = {
    println("Hello World")
  }

  e()
  c(2 , 4.0)
}

private fun sample(block : (Int , Double) -> Unit) {

}


