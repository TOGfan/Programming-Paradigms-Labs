def splitFunc[T](list: List[T]): (List[T], List[T]) = {
  if(list.isEmpty){
      return (Nil,Nil)
  }
  val result=splitFunc(list.tail)
  if(list.length%2==1){
    (list.head::result._1,result._2)
  }
  else{
    (result._1,list.head::result._2)
  }
}
def splitImper[T](list: List[T]): (List[T], List[T]) = {
  var arr1=scala.collection.mutable.ListBuffer.empty[T]
  var arr2=scala.collection.mutable.ListBuffer.empty[T]
  var evenIndex=true
  for(n<-list){
    if(evenIndex){
      arr1+=n
    }else {
      arr2+=n
    }
    evenIndex=(!evenIndex)
  }
  (arr1.toList,arr2.toList)
}
println(splitFunc(List(5, 6, 3, 2, 1)))
println(splitImper(List(5, 6, 3, 2, 1)))