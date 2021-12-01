package com.mantra.exercise.cardsDistribution;

import java.util.List;
import java.util.Random;

import com.mantra.exercise.cards.Card;

public class GameUtils {
	
//	MyCard cardEnum;
//	public GameUtils(MyCard cardEnum) {
//		this.cardEnum = cardEnum;
//	}
//	
	static enum MyCard {
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
	}

	public static int[] shuffleCards(int deck[], int n, int deckSize) {

		Random random = new Random();

		for (int i = 0; i < n; i++) {
			// Get a random for remaining positions.
			int r = i + random.nextInt(deckSize - i);

			// swap the deck array items
			int temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;

		}
		return deck;
	}

	/**
	 * A sequence or run, in this game, consists of at least four consecutive cards
	 * of the same suit, such as 4 5 6 7
	 * 
	 * @return
	 */
	public int countBooks(List<Card> cards) {
//		suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		
		int bookCount = 0;
		int clubs = 0, diams = 0, hearts = 0, spades = 0;
		int clubBook = 0, diamBook = 0, heartBook = 0, spadesBook = 0;
		
		for (Card card : cards) {

			int cardValue = card.getCardValue();
			MyCard cardE = MyCard.values()[cardValue];
			switch (cardE) {
			case ACE: // Clubs
				clubs++;
				clubBook+=cardValue;
				break;
				
			case TWO: // Diamonds
				diams++;
				diamBook+=cardValue;
				break;
				
			case THREE: // Hearts
				hearts++;
				heartBook+=cardValue;
				break;
				
			case FOUR: // Spades
				spades++;
				spadesBook+=cardValue;
				break;
				
			default:
				break;

			}
		}
		return 0;
	}
}
