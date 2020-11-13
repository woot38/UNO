package de.htwg.se.model

import scala.util.Random

//soll case class
case object Deck {
  val complete_deck: Array[Card] = Array(
    Card(0, "green", "normal"),
    Card(0, "red", "normal"),
    Card(0, "blue", "normal"),
    Card(0, "yellow", "normal"),

    Card(1, "green", "normal"),
    Card(1, "red", "normal"),
    Card(1, "blue", "normal"),
    Card(1, "yellow", "normal"),
    Card(1, "green", "normal"),
    Card(1, "red", "normal"),
    Card(1, "blue", "normal"),
    Card(1, "yellow", "normal"),

    Card(2, "green", "normal"),
    Card(2, "red", "normal"),
    Card(2, "blue", "normal"),
    Card(2, "green", "normal"),
    Card(2, "red", "normal"),
    Card(2, "blue", "normal"),
    Card(2, "yellow", "normal"),
    Card(2, "yellow", "normal"),

    Card(3, "green","normal"),
    Card(3, "red", "normal"),
    Card(3, "blue", "normal"),
    Card(3, "yellow", "normal"),
    Card(3, "green","normal"),
    Card(3, "red", "normal"),
    Card(3, "blue", "normal"),
    Card(3, "yellow", "normal"),

    Card(4, "green", "normal"),
    Card(4, "red", "normal"),
    Card(4, "blue", "normal"),
    Card(4, "yellow", "normal"),
    Card(4, "green", "normal"),
    Card(4, "red", "normal"),
    Card(4, "blue", "normal"),
    Card(4, "yellow", "normal"),

    Card(5, "green", "normal"),
    Card(5, "red", "normal"),
    Card(5, "blue", "normal"),
    Card(5, "yellow", "normal"),
    Card(5, "green", "normal"),
    Card(5, "red", "normal"),
    Card(5, "blue", "normal"),
    Card(5, "yellow", "normal"),

    Card(6, "green", "normal"),
    Card(6, "red", "normal"),
    Card(6, "blue", "normal"),
    Card(6, "yellow", "normal"),
    Card(6, "green", "normal"),
    Card(6, "red", "normal"),
    Card(6, "blue", "normal"),
    Card(6, "yellow", "normal"),

    Card(7, "green", "normal"),
    Card(7, "red", "normal"),
    Card(7, "blue", "normal"),
    Card(7, "yellow", "normal"),
    Card(7, "green", "normal"),
    Card(7, "red", "normal"),
    Card(7, "blue", "normal"),
    Card(7, "yellow", "normal"),

    Card(8, "green", "normal"),
    Card(8, "red", "normal"),
    Card(8, "blue", "normal"),
    Card(8, "yellow", "normal"),
    Card(8, "green", "normal"),
    Card(8, "red", "normal"),
    Card(8, "blue", "normal"),
    Card(8, "yellow", "normal"),

    Card(9, "green", "normal"),
    Card(9, "red", "normal"),
    Card(9, "blue", "normal"),
    Card(9, "yellow", "normal"),
    Card(9, "green", "normal"),
    Card(9, "red", "normal"),
    Card(9, "blue", "normal"),
    Card(9, "yellow", "normal"),

    Card(10, "green", "reverse"),
    Card(10, "green", "reverse"),
    Card(10,"red", "reverse"),
    Card(10,"red", "reverse"),
    Card(10, "blue", "reverse"),
    Card(10, "blue", "reverse"),
    Card(10, "yellow", "reverse"),
    Card(10, "yellow", "reverse"),

    Card(11, "red", "pull +2"),
    Card(11, "red", "pull +2"),
    Card(11, "green", "pull +2"),
    Card(11, "green", "pull +2"),
    Card(11, "yellow", "pull +2"),
    Card(11, "yellow", "pull +2"),
    Card(11, "blue", "pull +2"),
    Card(11, "blue", "pull +2"),

    Card(12, "green", "skip"),
    Card(12, "green", "skip"),
    Card(12,"red", "skip"),
    Card(12,"red", "skip"),
    Card(12, "blue", "skip"),
    Card(12, "blue", "skip"),
    Card(12, "yellow", "skip"),
    Card(12, "yellow", "skip"),

    Card(13, "blank", "colour change"),
    Card(13, "blank", "colour change"),
    Card(13, "blank", "colour change"),
    Card(13, "blank", "color change"),

    Card(14, "blank", "pull +4 and colour change"),
    Card(14, "blank", "pull +4 and colour change"),
    Card(14, "blank", "pull +4 and colour change"),
    Card(14, "blank", "pull +4 and colour change")

  )

  //soll vector
  val gzkarten = new Array[Card](108)

  def setgzkarten(ind: Int, card: Card) = {
    Deck.gzkarten(ind) = card
  }

  //options
  def contains(ind: Int): Boolean = {
    try {
      if (Deck.gzkarten(ind).equals(Deck.complete_deck(ind))) {
        false
      } else {
        true
      }
    }
    catch {
      case nullPointerException: NullPointerException => true
    }
  }

  def rndnbm: Random = {new Random()}

  def drawcard: Card ={
    var cardnmb = rndnbm.nextInt(complete_deck.length)
    while(!Deck.contains(cardnmb)) {
      cardnmb = rndnbm.nextInt(complete_deck.length)
    }
    setgzkarten(cardnmb,Deck.complete_deck(cardnmb))
    Deck.complete_deck(cardnmb)
  }
}
