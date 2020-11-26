package de.htwg.se.UNO.model

import scala.collection.mutable.ListBuffer


case class Deck() {
  var cod: ListBuffer[Card] = fillDeck()

  def colors(): Vector[Color] = Vector(Yellow(), Blue(), Green(), Red())
  def ranks(): Vector[Rank] = Vector(Reverse(), Skip(), Plus2(), Nine(), Eight(), Seven(), Six(), Five(), Four(), Three(), Two(), One(), Zero())
  def colorB(): Vector[Color] = Vector(Blank(), Blank(), Blank(), Blank())
  def rankB(): Vector[Rank] = Vector(Wild(), Wild4())


  def fillDeck(): ListBuffer[Card] = {
    new ListBuffer[Card] :++
      util.Random.shuffle((for (color <- colors(); rank <- ranks()) yield Card(color, rank)).concat(
        for (color <- colors(); rank <- ranks().dropRight(1)) yield Card(color, rank)).concat(
        for (color <- colorB(); rank <- rankB()) yield Card(color, rank)))
  }

  def fillDeck(oldDeck: ListBuffer[Card]): ListBuffer[Card] = {
    oldDeck :++
      util.Random.shuffle((for (color <- colors(); rank <- ranks()) yield Card(color, rank)).concat(
        for (color <- colors(); rank <- ranks().dropRight(1)) yield Card(color, rank)).concat(
        for (color <- colorB(); rank <- rankB()) yield Card(color, rank)))
  }

  def getSize(): Int = cod.length

  def drawCard(): Card = cod.remove(cod.length - 1)

}
