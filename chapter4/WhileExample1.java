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
		System.out.println(min + "부터 " + max + "까지 값의 합은 " + sum + "입니다.");
	}

}
