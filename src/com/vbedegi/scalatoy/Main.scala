package com.vbedegi.scalatoy

import scala.io.Source

object Main {
  def main(args: Array[String]) = {
    println(" hello2 ")

    listToy()
    tupleToy()
    printFile("c:\\scala.txt")
    printDir(".")
    func()
    callFizzBuzz()
    callTeaParty()
    callCountdown()
  }

  def tupleToy() {
    var tup1 = 1 -> 2
    println(tup1)

    tup1 = returnATuple(42);
    println(tup1)
  }

  def returnATuple(value: Int) = {
    value -> value * 2
  }

  def listToy() {
    var list = List(1, 2, 3)
    println(list)

    list = 0 :: list
    println(list)

    list.reverse.filter(p => p > 2).foreach(println)

    println(list.map(p => p + "y").mkString(", "))
  }

  def printFile(filename: String) {
    for (line <- Source.fromFile(filename).getLines if line nonEmpty)
      println(line)
  }

  def printDir(path: String) {
    val files = (new java.io.File(path)).listFiles
    for (file <- files)
      println(file.getName)
  }

  def func() {
    val multiplyBy2 = (x: Int) => x * 2
    val divideBy2 = (x: Int) => x / 2

    printResultOfFunc(42, multiplyBy2)
    printResultOfFunc(42, divideBy2)

    val add1: Function[Int, Int] = x => x + 1
    printResultOfFunc(42, add1)

    (1 to 5).foreach(x => printResultOfFunc(x, add1))

    val print = printResultOfFunc _
    (1 to 3).foreach(x => print(x, multiplyBy2))

    val print42 = printResultOfFunc(42, _: Function[Int, Int])
    print42(divideBy2)

    val funcs = List(multiplyBy2, divideBy2, add1)
    funcs.foreach(print42)
  }

  def printResultOfFunc(value: Int, func: Function[Int, Int]) {
    println(func(value))
  }

  def callFizzBuzz() {
    println("fizzbuzzing")
    val fizzBuzz = new FizzBuzz()
    val func = (x: Int) => println(fizzBuzz.guess(x))

    func(1)
    func(3)
    func(4)
    func(5)
    func(6)
    func(15)
  }

  def callTeaParty() {
    println("teaParty")
    val teaParty = new TeaParty()
    teaParty.greet("John", false, false)
    teaParty.greet("Jane", true, false)
    teaParty.greet("Paul", false, true)
  }

  def callCountdown() {
    println("counting down")
    val countdown = new Countdown()
    val numbers = countdown.countdown(10)
    println(numbers)
  }
}
