package de.htwg.se.UNO.controller

import de.htwg.se.UNO.util.Observable
import de.htwg.se.UNO.model._

class Controller(var game:Table) extends Observable {

  def createPlayer(inp: String): Unit = {
    game.addPlayer(inp)
  }

  def handPlayersCards(): Unit = {
    if (game.Players.length <= 2) print("Zu wenig Spieler!")
    else for (x <- game.Players) while (x.hand.size <= 8) x.hand.addOne(game.drawCardDeck())
  }

  def nextPlayer(): Unit = {
    game.setNextP()
  }

  def showHand(): String = {
    game.getcP().hand.toString()
  }

  def drawCard(): Unit = {
    game.getcP().hand.addOne(game.drawCardDeck())
  }

  def playCard(): Unit = {
    game.playCard(game.getcP().hand.remove(1))
  }

  def winGame(): Boolean = {
    game.getcP().hand.isEmpty
  }

}
