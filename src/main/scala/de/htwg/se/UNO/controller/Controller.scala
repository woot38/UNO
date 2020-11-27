package de.htwg.se.UNO.controller

import de.htwg.se.UNO.util.Observable
import de.htwg.se.UNO.model._

class Controller(var game:Table) extends Observable{
  def initializeGame(): Unit = {
    printf("Bitte Anzahl an Spieler angaben:")


  }

  def playGame(): Unit = null

  def endGame(): Unit = null
}
