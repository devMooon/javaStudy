package chapter5.exercise;

public class MyDateTest2 {

	public static void main(String[] args) {
		MyDate2 date1 = new MyDate2(30, 2, 2000);
		if (date1.isValid() == true) {
			System.out.println("��ȿ�� ��¥�Դϴ�.");
		}
		else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
		
		MyDate2 date2 = new MyDate2(2, 10, 2006);
		if (date2.isValid() == true) {
			System.out.println("��ȿ�� ��¥�Դϴ�.");
		}
		else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
	}

}
//�������� �䱸�ϴ� ����...