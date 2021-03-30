package fr.minemobs.learnscala

object Main {
  def main(args: Array[String]): Unit = {
    val username: String = new JMain().getUsername //Immutable (can't be changed) use var if it's mutable
    println("Hello " + username)
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