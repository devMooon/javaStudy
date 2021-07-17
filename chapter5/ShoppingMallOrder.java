package chapter5;

public class ShoppingMallOrder {

	long orderNum;
	String ID;
	String date;
	String Name;
	String productNum;
	String address;
	
	public static void main(String[] args) {
		ShoppingMallOrder order1 = new ShoppingMallOrder();
		order1.orderNum = 201803120001L;
		order1.ID = "abc123";
		order1.date = "2018년 3월 12일";
		order1.Name = "홍길순";
		order1.productNum = "PD0345-12";
		order1.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : " + order1.orderNum);
		System.out.println("주문자 아이디 : " + order1.ID);
		System.out.println("주문 날짜 : " + order1.date);
		System.out.println("주문자 이름 : " + order1.Name);
		System.out.println("주문 상품 번호 : " + order1.productNum);
		System.out.println("배송 주소 : " + order1.address);

	}

}
