package de.htwg.se.model

import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec


class DeckTest extends AnyWordSpec {
  "Deck" should {
    "have the cards" in {
      Deck.complete_deck(0) should be (Card(0, "green", "normal"))
    }
  }

  "Deck" should {
    "have boolean" in {
      Deck.contains(1) shouldBe true
    }
  }
}