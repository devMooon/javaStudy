package chapter4;

public class IfExample5 {

	public static void main(String[] args) {
		int score = -98;
		char grade;

		if (score > 100 || score < 0) {
			System.out.println("�ùٸ� ������ �Է� ���ּ���.");
		}
		else {
			if (score <= 100 && score > 90) {
				grade = 'A';
			}
			else if (score > 80) {
				grade = 'B';
			}
			else if (score > 70) {
				grade = 'C';
			}
			else if (score > 60) {
				grade = 'D';
			}
			else {
				grade = 'F';
			}
		
			System.out.println(score + "���� " + grade + "���� �Դϴ�.");
		}

	}
}