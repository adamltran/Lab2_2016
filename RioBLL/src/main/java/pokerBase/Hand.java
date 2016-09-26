package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

import enumPkg.eCardNbr;
import enumPkg.eCardRank;
import enumPkg.eCardSuit;
import enumPkg.eHandStrength;

public class Hand {
	// private UUID Hand;

	private ArrayList<Card> hand;

	private ArrayList<Card> getCardsInHand() {
		return hand;
	}

	public void addCard(Deck deck) {
		hand.add(deck.draw());
	}
	// todo bScored: boolean

	/*
	 * private void setHandScore(HandScore hand) { }
	 * 
	 * private void evalHand(HandScore hscore){
	 * 
	 * } public UUID getHand() { return Hand; }
	 * 
	 */

	public void sortDeck() {
		for (int i = 0; i < hand.size() - 1; i++) {
			int cardCount = i;
			for (int j = i + 1; j < hand.size(); j++)
				if (hand.get(j).getiCardRank().getCardRank() < hand.get(cardCount).getiCardRank().getCardRank())
					cardCount = j;

			Card smallNbr = hand.get(cardCount);
			hand.set(cardCount, hand.get(i));
			hand.set(i, smallNbr);
		}
	}

	private static boolean isHandFlush(ArrayList<Card> cards) {
		boolean bIsFlush = false;

		if (cards.get(eCardNbr.CardOne.getCardNbr()).getiCardSuit() == cards.get(eCardNbr.CardFive.getCardNbr())
				.getiCardSuit()) {
			bIsFlush = true;
		}

		return bIsFlush;
	}

	private static boolean isStraight(ArrayList<Card> cards, Card highCard) {
		boolean bIsStraight = false;
		boolean a = cards.get(eCardNbr.CardOne.getCardNbr()).getiCardRank().getCardRank() + 1 == cards
				.get(eCardNbr.CardTwo.getCardNbr()).getiCardRank().getCardRank();
		boolean b = cards.get(eCardNbr.CardTwo.getCardNbr()).getiCardRank().getCardRank() + 1 == cards
				.get(eCardNbr.CardThree.getCardNbr()).getiCardRank().getCardRank();
		boolean c = cards.get(eCardNbr.CardThree.getCardNbr()).getiCardRank().getCardRank() + 1 == cards
				.get(eCardNbr.CardFour.getCardNbr()).getiCardRank().getCardRank();
		boolean d = cards.get(eCardNbr.CardFour.getCardNbr()).getiCardRank().getCardRank() + 1 == cards
				.get(eCardNbr.CardFive.getCardNbr()).getiCardRank().getCardRank();

		if (a == true && b == true && c == true && d == true) {
			bIsStraight = true;

		}

		return bIsStraight;
	}

	public static boolean isHandRoyalFlush(Hand h, HandScore hs) {

		boolean isRoyalFlush = false;
		boolean a = h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()).getiCardRank().getCardRank() + 1 == h
				.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()).getiCardRank().getCardRank();
		boolean b = h.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()).getiCardRank().getCardRank() + 1 == h
				.getCardsInHand().get(eCardNbr.CardThree.getCardNbr()).getiCardRank().getCardRank();
		boolean c = h.getCardsInHand().get(eCardNbr.CardThree.getCardNbr()).getiCardRank().getCardRank() + 1 == h
				.getCardsInHand().get(eCardNbr.CardFour.getCardNbr()).getiCardRank().getCardRank();
		boolean d = h.getCardsInHand().get(eCardNbr.CardFour.getCardNbr()).getiCardRank().getCardRank() + 1 == h
				.getCardsInHand().get(eCardNbr.CardFive.getCardNbr()).getiCardRank().getCardRank();
		boolean e = h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()).getiCardSuit() == h.getCardsInHand()
				.get(eCardNbr.CardTwo.getCardNbr()).getiCardSuit();
		boolean f = h.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()).getiCardSuit() == h.getCardsInHand()
				.get(eCardNbr.CardThree.getCardNbr()).getiCardSuit();
		boolean g = h.getCardsInHand().get(eCardNbr.CardThree.getCardNbr()).getiCardSuit() == h.getCardsInHand()
				.get(eCardNbr.CardFour.getCardNbr()).getiCardSuit();
		boolean i = h.getCardsInHand().get(eCardNbr.CardFour.getCardNbr()).getiCardSuit() == h.getCardsInHand()
				.get(eCardNbr.CardFive.getCardNbr()).getiCardSuit();
		boolean j = h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()).getiCardRank() == eCardRank.TEN;
		if (j == true && a == true && b == true && c == true && d == true && e == true && f == true && g == true
				&& i == true) {
			isRoyalFlush = true;
			hs.setHandStrength(eHandStrength.StraightFlush.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()).getiCardRank().getCardRank());
			hs.setLoHand(0);
		}

		return isRoyalFlush;
	}

	public static boolean isHandStraightFlush(Hand h, HandScore hs) {
		boolean isRoyalFlush = false;
		boolean a = h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()).getiCardRank().getCardRank() + 1 == h
				.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()).getiCardRank().getCardRank();
		boolean b = h.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()).getiCardRank().getCardRank() + 1 == h
				.getCardsInHand().get(eCardNbr.CardThree.getCardNbr()).getiCardRank().getCardRank();
		boolean c = h.getCardsInHand().get(eCardNbr.CardThree.getCardNbr()).getiCardRank().getCardRank() + 1 == h
				.getCardsInHand().get(eCardNbr.CardFour.getCardNbr()).getiCardRank().getCardRank();
		boolean d = h.getCardsInHand().get(eCardNbr.CardFour.getCardNbr()).getiCardRank().getCardRank() + 1 == h
				.getCardsInHand().get(eCardNbr.CardFive.getCardNbr()).getiCardRank().getCardRank();
		boolean e = h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()).getiCardSuit() == h.getCardsInHand()
				.get(eCardNbr.CardTwo.getCardNbr()).getiCardSuit();
		boolean f = h.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()).getiCardSuit() == h.getCardsInHand()
				.get(eCardNbr.CardThree.getCardNbr()).getiCardSuit();
		boolean g = h.getCardsInHand().get(eCardNbr.CardThree.getCardNbr()).getiCardSuit() == h.getCardsInHand()
				.get(eCardNbr.CardFour.getCardNbr()).getiCardSuit();
		boolean i = h.getCardsInHand().get(eCardNbr.CardFour.getCardNbr()).getiCardSuit() == h.getCardsInHand()
				.get(eCardNbr.CardFive.getCardNbr()).getiCardSuit();
		if (a == true && b == true && c == true && d == true && e == true && f == true && g == true && i == true) {
			isRoyalFlush = true;
			hs.setHandStrength(eHandStrength.StraightFlush.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()).getiCardRank().getCardRank());
			hs.setLoHand(0);
		}

		return isRoyalFlush;
	}

	public static boolean isHandFourOfAKind(Hand h, HandScore hs) {

		boolean bHandCheck = false;

		if (h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()).getiCardRank() == h.getCardsInHand()
				.get(eCardNbr.CardFour.getCardNbr()).getiCardRank()) {
			bHandCheck = true;
			hs.setHandStrength(eHandStrength.FourOfAKind.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()).getiCardRank().getCardRank());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNbr.CardFive.getCardNbr()));
			hs.setKickers(kickers);

		} else if (h.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()).getiCardRank() == h.getCardsInHand()
				.get(eCardNbr.CardFive.getCardNbr()).getiCardRank()) {
			bHandCheck = true;
			hs.setHandStrength(eHandStrength.FourOfAKind.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()).getiCardRank().getCardRank());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()));
			hs.setKickers(kickers);
		}

		return bHandCheck;
	}

	public static boolean isHandFullHouse(Hand h, HandScore hs) {

		boolean isFullHouse = false;
		if (h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()).getiCardRank() == h.getCardsInHand()
				.get(eCardNbr.CardThree.getCardNbr()).getiCardRank()
				&& (h.getCardsInHand().get(eCardNbr.CardFour.getCardNbr()).getiCardRank() == h.getCardsInHand()
						.get(eCardNbr.CardFive.getCardNbr()).getiCardRank())) {
			isFullHouse = true;
			hs.setHandStrength(eHandStrength.FullHouse.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()).getiCardRank().getCardRank());
			hs.setLoHand(0);

		}
		return isFullHouse;

	}

	public static boolean isHandFlush(Hand h, HandScore hs) {

		boolean bIsFlush = false;
		if (h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()).getiCardSuit() == h.getCardsInHand()
				.get(eCardNbr.CardFive.getCardNbr()).getiCardSuit()) {
			bIsFlush = true;
			hs.setHandStrength(eHandStrength.Flush.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()).getiCardRank().getCardRank());
			hs.setLoHand(0);

		}
		return bIsFlush;
	}

	public static boolean isHandStraight(Hand h, HandScore hs) {

		boolean bIsStraight = false;

		boolean a = h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()).getiCardRank().getCardRank() + 1 == h
				.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()).getiCardRank().getCardRank();
		boolean b = h.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()).getiCardRank().getCardRank() + 1 == h
				.getCardsInHand().get(eCardNbr.CardThree.getCardNbr()).getiCardRank().getCardRank();
		boolean c = h.getCardsInHand().get(eCardNbr.CardThree.getCardNbr()).getiCardRank().getCardRank() + 1 == h
				.getCardsInHand().get(eCardNbr.CardFour.getCardNbr()).getiCardRank().getCardRank();
		boolean d = h.getCardsInHand().get(eCardNbr.CardFour.getCardNbr()).getiCardRank().getCardRank() + 1 == h
				.getCardsInHand().get(eCardNbr.CardFive.getCardNbr()).getiCardRank().getCardRank();
		if (a == true && b == true && c == true && d == true) {
			bIsStraight = true;
			hs.setHandStrength(eHandStrength.Straight.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()).getiCardRank().getCardRank());
			hs.setLoHand(0);
		}
		return bIsStraight;
	}

	public static boolean isHandThreeOfAKind(Hand h, HandScore hs) {

		boolean isThreeOfAKind = false;
		if (h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()).getiCardRank() == h.getCardsInHand()
				.get(eCardNbr.CardThree.getCardNbr()).getiCardRank()) {
			isThreeOfAKind = true;
			hs.setHandStrength(eHandStrength.ThreeOfAKind.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()).getiCardRank().getCardRank());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNbr.CardFour.getCardNbr()));
			kickers.add(h.getCardsInHand().get(eCardNbr.CardFive.getCardNbr()));
			hs.setKickers(kickers);

		} else if (h.getCardsInHand().get(eCardNbr.CardThree.getCardNbr()).getiCardRank() == h.getCardsInHand()
				.get(eCardNbr.CardFive.getCardNbr()).getiCardRank()) {
			isThreeOfAKind = true;
			hs.setHandStrength(eHandStrength.ThreeOfAKind.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNbr.CardThree.getCardNbr()).getiCardRank().getCardRank());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()));
			kickers.add(h.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()));
			hs.setKickers(kickers);
		}
		return isThreeOfAKind;
	}

	public static boolean isHandTwoPair(Hand h, HandScore hs) {

		boolean isTwoPair = false;
		if (h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()).getiCardRank() == h.getCardsInHand()
				.get(eCardNbr.CardTwo.getCardNbr()).getiCardRank()
				&& (h.getCardsInHand().get(eCardNbr.CardThree.getCardNbr()).getiCardRank() == h.getCardsInHand()
						.get(eCardNbr.CardFour.getCardNbr()).getiCardRank())) {
			isTwoPair = true;
			hs.setHandStrength(eHandStrength.TwoPair.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()).getiCardRank().getCardRank());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNbr.CardFive.getCardNbr()));
			hs.setKickers(kickers);

		} else if (h.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()).getiCardRank() == h.getCardsInHand()
				.get(eCardNbr.CardThree.getCardNbr()).getiCardRank()
				&& (h.getCardsInHand().get(eCardNbr.CardFive.getCardNbr()).getiCardRank() == h.getCardsInHand()
						.get(eCardNbr.CardFour.getCardNbr()).getiCardRank())) {
			isTwoPair = true;
			hs.setHandStrength(eHandStrength.TwoPair.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()).getiCardRank().getCardRank());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()));
			hs.setKickers(kickers);
		}
		return isTwoPair;
	}

	public static boolean isHandPair(Hand h, HandScore hs) {
		boolean isPair = false;
		if (h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()).getiCardRank() == h.getCardsInHand()
				.get(eCardNbr.CardTwo.getCardNbr()).getiCardRank()) {
			isPair = true;
			hs.setHandStrength(eHandStrength.Pair.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()).getiCardRank().getCardRank());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNbr.CardThree.getCardNbr()));
			kickers.add(h.getCardsInHand().get(eCardNbr.CardFour.getCardNbr()));
			kickers.add(h.getCardsInHand().get(eCardNbr.CardFive.getCardNbr()));
			hs.setKickers(kickers);

		} else if (h.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()).getiCardRank() == h.getCardsInHand()
				.get(eCardNbr.CardThree.getCardNbr()).getiCardRank()) {
			isPair = true;
			hs.setHandStrength(eHandStrength.Pair.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()).getiCardRank().getCardRank());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()));
			kickers.add(h.getCardsInHand().get(eCardNbr.CardFour.getCardNbr()));
			kickers.add(h.getCardsInHand().get(eCardNbr.CardFive.getCardNbr()));
			hs.setKickers(kickers);
		} else if (h.getCardsInHand().get(eCardNbr.CardThree.getCardNbr()).getiCardRank() == h.getCardsInHand()
				.get(eCardNbr.CardFour.getCardNbr()).getiCardRank()) {
			isPair = true;
			hs.setHandStrength(eHandStrength.Pair.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNbr.CardThree.getCardNbr()).getiCardRank().getCardRank());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()));
			kickers.add(h.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()));
			kickers.add(h.getCardsInHand().get(eCardNbr.CardFive.getCardNbr()));
			hs.setKickers(kickers);
		} else if (h.getCardsInHand().get(eCardNbr.CardFour.getCardNbr()).getiCardRank() == h.getCardsInHand()
				.get(eCardNbr.CardFive.getCardNbr()).getiCardRank()) {
			isPair = true;
			hs.setHandStrength(eHandStrength.Pair.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNbr.CardFour.getCardNbr()).getiCardRank().getCardRank());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()));
			kickers.add(h.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()));
			kickers.add(h.getCardsInHand().get(eCardNbr.CardThree.getCardNbr()));
			hs.setKickers(kickers);

		}
		return isPair;
	}

	public static boolean isHandHighCard(Hand h, HandScore hs) {
		hs.setHiHand(h.getCardsInHand().get(eCardNbr.CardFive.getCardNbr()).getiCardRank().getCardRank());
		hs.setLoHand(0);
		ArrayList<Card> kickers = new ArrayList<Card>();
		kickers.add(h.getCardsInHand().get(eCardNbr.CardOne.getCardNbr()));
		kickers.add(h.getCardsInHand().get(eCardNbr.CardTwo.getCardNbr()));
		kickers.add(h.getCardsInHand().get(eCardNbr.CardThree.getCardNbr()));
		kickers.add(h.getCardsInHand().get(eCardNbr.CardFour.getCardNbr()));
		hs.setKickers(kickers);

		return true;
	}
}
