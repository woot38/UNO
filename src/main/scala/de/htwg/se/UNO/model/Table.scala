package de.htwg.se.UNO.model


import scala.collection.mutable.ListBuffer

object Table {
  var lcp = new ListBuffer[Card]
}


case class Table() {
  var Players = new ListBuffer[Player]
  var dot = new Deck
  var cP = 0
  var startable = false

  def getLCP(): Card = Table.lcp.apply(Table.lcp.length)

  def playCard(pc:Card): Unit = Table.lcp:+pc

  def drawCardDeck(): Card = dot.drawCard()

  def addPlayer(name:String): Unit = Players.addOne(Player(name))

  def getcPpos(): Int = cP

  def getcP(): Player = Players.apply(getcPpos())

  def setNextP(): Unit = {
    val tmp = getcPpos()
    if (tmp.equals(Players.size-1)) cP = 0
    else cP = getcPpos()+1
  }

  def chDir(): Unit = Players = Players.reverse

}
