package fr.minemobs.learnscala

import scala.io.StdIn.readLine

object Main {
  def main(args: Array[String]): Unit = {
    /**
     * Val is immutable
     * Var is mutable
     */
    //val username: String = new JMain().getUsername
    System.out.println("What's your name ?")
    val username = readLine()
    println(s"Hello $username")
    val speech =
      """This is a multiline
        |String
        |It's cool
        |but i prefer
        |adding a +
        |.""".stripMargin
        println(speech)


  }
}