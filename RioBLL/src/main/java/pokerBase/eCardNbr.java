package pokerBase;

public enum eCardNbr {

	CardOne(1), CardTwo(2), CardThree(3), CardFour(4), CardFive(5);
	
	private int cardNbr;

	private eCardNbr(final int cardNbr) {
		this.cardNbr = cardNbr;
	}
	
	public int getCardNbr() {
		return cardNbr;
	}
}
