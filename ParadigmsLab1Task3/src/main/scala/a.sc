def a(m:Int,n:Int):Int={
  if(m==0)
    return n+1
  if(n==0)
    return a(m-1,1)
  a(m-1,a(m,n-1))
}
println(a(2,3))
println(a(0,3))
println(a(20,30))