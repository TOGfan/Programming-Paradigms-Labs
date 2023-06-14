def lazyFilter(input:LazyList[LazyList[Any]],size:Int):LazyList[LazyList[Any]]={
  input.filter(x => x.take(size).length==size)
}
println(lazyFilter(LazyList(LazyList(1,2,3), LazyList(2,3), LazyList(4.5) ), 3 ))