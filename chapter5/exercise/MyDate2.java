package chapter5.exercise;

public class MyDate2 {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
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
	
	
	public boolean isValid() {

		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if(this.day > 31 || this.day < 0) {
					return false;
				}
				else
					return true;
				
			case 4: case 6: case 9: case 11:
				if (day > 30 || day < 0) {
					return false;
				}
				else
					return true;
				
			case 2:
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 )//À±³â¿©ºÎ
	            {
					if (day > 29 || day < 0) {
						return false;
					}
					else
						return true;
				} 
				else {
					if (day > 28 || day < 0) {
						return false;
					}
					else
						return true;
				}
				
			default : 
				return false;
		}
	}
	
	public MyDate2(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
}
