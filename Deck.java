package week6Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards = new ArrayList<>();
	//Deck starts with 52 unique cards
	public Deck() {
		for (int i = 0; i < 52; i++) {
			cards.add(new Card(i));
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	//Remove a card from the deck and give it to a player.
	public Card draw() {
		if (!cards.isEmpty()) {
			return cards.remove(0);
		}
		return null;
	}
}
