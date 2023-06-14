class Complex(val real:Double,val imaginary:Double) {
  def add(a:Complex): Complex ={
    val newReal = this.real + a.real
    val newImaginary = this.imaginary + a.imaginary
    Complex(newReal, newImaginary)
  }
  def subtract(a:Complex): Complex ={

    val newReal = this.real - a.real
    val newImaginary = this.imaginary - a.imaginary
    Complex(newReal,newImaginary)
  }

  def multiply(a: Complex): Complex = {
    val newReal = this.real*a.real-this.imaginary*a.imaginary
    val newImaginary =  this.real*a.imaginary+this.imaginary*a.real
    Complex(newReal,newImaginary)
  }

  def divide(a: Complex): Complex = {
    val temp=a.real*a.real+a.imaginary*a.imaginary
    val newReal = (this.real * a.real + this.imaginary * a.imaginary)/temp
    val newImaginary = (this.imaginary * a.real - this.real * a.imaginary)/temp
    Complex(newReal,newImaginary)
  }
  def conjugate(): Complex ={
    Complex(this.real,0-this.imaginary)
  }
  def isEqualTo(a:Complex):Boolean={
    this.real==a.real&&this.imaginary==a.imaginary
  }

  override def toString: String = {
    if(this.imaginary>0){
      s"$real + $imaginary * i"
    }else if(this.imaginary!=0){
      s"$real - ${-imaginary} * i"
    }else{
      s"$this.real"
    }
  }
}
