package fr.minemobs.learnscala

import scala.io.StdIn.readLine
import scala.util.control.Breaks.{break, breakable}
import scala.util.{Random, Try}

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

    moreOrLess()
  }

  def moreOrLess(): Unit = {
    println("Vous avez 5 chances")
    val rndNumber = new Random().nextInt(101)
    println(rndNumber)
    breakable{
      for( a <- 1 to 5){
        println("Choose a number")
        val chosenNumber: Int = readLine().toInt

        if(chosenNumber == rndNumber){
          println("Gagné")
          break
        }else if(chosenNumber < rndNumber){
          println("Inférieur")
        }else if(chosenNumber > rndNumber){
          println("Supérieur")
        }
      }
    }
  }
}