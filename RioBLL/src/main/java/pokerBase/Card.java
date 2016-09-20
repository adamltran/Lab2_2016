package pokerBase;

import java.util.Comparator;

public class Card {
	
	private int iCardNbr;
	private int iCardSuit;
	private int iCardRank;
	
	public Card(int iCardSuit, int iCardRank) {
		
		this.iCardSuit = iCardSuit;
		this.iCardRank = iCardRank;
	}
	public int getiCardNbr(){
		return iCardNbr;
	}
	public int getiCardSuit(){
		return iCardSuit;	
	}
	public int getiCardRank(){
		return iCardRank;
	}

	
	
	
}
