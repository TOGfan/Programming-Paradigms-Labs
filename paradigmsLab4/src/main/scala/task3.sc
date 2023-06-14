import scala.annotation.tailrec

def combine(a:List[Int],b:List[Int]): List[Int] ={
  if(a.isEmpty)
    return b
  else if (b.isEmpty)
    return a
  a.head+b.head::combine(a.tail,b.tail)
}
@tailrec
def combineTail(a:List[Int],b:List[Int],result:List[Int]): List[Int]={
  if (a.isEmpty)
    return result:::b
  else if (b.isEmpty)
    return result:::a
  combineTail(a.tail, b.tail,result:::List(a.head+b.head))
}
println(combine(List(5, 4, 3, 2), List(1, 2, 3, 4, 5, 6)))
println(combine(List(1, 2, 3, 4,5,6), List(1, 2, 3, 4, 5, 6)))
println(combine(List(0, 0, 0, 0,0,0,0), List(1, 2, 3, 4, 5, 6)))
println(combineTail(List(5, 4, 3, 2), List(1, 2, 3, 4, 5, 6),List()))
println(combineTail(List(1, 2, 3, 4,5,6), List(1, 2, 3, 4, 5, 6),List()))
println(combineTail(List(0, 0, 0, 0,0,0,0), List(1, 2, 3, 4, 5, 6),List()))