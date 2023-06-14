def mantissa(number: Double): Double =
  number-number.toInt
println(mantissa(10.99))
println(mantissa(10))
println(mantissa(0.1))
println(mantissa(0))
println(mantissa(3.5))