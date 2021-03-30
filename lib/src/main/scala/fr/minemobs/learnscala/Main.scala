package fr.minemobs.learnscala

object Main {
  def main(args: Array[String]): Unit = {
    val username: String = new JMain().getUsername
    println("Hello " + username)
  }
}