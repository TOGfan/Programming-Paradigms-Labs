class Cake (val name:String,val size:Int){
  val nameId = name match
    case "italian" => 1
    case "standard" => 2
    case "pan pizza" => 3
    case "calzone" => 4
    case _ => 5
  
  def getPrice(): Float = {
    if(nameId==4&&size==3)
      0 
    else{

     val temp= nameId match
      case 1 => 7
      case 2 => 5
      case 3 => 6
      case 4 => 8
      case 5 => 0
      temp*size
    }
  }
}
