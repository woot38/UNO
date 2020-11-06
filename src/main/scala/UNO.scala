package de.htwg.se.UNO
import de.htwg.se.model._

object UNO {
  def main(args: Array[String]): Unit = {
    val player_1 = Player("Your Name")
    printf("Welcome player %s!!! %n", player_1.name)
    val card_1 = Card(0,"green", "normal")
    printf("Your just pulled a %s", card_1)

  }
}