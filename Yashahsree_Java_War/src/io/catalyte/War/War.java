package io.catalyte.War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class War {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ArrayList<Card> cardDeck = new ArrayList<Card>();

		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 2; rank < 15; rank++) {
				cardDeck.add(new Card(suit, rank));
			} // end rank for
		} // end suit for

		Collections.shuffle(cardDeck, new Random()); // shuffle the deck randomly

		// crating 2 decks for plater 1 and player2
		LinkedList<Card> deck1 = new LinkedList<Card>();
		LinkedList<Card> deck2 = new LinkedList<Card>();

		deck1.addAll(cardDeck.subList(0, 25));
		deck2.addAll(cardDeck.subList(26, cardDeck.size()));

		while (true) {
			Card p1Card = deck1.pop();
			Card p2Card = deck2.pop();

			System.out.println("Player 1 plays card is " + p1Card.toString());
			System.out.println("Player 2 plays card is " + p2Card.toString());

			if (p1Card.getCard() > p2Card.getCard()) {
				deck1.addLast(p1Card);
				deck1.addLast(p2Card);
				System.out.println("PLayer 1 wins the round");
			}

			else if (p1Card.getCard() < p2Card.getCard()) {
				deck2.addLast(p1Card);
				deck2.addLast(p2Card);
				System.out.println("PLayer 2 wins the round");
			}

			else {
				System.out.println("War");

				ArrayList<Card> war1 = new ArrayList<Card>();
				ArrayList<Card> war2 = new ArrayList<Card>();

				for (int x = 0; x < 3; x++) {

					if (deck1.size() == 0 || deck2.size() == 0) {
						break;
					}

					System.out.println("War card for player1 is card\nWar card for player2 is card");

					war1.add(deck1.pop());
					war2.add(deck2.pop());
				}

				if (war1.size() == 3 && war2.size() == 3) {

					System.out.println("War card for player1 is " + war1.get(0).toString());
					System.out.println("War card for player2 is " + war2.get(0).toString());

					if (war1.get(2).getCard() > war2.get(2).getCard()) {
						deck1.addAll(war1);
						deck1.addAll(war2);
						System.out.println("Player 1 wins the war round");
					} else {
						deck2.addAll(war1);
						deck2.addAll(war2);
						System.out.println("Player 2 wins the war round");
					}
				}

			}

			if (deck1.size() == 0) {
				System.out.println("Player 1 wins the game");
				break;
			} else if (deck2.size() == 0) {
				System.out.println(Player 2 wins the game");
				break;
			}
		}

	}
}
