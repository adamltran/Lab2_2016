package pokerBase;

import java.util.ArrayList;

public enum eCardRank{
	ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), 
	EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ace(14);
	
	private int rank;
	private eCardRank(int i){
		this.rank = i;
	}
	private int getRank() {
		return rank;
	}
	
}
