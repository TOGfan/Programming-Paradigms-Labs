import scala.annotation.tailrec

def recur(list:List[Int],offset:Int):List[Int]={
  if(list.length==0)
      return List()
  if(offset>0){
    return recur(list.tail,offset-1)
  }
  list.head::recur(list.tail,2)
}
def divide(input:List[Int]):(List[Int],List[Int],List[Int])= {
  return (recur(input,0),recur(input,1),recur(input,2))
}

@tailrec
def tailRecur(list:List[Int],result:List[Int]):List[Int]={
  if(list.length<=3)
    return result:::List(list.head)
  tailRecur(list.tail.tail.tail,result:::List(list.head))
}
def divideTail(input:List[Int]):(List[Int],List[Int],List[Int])= {
  if(input.length<3){
    if(input.length<2){
      return (input,List(),List())
    }
    return (List(input.head),input.tail,List())
  }
  (tailRecur(input,List()),tailRecur(input.tail,List()),tailRecur(input.tail.tail,List()))
}
println(divide(List(1,2,3,4,5,6,7,8,9,10,11,12,13)))
println(divide(List(11,2,30,-3,0,5)))
println(divide(List(1)))
println(divideTail(List(1,2,3,4,5,6,7,8,9,10,11,12,13)))
println(divideTail(List(11,2,30,-3,0,5)))
println(divideTail(List(1)))