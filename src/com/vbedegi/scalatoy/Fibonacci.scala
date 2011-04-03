package com.vbedegi.scalatoy

class Fibonacci {
  def calculate(number: Int): Int = {
    if (number == 0) return 0
    if (number == 1) return 1
    return calculate(number - 1) + calculate(number - 2)
  }
}