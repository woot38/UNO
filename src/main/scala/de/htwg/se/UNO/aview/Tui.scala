package de.htwg.se.aview

import de.htwg.se.UNO.controller.Controller
import de.htwg.se.UNO.util._

import scala.io.StdIn.readLine


case class Tui(var c : Controller) extends Observer {

  c.add(this)


  def processInputLine(input: String):Unit = {
    input match {
      case "" => print("die commands sind: x. y z")
      case "create Player" => c.createPlayer(readLine())
      case "deal Cards" => c.handPlayersCards()
      case "show Hand" => c.showHand()
      case "draw Card" => c.drawCard()
      case "play Card" => c.playCard()
      case ""
    }
  }

  override def update: Unit =  println(c.gridToString)
}

