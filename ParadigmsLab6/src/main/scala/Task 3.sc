
/*
def split(input:LazyList[Int]): (LazyList[Int],LazyList[Int]) ={
  val a=input.partition(_%2==1)
  a
}
*/

def split[T](list: LazyList[T]): (LazyList[T], LazyList[T]) = {
  val li = list.zipWithIndex
  (
    li.filter((_,i) => i%2==0).map((x,_) => x),
    li.filter((_,i) => i%2==1).map((x,_) => x)
  )
}



val a=split (LazyList(5, 6, 3, 2, 1))
a._1.take(3).foreach(println)
a._2.take(3).foreach(println)