package enumPkg;

import java.util.ArrayList;

public enum eCardSuit {
	HEARTS(1), SPADES(2), CLUBS(3), DIAMONDS(4);
	private int suit;
	
	private eCardSuit(int i){
		this.suit = i;
	}

	private int getSuit() {
		return suit;
	}
	


}

