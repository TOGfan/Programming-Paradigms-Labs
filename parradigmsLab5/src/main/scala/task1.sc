import scala.annotation.tailrec

/*
Write the function decoding the list of pairs - the number of occurrences of a given element, element - to the list of these elements.

Pay particular attention to the optimality of computational and memory complexity.


Write a function using tail and non-tail recursion


Example:

calling: decode (List((3, ’a’); (4, ’b’); (1, ’c’)))

result: List(’a’, ’a’, ’a’, ’b’, ’b’, ’b’, ’b’, ’c’)


Points: 3 (Scala language) 1.5 - for tail recursion, 1.5 for non-tail recursion
*/


def inner(input:(Int,Any)):List[Any]={
  if(input._1==1) {
    return List(input._2)
  };
  input._2::inner(input._1-1,input._2)
}
def decode(input:List[(Int,Any)]):List[Any]={
  if(input.length==1) {
    return inner(input.head)
  }
  inner(input.head):::decode(input.tail)
}

@tailrec
def innerTail(input:(Int,Any),result:List[Any]):List[Any]={
  if(input._1==1){
    return input._2::result
  }
  innerTail((input._1-1,input._2),input._2::result)
}
@tailrec
def decodeTail(input:List[(Int,Any)],result:List[Any]):List[Any]={
  if(input.length==1) {
    return result:::innerTail(input.head,List())
  }
  decodeTail(input.tail,result:::innerTail(input.head,List()))
}
println(decode(List((3, 'a'), (4, 'b'), (1, 'c'))))
println(decodeTail(List((3, 'a'), (4, 'b'), (1, 'c')),List()))