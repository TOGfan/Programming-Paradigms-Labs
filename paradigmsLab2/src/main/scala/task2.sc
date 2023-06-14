def arithmetic (first:Float,difference:Float,length:Int):List[Float]={
  if(length>1)
    first::arithmetic(first+difference,difference,length-1)
  else {
    val result=List(first)
    result
  }

}
println(arithmetic(1,2,10))
println(arithmetic(0,0.5f,5))
println(arithmetic(10,10,100))