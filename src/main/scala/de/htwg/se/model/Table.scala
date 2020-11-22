package de.htwg.se.model

import scala.collection.mutable.ListBuffer

case class Table() {
  var Players = new ListBuffer[Player]
  var dot = new ListBuffer[Card]
  var lcp = new ListBuffer[Card]
  //val direction any ideas?
  def getLCP(): Card = lcp.apply(lcp.length)

  def playCard(pc:Card): Unit = lcp:+pc

  def addPlayer(name:String): Unit = Players.addOne(Player(name))


  //def chdir(): Unit =
}
