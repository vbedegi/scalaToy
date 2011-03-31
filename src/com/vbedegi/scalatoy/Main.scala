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
    println(multiplyBy2(42))
  }
}