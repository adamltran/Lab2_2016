package pokerBase;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;

public class HandScore {
	
	private int HandStrength; 
	private int HiHand;
	private int LoHand;
	
	public HandScore(eCardNbr eCardNbr, eCardSuit eCardSuit, eCardRank eCardRank, ArrayList<Card> deckcards) {
		//unfinished
	}
	
	public int getHandStrength() {
		return HandStrength;
	}
	
	public void setHandStrength(int handStrength) {
		HandStrength = handStrength;
	}

	public int getHiHand() {
		return HiHand;
	}

	public void setHiHand(int hiHand) {
		HiHand = hiHand;
	}

	public int getLoHand() {
		return LoHand;
	}

	public void setLoHand(int loHand) {
		LoHand = loHand;
	}
	
	
	
	
	



	
}
