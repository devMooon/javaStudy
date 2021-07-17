package chapter5.exercise;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 2, 2000);
		date1.isValid();
		
		MyDate date2 = new MyDate(2, 10, 2006);
		date2.isValid();
	}

}
//문제에서 요구하는 사항 아님... 결과 오류