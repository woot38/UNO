package de.htwg.se.simpletui

import scala.io.StdIn._
import de.htwg.se.model.{Card, Deck, Player}


class Tui {

  def createPlayer(): Player = {
    println("Bitte gib den Spieler namen an:\n")
    val a = readLine()
    println("My name is : "+a)
    new Player(a)
  }

  def userInput(input: Int): Unit  = {
      //var splitinput = readInt()

      input match {
        case 0 => println("Close game!!")
        case 1 => println(Deck.drawcard.toString)
        case 2 => createPlayer()
      }
  }
}
