package de.htwg.se.UNO.model

import scala.collection.mutable.ListBuffer

object CardManager {
  //var thirdhand = ListBuffer


  def playable(card: Card): Boolean = {
    var cantdecide = false
    if(Table.lcp.head.color.equals(card.color)) cantdecide = true
    if(Table.lcp.head.rank.equals(card.rank)) cantdecide = true
    if(card.color.equals(Blank())) cantdecide = true
    cantdecide
  }

  //def getPlayable(cards: ListBuffer[Card]): =

}
