package de.htwg.se

case class Card(num: Int, colour: String) {
  override def toString: String = {
    "Card: %d, %s".format(num, colour)

  }

}
