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
		order1.date = "2018�� 3�� 12��";
		order1.Name = "ȫ���";
		order1.productNum = "PD0345-12";
		order1.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + order1.orderNum);
		System.out.println("�ֹ��� ���̵� : " + order1.ID);
		System.out.println("�ֹ� ��¥ : " + order1.date);
		System.out.println("�ֹ��� �̸� : " + order1.Name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + order1.productNum);
		System.out.println("��� �ּ� : " + order1.address);

	}

}
