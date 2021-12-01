package com.mantra.exercise.cards;

public class Card {
	private int _value, _suit;
	private String[] _cardValues = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
			"King", "Joker1", "Joker2" };
	private String[] _cardSuits = { "Clubs", "Diamonds", "Hearts", "Spades",null };
	
	public Card() {
		//default constructor stub
	}

	public Card(int value, int suit) {
		_value = value;
		_suit = suit;
	}

	public int getCardValue() {
		return _value;
	}

	public int getCardSuit() {
		return _suit;
	}

	public String toString() {
		return _cardValues[_value] + " of " + _cardSuits[_suit];
	}
}
