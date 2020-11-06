package de.htwg.se.model


import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec

class CardTest extends AnyWordSpec {
  "A card" when {
    "pulled" should {
      val card = Card(0,"green", "normal")
      "have a number, colour and function" in {
        card.num should be(0)
        card.colour should be("green")
        card.funktion should be("normal")

      }

    }
  }

}