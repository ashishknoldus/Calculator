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
  def power(x: Int, n: Int): Long = {
    if (n >= 1)
      x * power(x, n-1)
    else 1
  }
  //  Absolute
  def absolute(a: Double):Double = a.abs
  //  Modulus
  def %(a: Int, b: Int): Int = a % b
  //  Maximum of Two
  def >(a: Int, b: Int): Int = {
    if (a>b) a
    else  b
  }
  //  Minimum of Two
  def <(a: Int, b: Int): Int = {
    if (a<b)  a
    else  b
  }
}
object Calculator
{
  implicit class PowerInt(i: Int) {
    def ** (n: Int): Int = pow(i, n).intValue
  }
  def main(args: Array[String]): Unit =
  {
    val calc = new Calculation()

    println("Addition: " + calc.+(10, 2))
    println("Subtraction: " + calc.-(10, 2))
    println("Multiplication: " + calc.*(10, 2))
    println("Division: " + calc./(10, 2))
    //println("Division: " + calc./(10, 0))
    //println("Power: " + 10**2)
    println("Power: " + calc.power(10,2))
    println("Absolute: " + calc.absolute(-5.6))
    println("Modulus: " + calc.%(10,2))
    println("Greater: " + calc.>(10,2))
    println("Smaller: " + calc.<(10,2))

  }
}