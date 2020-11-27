package de.htwg.se.aview

import de.htwg.se.UNO.controller.Controller
import de.htwg.se.UNO.util._

import scala.io.StdIn.{readInt, readLine}


case class Tui(var c : Controller) extends Observer {

  c.add(this)


  def processInputLine(input: String):Unit = {
    input match {
      case "" => print("die commands sind:create Player, deal Cards, show Hand, play Card, next\n")
      case "create Player" => c.createPlayer(readLine())
      case "deal Cards" => c.handPlayersCards()
      case "show Hand" => c.showHand()
      case "draw Card" => c.drawCard()
      case "play Card" => c.playCard(readInt)
      case "next" => c.nextPlayer()
    }
  }

  override def update: Unit = print("new input:\n")
}

