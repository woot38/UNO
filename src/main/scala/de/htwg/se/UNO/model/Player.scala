package de.htwg.se.UNO.model

import scala.collection.mutable.ListBuffer

case class Player(name:String = "Mr.Nobody") {
  var hand = new ListBuffer[Card]
  override def toString: String = name

  def showHand(): Unit = for(x <- hand) printf(x.toString)
}
