import scala.annotation.tailrec

@tailrec
def inner(a:List[Int], b:Int):List[Int]={
  if(b<1)return Nil
  if(b==1)return a
  inner(a.head::a,b-1)
}
@tailrec
def multiplicate2(a:List[Int],b:List [Int],result:List[Int]):List[Int]={
  if(a.length==1){
    return result:::inner(List(a.head),b.head)
  }
  multiplicate2(a.tail,b.tail,result:::inner(List(a.head),b.head));
}
def multiplicate(a:List[Int],b:List [Int]):List[Int]=multiplicate2(a:List[Int],b:List [Int],List())
println(multiplicate(List(1, 2, 3),List (0, 3, 1, 4)))