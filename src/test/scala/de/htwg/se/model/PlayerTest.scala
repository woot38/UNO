package de.htwg.se.model


import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec

class PlayerTest extends AnyWordSpec {
  "A player" when {
    "created" should {
      val player = Player("Player1Name")
      "have a name" in {
        player.name should be("Player1Name")
      }
      "and toString should look like" in {
        player.toString should be("Player1Name")
      }
      "when unapplied" in {
        Player.unapply(player).get should be ("Player1Name")
      }
    }
  }
}