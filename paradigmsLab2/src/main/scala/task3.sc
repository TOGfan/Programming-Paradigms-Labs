def OneD(d:List[List[Int]]):List[List[Int]]={
  val c=(d.head:::d.tail.head)::d.tail.tail
  if(c.length>1)
    return OneD(c)
  else c
}
def reverse(orig:List[Int],target:List[Int]):List[Int]={
  if(orig.length>0)
    reverse(orig.tail,List(orig.head):::target)
  else target
}
def rightToLeft(a:List[List[Int]]):List[Int]=
  reverse(OneD(a).head,List())


println(rightToLeft(List(List(1,2),List(3,4),List(5,6))))
println(rightToLeft(List(List(9,8,7,6),List(5,4,3),List(2,1))))
println(rightToLeft(List(List(110,-1),List(22,4),List(1,1,1,1,1))))