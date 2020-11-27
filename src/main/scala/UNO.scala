package de.htwg.se.UNO

import de.htwg.se.UNO.controller.Controller
import de.htwg.se.UNO.model._
import de.htwg.se.aview.Tui
import scala.io.StdIn.readLine

object UNO {
  val controller = new Controller(new Table)
  val tui =  new Tui(controller)

  def main(args: Array[String]): Unit = {
    var input: String = ""

    do {
      input = readLine()
      tui.processInputLine(input)
    } while (input != "q")
  }
}
