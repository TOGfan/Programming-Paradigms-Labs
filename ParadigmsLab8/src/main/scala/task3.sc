def oddFunc(k:Int,n:Int): List[Int] ={
  if(k%2==0)
    return oddFunc(k+1,n)
  if(n==0)
    return List()
  k::oddFunc(k+2,n-1)
}
def oddImper(k:Int,n:Int):List[Int]={
  var a=k
  if(a%2==0)
    a+=1
  var i=0
  var result=scala.collection.mutable.ListBuffer.empty[Int]
  while(i<n){
    result+=a
    a+=2
    i+=1
  }
  result.toList
}



println(oddFunc(12,2))
println(oddImper(12,2))