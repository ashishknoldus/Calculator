package com.firstApp
import scala.math.pow

class Calculation {
  //Add
  def +(a: Int, b: Int): Int = a + b
  //Subtract
  def -(a: Int, b: Int): Int = a - b
  //Multiplication
  def *(a: Int, b: Int): Long = a * b
  //Division
  def /(a: Int, b: Int): Int = {
    require(b != 0, "denominator can not be 0")
    a / b
  }
  //  Power
  //  Absolute
  //  Modulus
  //  Maximum of Two
  //  Minimum of Two

}
object Calculator
{
  implicit class PowerInt(i: Int) {
    def ** (n: Int): Int = pow(i, n).intValue
  }
  def main(args: Array[String]) =
  {
    val calc = new Calculation()

    println("Addition: " + calc.+(10, 2))
    println("Subtraction: " + calc.-(10, 2))
    println("Multiplication: " + calc.*(10, 2))
    println("Division: " + calc./(10, 2))
    println("Power: " + 10**2)


    //println("Division: " + calc./(10, 0))
  }
}