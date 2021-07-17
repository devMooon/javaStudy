package chapter5.exercise;

public class MyDateTest2 {

	public static void main(String[] args) {
		MyDate2 date1 = new MyDate2(30, 2, 2000);
		if (date1.isValid() == true) {
			System.out.println("유효한 날짜입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
		
		MyDate2 date2 = new MyDate2(2, 10, 2006);
		if (date2.isValid() == true) {
			System.out.println("유효한 날짜입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}

}
//문제에서 요구하는 사항...