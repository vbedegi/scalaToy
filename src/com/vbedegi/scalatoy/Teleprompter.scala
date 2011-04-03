package com.vbedegi.scalatoy

class Teleprompter {
  def translate(text: String, dict: Map[String, String]) = {
    var result = text
    dict.foreach((pair) => result = result.replace("$" + pair._1 + "$", pair._2))
    result
  }
}