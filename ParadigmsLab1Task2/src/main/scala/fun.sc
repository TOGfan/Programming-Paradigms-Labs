import scala.annotation.tailrec

@tailrec def fun(a:Int,b:Int):Int={
  if(b==0)
      return a
  fun (b, a % b)
}
println(fun(2,3))
println(fun(10,0))
println(fun(10,5))
