package com.mantra.exercise.cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Z655723
 *
 */
public class Deck {
	Random random = new Random();
	private Card[] deckInHand;
	private int inputDeckSize;
	private static final int MAXDECKSIZE = 52;

	public Deck() {
		deckInHand = new Card[MAXDECKSIZE];
		inputDeckSize = 0;
	}

	public Deck(int deckSize) {
		deckInHand = new Card[MAXDECKSIZE];
		int index = 0;
		for (int suit = 0; suit <=3; suit++) {
			for (int rank = 0; rank <= 12; rank++) {
				deckInHand[index] = new Card(rank, suit);
				index++;
			}
		}
		inputDeckSize = deckSize;
	}
	
	public ArrayList<Card> getCardsInDeck(int deckSize){
		Deck deck = new Deck(MAXDECKSIZE);
		List<Card> cards = new ArrayList<Card>();
		cards.addAll(Arrays.asList(deck.deckInHand));
		return (ArrayList<Card>) cards;
	}
	
	/**
	 * Gets a random card from a deck of cards
	 * @param deckSize is the maximum available cards in the deck to fetch a random card
	 * @return a random card from a given deck of 52 cards
	 */
	public Card getRandomCardFromDeck(int deckSize) {
		Deck deck = new Deck(MAXDECKSIZE);
		Card[] myDeck = deck.deckInHand;
		int r = random.nextInt(deckSize);
		return myDeck[r];
	}
	
	public Card getNextCardsFromDeck(int deckSize) {
		Deck deck = new Deck(MAXDECKSIZE);
		Card[] myDeck = deck.deckInHand;
		int r = random.nextInt(deckSize);
		Card card = myDeck[r];
		myDeck[r] = null;
		return card; 
	}

	/**
	 * Return the count of all the cards in deck of a given value (eg: count of all Aces)
	 * @param value
	 * @return
	 */
	public int count(int value) {
		int count = 0;
		for (int i = 0; i <= inputDeckSize; i++) {
			if (deckInHand[i].getCardValue() == value)
				count++;
		}
		return count;
	}
	
}
