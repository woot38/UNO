package de.htwg.se.UNO

import de.htwg.se.simpletui.Tui
import scala.io.StdIn.readLine

object UNO {
  val tui = new Tui

  def main(args: Array[String]): Unit = {
    var input:String=""
    do {
      printf("0: Spiel beenden, 1: Karte ziehen, 2: Spieler Anlegen\n")
      input = readLine()
      tui.userInput(input.toInt)
    } while (input != "0")
  }
}