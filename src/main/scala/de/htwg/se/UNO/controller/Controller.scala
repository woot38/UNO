package de.htwg.se.UNO.controller

import de.htwg.se.UNO.util.Observable
import de.htwg.se.UNO.model._

class Controller(var game:Table) extends Observable {
  def initializeGame(): Unit = {
  }

  def createPlayer(inp: String): Unit = {
    game.addPlayer(inp)
  }

  def handPlayersCards(): Unit = {
    if (game.Players.length <= 2) print("Zu wenig Spieler!")
    else for (x <- game.Players) while (x.hand.size <= 8) x.hand.addOne(game.drawCardDeck())
  }

  def endGame(): Unit = null
}
