package chapter4;

public class WhileExample1 {

	public static void main(String[] args) {
		int sum = 0;
		int min = 1;
		int max = 10;
		int num = min;
		
		while(num <= max) {
			sum += num;
			num++;
		}
		System.out.println(min + "���� " + max + "���� ���� ���� " + sum + "�Դϴ�.");
	}

}
