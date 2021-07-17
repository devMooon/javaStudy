package chapter4;

public class Exercise1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		int result = 0;
		
		if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
			switch (operator) {
				case '+':
					result = (num1 + num2);
					break;
				case '-':
					result = (num1 - num2);
					break;
				case '*':
					result = (num1 * num2);
					break;
				case '/':
					result = (num1 / num2);
					break;
				default:
					break;
			}
			System.out.println("연산결과 : " + result);
		}
		else {
			System.out.println("올바른 연산자를 입력하세요.");
		}
	}
	
}
