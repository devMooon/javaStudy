package chapter5.exercise;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if(this.day > 31 || this.day < 0) {
					isValid = false;
				}
				break;
			case 4: case 6: case 9: case 11:
				if (day > 30 || day < 0) {
					isValid = false;
				} 
				break;
			case 2:
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 )//윤년여부
	            {
					if (day > 29 || day < 0) {
						isValid = false;
					} 
				} 
				else {
					if (day > 28 || day < 0) {
						isValid = false;
					} 
				}
				break;
			default : 
				isValid = false;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void isValid() {
		if (isValid == true) {
			System.out.println("유효한 날짜 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜 입니다.");
		}
	}
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
}
