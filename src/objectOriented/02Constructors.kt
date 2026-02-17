package objectOriented

fun main() {
  /*
  Constractor یعنی سازنده
  وقتی مینویسیم ()Car به نوعی یک Constractor را صدا کردیم و با استفاده از آن یک Object را ساختیم
  هر کلاس یک Constractor دارد. اگر تعریف نکنیم به از پیشفرض خودش استفاده میکنه ولی با تعریف کردن قابل شخصی سازی هم هست
   */
   val c1 = Car02("C1")
   val c2 = Car02("C2" , 10)

  println("Println instance of ${c1.name}")
  println("Println instance of ${c2.name}")
}