package de.htwg.se.UNO.model

import scala.collection.mutable.ListBuffer

object Table {
  var Players = new ListBuffer[Player]
  var dot = new Deck
  var lcp = new ListBuffer[Card]
  var cP = 0
}

case class Table() {

  def getLCP(): Card = Table.lcp.apply(Table.lcp.length)

  def playCard(pc:Card): Unit = Table.lcp:+pc

  def drawCardDeck(): Unit = Table.dot.drawCard()

  def addPlayer(name:String): Unit = Table.Players.addOne(Player(name))

  def getcPpos(): Int = Table.cP

  def getcP(): Player = Table.Players.apply(getcPpos())

  def setNextP(): Unit = {
    val tmp = getcPpos()
    if (tmp.equals(Table.Players.size-1)) Table.cP = 0
    else Table.cP = getcPpos()+1
  }

  //prob here or above bugged xD
  def chDir(): Unit = Table.Players.reverse
}
