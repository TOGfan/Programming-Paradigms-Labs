
def odd(k:Int): LazyList[Int] ={
  var odds:LazyList[Int]=null
  if(k%2==0){
    odds=LazyList.cons(k+1,odd(k+2))
  }
  else{
    odds=LazyList.cons(k,odd(k+2))
  }
  odds
}
val odds=odd(12)
println(odds.take(1))
println(odds.apply(0))