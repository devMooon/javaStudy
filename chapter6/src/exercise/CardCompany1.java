package exercise;

public class CardCompany1 {

	private static CardCompany1 instance;
	
	private CardCompany1() {}

	public static CardCompany1 getInstance() {
		if (instance == null) {
			instance = new CardCompany1();
		}
		return instance;
	}
	
	public Card1 creatCard() {
		Card1 card = new Card1();
		return card;
	}

	public static void setInstance(CardCompany1 instance) {
		CardCompany1.instance = instance;
	}
	
	
	
	
}
