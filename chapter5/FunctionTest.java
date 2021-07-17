package chapter5;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 + " + " + num2 + " = " + add(num1, num2) + "입니다.");
		System.out.println(num1 + " - " + num2 + " = " + minus(num1, num2) + "입니다.");
		System.out.println(num1 + " * " + num2 + " = " + time(num1, num2) + "입니다.");
		System.out.println(num1 + " / " + num2 + " = " + divided(num1, num2) + "입니다.");
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	public static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	public static int time(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	public static int divided(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}

}
