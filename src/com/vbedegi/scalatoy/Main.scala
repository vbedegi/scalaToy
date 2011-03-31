package com.vbedegi.scalatoy

import scala.io.Source

object Main {
  def main(args: Array[String]) = {
    println(" hello2 ")

    listToy()
    tupleToy()
    printFile()
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

  private val filename = "c:\\scala.txt"

  def printFile() {
      for(line <- Source.fromFile(filename).getLines)
        println(line)
  }
}