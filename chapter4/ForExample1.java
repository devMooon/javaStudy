package chapter4;

public class ForExample1 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		for(i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1에서 10까지의 합은 " + sum + "입니다.");
	}

}
