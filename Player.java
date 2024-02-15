package week6Assignment;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand;
	private int score;
	private String name;

	// Each player has a hand and a name and a score of 0
	public Player(String name) {
		this.name = name;
		this.score = 0;
		this.hand = new ArrayList<Card>();
	}

	// Prints out each card in the players hand
	public void describe() {
		System.out.println("Player: " + name);
		System.out.println("Hand:");
		for (Card card : hand) {
			card.describe();
		}
	}

	// Returns the score. No setter because we have incrementScore
	public int getScore() {
		return score;
	}

	public void addCard(Card draw) {
		hand.add(draw);

	}

	public Card flip() {
		if (!hand.isEmpty()) {
			return hand.remove(0);
		}
		return null;

	}

	public void incrementScore() {
		this.score++;

	}
}