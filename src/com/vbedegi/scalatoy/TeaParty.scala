package com.vbedegi.scalatoy

class TeaParty {
  def greet(name: String, isWoman: Boolean, isSir: Boolean) {
    val prefix = if (isSir) "Sir" else if (isWoman) "Ms." else "Mr."
    println("Hello " + prefix + " " + name)
  }
}
