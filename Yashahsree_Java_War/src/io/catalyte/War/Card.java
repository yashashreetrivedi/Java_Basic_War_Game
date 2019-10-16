package io.catalyte.War;

public class Card {
	private int rank; // initialize the rank (2,3,4...King, Ace)
	private int suit; // initialize the suit (spades, hearts...)

	// constructor
	public Card(int suit, int rank) {
		this.rank = rank;
		this.suit = suit;
	}

	// getter method
	public int getCard() {
		return rank;
	}

	// setter method
	public void setCard(int rank) {
		this.rank = rank;
	}

	public String toString() {

		StringBuilder displayCard = new StringBuilder();

		if (rank == 11) {
			displayCard.append("Jack");

		}
		if (rank == 12) {
			displayCard.append("Queen");
		}
		if (rank == 13) {
			displayCard.append("Ace");
		}
		if (rank == 14) {
			displayCard.append(rank);
		}

		//displayCard.append("  ");

		if (suit == 0) {
			displayCard.append("Spades");
		}
		if (suit == 1) {
			displayCard.append("Hearts");

		}
		if (suit == 2) {
			displayCard.append("Clubs");
		}
		if (suit == 3) {
			displayCard.append("Diamonds");
		}

		return displayCard.toString();
	}
}
