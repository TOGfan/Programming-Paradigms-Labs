def multiplicate(a:LazyList[Int],b:LazyList[Int]):LazyList[Int] ={
  a.lazyZip(b).map((a,b)=>List.fill(b)(a)).flatten
}

multiplicate(LazyList(1,2,3),LazyList(0,3,1,4)).foreach(println)//2,2,2,3