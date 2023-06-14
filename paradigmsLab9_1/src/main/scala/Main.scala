object Main {
  def main(args: Array[String]): Unit = {
    var a=Complex(1,2)
    var b=Complex(2,3)
    println(a)
    println(b)
    b=b.multiply(a)
    println(b)
    b=b.divide(a)
    println(b)
    b=b.add(a)
    println(b)
    b=b.subtract(a)
    println(b)
    b=b.conjugate()
    println(b)
  }
}
