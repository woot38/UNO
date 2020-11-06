package de.htwg.se.model

case class Card(num: Int, colour: String, funktion: String) {
  override def toString: String = {
    "Card: %d, %s, %s".format(num, colour, funktion)

  }

}
