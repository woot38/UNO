package de.htwg.se.model


import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec

class CardTest extends AnyWordSpec {
  "A card" when {
    "pulled" should {
      val card = Card(Blue(), One())
      "have a number, colour and function" in {
        card.rank should be(One())
        card.color should be(Blue())
      }
    }
  }
}