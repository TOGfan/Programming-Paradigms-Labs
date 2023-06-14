sealed trait Tree[+T]
case object Leaf extends Tree[Nothing]
case class Branch[T](value: T, left: Tree[T], right: Tree[T]) extends Tree[T]

def min(a:Int,b:Int): Int ={
  if(a<b)
    a
  else
    b
}
def max(a:Int,b:Int): Int ={
  if(a>b)
    a
  else
    b
}

def maxmin(input:Tree[Int]): (Int,Int) ={
  input match{
    case Branch(value, left, right) =>
      if(left!=Leaf&&right!=Leaf) {
        val lResult = maxmin(left)
        val rResult = maxmin(right)
        val Result = (min(lResult._1,rResult._1),max(lResult._2,rResult._2))
        (min(Result._1,value),max(Result._2,value))
      }
      else if(right==Leaf) {
        val Result = maxmin(left)
        (min(Result._1,value),max(Result._2,value))
      }
      else{
        val Result=maxmin(right)
        (min(Result._1,value),max(Result._2,value))
      }
    case Leaf => return(Int.MaxValue,Int.MinValue)
  }
}




println(maxmin(Branch(2,Branch(3, Leaf, Leaf), Branch(4, Leaf, Branch(5, Leaf, Leaf)))))