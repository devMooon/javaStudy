package exercise;

public class CardTest1 {

	public static void main(String[] args) {

		CardCompany1 card = CardCompany1.getInstance();
		
		
		Card1 myCard = card.creatCard();
		Card1 yourCard = card.creatCard();
		
		System.out.println(myCard.getCardNum());
		System.out.println(yourCard.getCardNum());
		
		
	}

}
