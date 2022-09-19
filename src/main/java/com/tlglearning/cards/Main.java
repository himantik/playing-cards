package com.tlglearning.cards;

import com.tlglearning.cards.model.Deck;
import java.security.SecureRandom;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println(deck);
    //TODO create an instance of com.tlglearning.cards.model.Deck.
    //TODO Print the string representation of the com.tlglearning.cards.model.Deck.
    //TODO Create an acceptable source of randomness.
    Random rng = new SecureRandom();
    deck.shuffle(rng);
    System.out.println(deck);
  }

}
