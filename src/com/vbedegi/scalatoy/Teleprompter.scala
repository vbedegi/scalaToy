package com.vbedegi.scalatoy

class Teleprompter {
  def translate(text: String, dict: List[(String, String)]): String = {
    if (dict.isEmpty) return text
    val translated = text.replace("$" + dict(0)._1 + "$", dict(0)._2)
    translate(translated, dict.drop(1))
  }
}