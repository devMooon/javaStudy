package exercise;

public class Card1 {

	private static int serialNum = 1000;
	public int cardNum;
	
	public Card1() {
		serialNum++;
		this.cardNum = serialNum;
	}
	
	public int getCardNum() {
		return cardNum;
	}
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	
	
}
