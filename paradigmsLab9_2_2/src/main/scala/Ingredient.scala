class Ingredient (val name:String, val amount: Int) {
  val nameId= name match
    case "cheese"=>1
    case "blue cheese" => 2
    case "pepperoni" => 3
    case "sausage" => 4
    case "mushrooms" => 5
    case "onion" => 6
    case "hot pepper" =>7
    case _ => 8
  def getPrice():Float = {
    amount * nameId match
      case 1 => 5
      case 2 => 10
      case 3 => 5
      case 4 => 4
      case 5 => 4
      case 6 => 3
      case 7 => 4
  }
}
