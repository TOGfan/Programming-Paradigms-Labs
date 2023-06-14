def split[T](list: LazyList[T]): (LazyList[T], LazyList[T]) = {
  val li = list.zipWithIndex
  (
    li.filter((_,i) => i%2==0).map((x,_) => x),
    li.filter((_,i) => i%2==1).map((x,_) => x)
  )
}