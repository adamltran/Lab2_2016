package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

import enumPkg.eCardRank;
import enumPkg.eCardSuit;

public class Deck {

	private ArrayList<Card> DeckCards = new ArrayList<Card>();

	public Deck() {
		int cardCount = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 14; j++) {
				DeckCards.add(new Card(cardCount, eCardSuit.values()[i], eCardRank.values()[j]));
				Collections.shuffle(DeckCards);
			}
		}

	}

	public int cardsLeft() {
		return DeckCards.size();

	}

	public Card draw() {
		return DeckCards.remove(0);
	}
}
