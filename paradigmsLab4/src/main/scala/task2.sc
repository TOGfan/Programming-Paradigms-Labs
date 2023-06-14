import scala.annotation.tailrec

@tailrec
def addSubstractRec(list: List[Int]):Int={
  if(list.length==1){
    return list(0)
  }
  var temp=0
  if(list.length%2==0){
    temp=list.head+list.tail.head
  }
  else{
    temp=list.head-list.tail.head
  }
  addSubstractRec(temp::list.tail.tail)
}
def addSubstract(list: List[Int]):Int={
  if(list.length==0)
    return 0
  if(list.length%2==0){
    addSubstractRec(list)
  }else{
    addSubstractRec(list:::List(0))
  }
}
println(addSubstract(List(1, 2,3,4, 5)))
println(addSubstract(List(1, 2,3,4)))
println(addSubstract(List(1, 2,3,4, 5,6)))
println(addSubstract(List(1, 2,3,4, 5,6,7)))