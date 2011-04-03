package com.vbedegi.scalatoy

import scala.io.Source

class FizzBuzz {
  private def divisibleBy3(number: Int) = number % 3 == 0

  private def divisibleBy5(number: Int) = number % 5 == 0

  def guess(number: Int): String = {
    if (divisibleBy3(number))
      if (divisibleBy5(number))
        "fizzbuzz"
      else
        "fizz"
    else
    if (divisibleBy5(number))
      "buzz"
    else
      number.toString
  }
}


