
def inner1(result:List[String], recur:List[String]):List[String]={
  if(recur.length==0)
    return result
  inner1(result:::List("0"+recur.head),recur.tail)
}

def inner2(result:List[String], recur:List[String]):List[String]={
  if (recur.length == 0)
    return result
  inner2(result:::List("1"+recur.last),recur.take(recur.length-1))
}

def gray(n: Int): List[String] = {
  if (n <= 0) {
    return List("0")
  }
  if (n == 1) {
    return List("0","1")
  }
  val recur:List[String] = gray(n - 1)
  var mainAns:List[String] = List()
  mainAns=inner1(mainAns,recur)
  mainAns=inner2(mainAns,recur)
  mainAns
}

println(gray(3))