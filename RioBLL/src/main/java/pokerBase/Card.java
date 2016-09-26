package pokerBase;

import java.util.Comparator;

import enumPkg.eCardRank;
import enumPkg.eCardSuit;

public class Card {

	private int iCardNbr;
	private eCardSuit iCardSuit;
	private eCardRank iCardRank;

	public Card(int iCardNbr, eCardSuit eCardSuit, eCardRank eCardRank) {
		this.iCardNbr = iCardNbr;
		this.iCardSuit = eCardSuit;
		this.iCardRank = eCardRank;
	}

	public void setiCardNbr(int iCardNbr) {
		this.iCardNbr = iCardNbr;
	}
	
	public int getiCardNbr() {
		return iCardNbr;
	}

	public eCardSuit getiCardSuit() {
		return iCardSuit;
	}

	public eCardRank getiCardRank() {
		return iCardRank;
	}

	}


