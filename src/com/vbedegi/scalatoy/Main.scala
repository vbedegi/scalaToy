package com.vbedegi.scalatoy

import dbc.result.Tuple

object Main {
  def main(args: Array[String]) = {
    println(" hello2 ")

    listToy()
    tupleToy()
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

}