package com.mantra.exercise.cardsDistribution;

import java.util.List;
import java.util.Random;

import com.mantra.exercise.cards.Card;

public class GameUtils {

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
	public static int countBooks(List<Card> cards) {

		int aces = 0, twos = 0, threes = 0, fours = 0, fives = 0, sixes = 0, sevens = 0, eights = 0, nines = 0,
				tens = 0, jacks = 0, queens = 0, kings = 0;
		int books = 0;
		
		for (Card card : cards) {
			int cardValue = card.getCardValue();
			MyCard cardE = MyCard.values()[cardValue];
			
			switch (cardE) {
			case ACE:
				aces++;
				break;

			case TWO:
				twos++;
				break;

			case THREE:
				threes++;
				break;

			case FOUR:
				fours++;
				break;

			case FIVE:
				fives++;
				break;
				
			case SIX:
				sixes++;
				break;
				
			case SEVEN:
				sevens++;
				break;
				
			case EIGHT:
				eights++;
				break;
				
			case NINE:
				nines++;
				break;
				
			case TEN:
				tens++;
				break;
				
			case JACK:
				jacks++;
				break;
				
			case QUEEN:
				queens++;
				break;
				
			case KING:
				kings++;
				break;
				
			default:
				break;

			}
		}
		if (aces == 3 || twos == 3 || threes == 3 || fours == 3 || fives == 3 || sixes == 3 || sevens == 3
				|| eights == 3 || nines == 3 || tens == 3 || jacks == 3 || queens == 3 || kings == 3) {
			books++;
		}
		return books;
	}
}
