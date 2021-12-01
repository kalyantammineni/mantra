package com.mantra.exercise.cardsDistribution;

import java.util.Arrays;

public class GameCount {

	public static void main(String[] args) {
		// Array from 0 to 51
		int startDeck[] = { 12, 2, 10, 4, 8, 6, 7, 3, 9, 1, 11, 5, 13 };
		printAray(startDeck);
		System.out.println();
		
		int[] shuffleCards = GameUtils.shuffleCards(startDeck, 13,13);
		
		System.out.println("Initial deal:");
		printAray(shuffleCards);
		System.out.println();
		
		Arrays.sort(shuffleCards);  
		System.out.println("Sorted Deal:");
		printAray(shuffleCards);
		
		//count the runs, books after sorting the cards
		

	}
	
	static void printAray(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
}
