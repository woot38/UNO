package de.htwg.se.aview

import de.htwg.se.UNO.controller.Controller
import de.htwg.se.UNO.util._

case class Tui(var c : Controller) extends Observer {

  c.add(this)


  def processInputLine(input: String):Unit = {
    input match {
      case "q" =>
      case "newPlayer"=> c.createPlayer(input)
      case "r" => c.createRandomGrid(size, randomCells)
      case "s" =>
        val success = c.solve
        if (success) println("Puzzle solved")else println("This puzzle could not be solved!")
      case _ => input.toList.filter(c => c != ' ').map(c => c.toString.toInt) match {
        case row :: column :: value :: Nil => controller.set(row, column, value)
        case _ =>
      }

    }
  }

  override def update: Unit =  println(c.gridToString)
}

