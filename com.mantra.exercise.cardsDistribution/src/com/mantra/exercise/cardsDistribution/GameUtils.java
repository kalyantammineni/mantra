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
				if(aces==3) books++;
				break;

			case TWO:
				twos++;
				if(twos==3) books++;
				break;

			case THREE:
				threes++;
				if(threes==3) books++;
				break;

			case FOUR:
				fours++;
				if(fours==3) books++;
				break;

			case FIVE:
				fives++;
				if(fives==3) books++;
				break;
				
			case SIX:
				sixes++;
				if(sixes==3) books++;
				break;
				
			case SEVEN:
				sevens++;
				if(sevens==3) books++;
				break;
				
			case EIGHT:
				eights++;
				if(eights==3) books++;
				break;
				
			case NINE:
				nines++;
				if(nines==3) books++;
				break;
				
			case TEN:
				tens++;
				if(tens==3) books++;
				break;
				
			case JACK:
				jacks++;
				if(jacks==3) books++;
				break;
				
			case QUEEN:
				queens++;
				if(queens==3) books++;
				break;
				
			case KING:
				kings++;
				if(kings==3) books++;
				break;
				
			default:
				break;

			}
		}
		return books;
	}
}
