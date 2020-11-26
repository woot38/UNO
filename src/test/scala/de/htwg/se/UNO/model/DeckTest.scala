package de.htwg.se.UNO.model

import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec


class DeckTest extends AnyWordSpec {

  "A Deck" when {
    "add a new card to a Deck" in{
      var deck = new Deck()
      deck.fillDeck()
      deck.getSize() should be(108)
      deck.drawCard()
      deck.getSize() should be(107)
    }
  }

}