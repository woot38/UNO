package de.htwg.se.model

import scala.collection.mutable.ListBuffer

object Table {
  var Players = new ListBuffer[Player]
  var dot = new Deck
  var lcp = new ListBuffer[Card]
}

case class Table() {

  def getLCP(): Card = Table.lcp.apply(Table.lcp.length)

  def playCard(pc:Card): Unit = Table.lcp:+pc

  def addPlayer(name:String): Unit = Table.Players.addOne(Player(name))

  def getNextP(cp: Player): Player = {
    val poscp = Table.Players.indexOf(cp)
    if (poscp == Table.Players.length-1) Table.Players.head
    else Table.Players.apply(poscp+1)
  }

  def chDir(): Unit = Table.Players.reverse
}
