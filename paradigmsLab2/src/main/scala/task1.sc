def xor(a:Boolean,b:Boolean)={
  (a,b) match {
    case (true,true) => false
    case (true,false) => true
    case (false,true) => true
    case (false,false) => false
  }
}
println(xor(false,false))
println(xor(true,false))
println(xor(true,true))
println(xor(false,true))