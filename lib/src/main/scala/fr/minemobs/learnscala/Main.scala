package fr.minemobs.learnscala

import java.io.PrintStream
import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine
import scala.util.control.Breaks.{break, breakable}
import scala.util.Random

object Main {
  def main(args: Array[String]): Unit = {
    System.setOut(new PrintStream(System.out, true, "UTF-8"))
    System.out.println("What's your name ?")
    val username : String = readLine()
    controlStructures(Seq(username))
  }

  def learnString(username: String): Unit = {
    /**
     * Val is immutable
     * Var is mutable
     */

    println(s"Hello $username")
    val speech : String =
      """This is a multiline
        |String
        |It's cool
        |but i prefer
        |adding a +
        |.""".stripMargin
    println(speech)
  }

  def controlStructures(names: Seq[String]): Unit = {
    val nameList = ListBuffer[String]() ++ names
    breakable {
      while (true) {
        println(
          """Do you want to check the name list or add a name to the list
            |[0] View names
            |[1] Add name
            |[2] Quit""".stripMargin)
        var intResponse: Int = 0
        try {
          intResponse = readLine().toInt
        } catch {
          case _: NumberFormatException =>
            println("You didn't choose a number")
            this.controlStructures(nameList.toSeq)
        }

        intResponse match {
          case 0 =>
            println("----------------------------------")
            for (name <- nameList) println(name)
            println("----------------------------------")

          case 1 =>
            println("Please write a name")
            nameList.append(readLine())
          case 2 => break();
          case _ => this.controlStructures(nameList.toSeq)
        }
      }
    }
  }

  def moreOrLess(): Unit = {
    println("Vous avez 5 chances")
    val rndNumber = new Random().nextInt(101)
    println(rndNumber)
    breakable{
      for(_ <- 1 to 5){
        println("Choisissez un nombre entre 0 et 100")
        val chosenNumber: Int = readLine().toInt

        if(chosenNumber == rndNumber){
          println("Gagné")
          break()
        }else if(chosenNumber < rndNumber){
          println("Inférieur")
        }else if(chosenNumber > rndNumber){
          println("Supérieur")
        }
      }
    }
  }
}