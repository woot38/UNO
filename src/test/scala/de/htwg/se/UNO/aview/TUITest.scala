package de.htwg.se.UNO.aview

import de.htwg.se.UNO.UNO.controller
import org.scalatest.wordspec.AnyWordSpec
import de.htwg.se.UNO.controller.Controller
import de.htwg.se.UNO.model.Table
import de.htwg.se.aview.Tui

class TUITest extends AnyWordSpec{
  "A Sudoku TUI"should{
    val controller = new Controller(new Table)
    val tui = Tui(controller)
  }
}
