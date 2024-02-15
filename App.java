package week6Assignment;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// Instantiate a deck and two players
		Deck deck = new Deck();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");

		// Shuffle the deck
		deck.shuffle();

		// Draw cards for both players
		for (int i = 0; i < 26; i++) {
			player1.addCard(deck.draw());
			player2.addCard(deck.draw());
		}
		Scanner s = new Scanner(System.in);
		// Compare cards and update scores
		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();

			System.out.println("Player 1: " + card1.describe());
			System.out.println("Player 2: " + card2.describe());

			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println("Player 1 receives a point!");
			} else if (card1.getValue() < card2.getValue()) {
				player2.incrementScore();
				System.out.println("Player 2 receives a point!");
			} else {
				System.out.println("It's a tie! No point awarded.");
			}
			s.nextLine();
		}

		// Compare final scores
		int player1Score = player1.getScore();
		int player2Score = player2.getScore();

		System.out.println("\nFinal Scores:");
		System.out.println("Player 1: " + player1Score);
		System.out.println("Player 2: " + player2Score);

		// Determine the winner
		if (player1Score > player2Score) {
			System.out.println("Winner: Player 1");
		} else if (player1Score < player2Score) {
			System.out.println("Winner: Player 2");
		} else {
			System.out.println("It's a draw!");
		}
	}
}
