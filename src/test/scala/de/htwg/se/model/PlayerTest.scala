package de.htwg.se.model


import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec

class PlayerTest extends AnyWordSpec {
  "A player" when {
    "created" should {
      val player = Player("Your Name")
      "have a name" in {
        player.name should be("Your Name")
      }
      "and toString should look like" in {
        player.toString should be("Your Name")
      }
      "when unapplied" in {
        Player.unapply(player).get should be ("Your Name")
      }
    }
  }

}