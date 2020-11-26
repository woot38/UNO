package de.htwg.se.UNO.model

import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec

class CardTest extends AnyWordSpec {
  "A card" should {
    "check all possibilities by rank" in {
      val card0 = Card(Red(), Zero())
      card0.rank should be(Zero())
      card0.color should be(Red())
      card0.rank.value should be(0)
      card0.color.toString should be("Red")
      card0.toString should be("0 Red,")

      val card1 = Card(Blue(), One())
      card1.rank should be(One())
      card1.color should be(Blue())
      card1.rank.value should be(1)
      card1.color.toString should be("Blue")
      card1.toString should be("1 Blue,")

      val card2 = Card(Yellow(), Two())
      card2.rank should be(Two())
      card2.color should be(Yellow())
      card2.rank.value should be(2)
      card2.color.toString should be("Yellow")
      card2.toString should be("2 Yellow,")

      val card3 = Card(Green(), Three())
      card3.rank should be(Three())
      card3.color should be(Green())
      card3.rank.value should be(3)
      card3.color.toString should be("Green")
      card3.toString should be("3 Green,")

      val card4 = Card(Blank(), Wild4())
      card4.rank should be(Wild4())
      card4.color should be(Blank())
      card4.rank.value should be(14)
      card4.color.toString should be("Blank")
      card4.toString should be("choose color, +4 Blank,")

      val card5 = Card(Blank(), Wild())
      card5.rank should be(Wild())
      card5.color should be(Blank())
      card5.rank.value should be(13)
      card5.color.toString should be("Blank")
      card5.toString should be("choose color Blank,")

      val card6 = Card(Blank(), Reverse())
      card6.rank should be(Reverse())
      card6.color should be(Blank())
      card6.rank.value should be(12)
      card6.color.toString should be("Blank")
      card6.toString should be("change direction Blank,")

      val card7 = Card(Blank(), Plus2())
      card7.rank should be(Plus2())
      card7.color should be(Blank())
      card7.rank.value should be(11)
      card7.color.toString should be("Blank")
      card7.toString should be("+2 Blank,")

      val card8 = Card(Blank(), Skip())
      card8.rank should be(Skip())
      card8.color should be(Blank())
      card8.rank.value should be(10)
      card8.color.toString should be("Blank")
      card8.toString should be("skip Blank,")

      val card9 = Card(Blue(), Four())
      card9.rank should be(Four())
      card9.color should be(Blue())
      card9.rank.value should be(4)
      card9.color.toString should be("Blue")
      card9.toString should be("4 Blue,")

      val card10 = Card(Blue(), Five())
      card10.rank should be(Five())
      card10.color should be(Blue())
      card10.rank.value should be(5)
      card10.color.toString should be("Blue")
      card10.toString should be("5 Blue,")

      val card11 = Card(Blue(), Six())
      card11.rank should be(Six())
      card11.color should be(Blue())
      card11.rank.value should be(6)
      card11.color.toString should be("Blue")
      card11.toString should be("6 Blue,")

      val card12 = Card(Blue(), Seven())
      card12.rank should be(Seven())
      card12.color should be(Blue())
      card12.rank.value should be(7)
      card12.color.toString should be("Blue")
      card12.toString should be("7 Blue,")

      val card13 = Card(Blue(), Eight())
      card13.rank should be(Eight())
      card13.color should be(Blue())
      card13.rank.value should be(8)
      card13.color.toString should be("Blue")
      card13.toString should be("8 Blue,")

      val card14 = Card(Blue(), Nine())
      card14.rank should be(Nine())
      card14.color should be(Blue())
      card14.rank.value should be(9)
      card14.color.toString should be("Blue")
      card14.toString should be("9 Blue,")

      }
    }
}