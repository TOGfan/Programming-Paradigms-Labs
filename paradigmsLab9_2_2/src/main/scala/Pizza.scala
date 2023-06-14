class Pizza(val cake:Cake,val ingredients:List[Ingredient]) {
  //def
  def getPrice(): Float ={
    var price=cake.getPrice()
    ingredients.foreach(i => price += i.getPrice())
    price
  }
}
