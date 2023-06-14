import scala.io.StdIn.readLine

object Main {
  def ingredientsRec():List[Ingredient]={
    val name:String=readLine()
    if(name=="end"){
      return List()
    }
    val amount:Int=readLine().toInt
    new Ingredient(name, amount)::ingredientsRec()
  }
  def main(args: Array[String]): Unit = {
    println("Choose the dough type:")
    val dough:String=readLine()
    println("Choose the size (number 1 to 3)")
    val size=readLine().toInt
    println("Choose your ingredients and in the next line their amount (1 - 3) and write 'end' when you're finished:")
    val pizza=Pizza(Cake(dough,size),ingredientsRec())
    println("The price of resulting pizza is:")
    println(pizza.getPrice())
  }
}
