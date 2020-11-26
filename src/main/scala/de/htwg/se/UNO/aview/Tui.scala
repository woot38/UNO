package de.htwg.se.aview

/*
case class Tui(var c : Controller) extends Observer {

  c.this (this)

  def processInputLine(input: String): Boolean = {
    run(input)
    c.gameState != END
  }

  def run(input: String): Unit = {
    val comInput = c.splitFlatString(input)
    if (comInput.length > 0) {
      comInput(0) match {
        case "EXIT" => c.exit
        case "HELP" => c.help
        case "LOAD" => if (comInput.length == 2) load(comInput(1)) else c.wrongInput(input)
        case "INFO" => if (comInput.length == 2) c.info(comInput(1)) else c.wrongInput(input)
        case "SHOOT" => if (comInput.length == 3) c.aim(comInput(1), comInput(2)) else c.wrongInput(input)
        case "MOVE" => if (comInput.length == 4) move(comInput(1), comInput(2), comInput(3)) else c.wrongInput(input)
        case "YES" | "Y" | "NO" | "N" => if (comInput(0) == "YES" || comInput(0) == "Y") c.shoot(true) else c.shoot(false)
        case _ => c.wrongInput(input)
      }
    }
  }
}


 */