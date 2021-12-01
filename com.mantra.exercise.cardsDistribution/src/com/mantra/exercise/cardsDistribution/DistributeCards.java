package com.mantra.exercise.cardsDistribution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.mantra.exercise.cards.Card;
import com.mantra.exercise.cards.Deck;

public class DistributeCards {

	public static void main(String[] args) {

		Random random = new Random();
		Deck d = new Deck(52);
		ArrayList<Card> cardsInDeck = (ArrayList<Card>) d.getCardsInDeck(52);
		List<Card> shuffledCards = new ArrayList<>();

		// Distribute first deck here
		for (int i = 0; i < 52; i++) {
			int r = random.nextInt(cardsInDeck.size());
			shuffledCards.add(cardsInDeck.remove(r));
		}

		// Distribute second deck here
		cardsInDeck = (ArrayList<Card>) d.getCardsInDeck(52);
		for (int i = 0; i < 52; i++) {
			int r = random.nextInt(cardsInDeck.size());
			shuffledCards.add(cardsInDeck.remove(r));
		}

		ArrayList<Card> player1 = new ArrayList<>();
		ArrayList<Card> player2 = new ArrayList<>();
		ArrayList<Card> player3 = new ArrayList<>();
		ArrayList<Card> player4 = new ArrayList<>();
		
		for (int i = shuffledCards.size(); i > 52; i--) {

			player4.add(shuffledCards.remove(i - 1));
			i--;
			player3.add(shuffledCards.remove(i - 2));
			i--;

			player2.add(shuffledCards.remove(i - 3));
			i--;
			player1.add(shuffledCards.remove(i - 4));
		}

		// Print all the players cards
		System.out.println("********** Cards of Player1 *********");
		for (Card card : player1) {
			System.out.println(card.toString());
		}
		int player1Books = GameUtils.countBooks(player1);
		System.out.println("No of books for Player1:" +player1Books);
		
		// Print all the players cards
		System.out.println("********** Cards of Player2 *********");
		for (Card card : player2) {
			System.out.println(card.toString());
		}
		int player2Books = GameUtils.countBooks(player2);
		System.out.println("No of books for Player2:" +player2Books);
		
		// Print all the players cards
		System.out.println("********** Cards of Player3 ******");
		for (Card card : player3) {
			System.out.println(card.toString());
		}
		int player3Books = GameUtils.countBooks(player3);
		System.out.println("No of books for Player3:" +player3Books);
		
		// Print all the players cards
		System.out.println("********** Cards of Player4 **********");
		for (Card card : player4) {
			System.out.println(card.toString());
		}
		int player4Books = GameUtils.countBooks(player4);
		System.out.println("No of books for Player4:" +player4Books);
		
		// Print all the remaining cards
		System.out.println("********** Cards Remaining: *********");
		System.out.println("Remaining Size of shuffledCards: " + shuffledCards.size());
//		for (Card card : shuffledCards) {
//			System.out.println(card.toString());
//		}
	}
}
