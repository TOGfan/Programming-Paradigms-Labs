def mergeFunc[T](list1:List[T],list2:List[T]): List[T] ={
  if(list1.isEmpty){
    return list2
  }else if(list2.isEmpty){
    return list1
  }
  return list1.head::list2.head::mergeFunc(list1.tail,list2.tail)
}
def mergeImper[T](list1:List[T],list2:List[T]): List[T] ={
  var i1=0
  var i2=0
  val result=scala.collection.mutable.ListBuffer.empty[T]
  while(i1<list1.length||i2<list2.length){
    if(i1<list1.length){
      result+=list1.apply(i1)
      i1=i1+1
    }
    if(i2<list2.length) {
      result += list1.apply(i2)
      i2 = i2 + 1
    }
  }
  result.toList
}
println(mergeFunc(List(1, 3, 5, 7, 9, 11) ,List(2, 4, 6, 8)))
println(mergeImper(List(1, 3, 5, 7, 9, 11) ,List(2, 4, 6, 8)))
