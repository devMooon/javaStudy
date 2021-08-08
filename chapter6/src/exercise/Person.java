package exercise;

public class Person {

	public String firstName;
	public int money;
	
	public Person(String firstName, int money) {
		this.firstName = firstName;
		this.money = money;
	}
	
	public int getcoffee(String cafeName, String coffeeType) {
		
		int num = 0;
		
		if(cafeName == "Bean") {
			if(coffeeType == "Americano") num = 4000;
			else num = 5000;
		}
		else {
			if(coffeeType == "Americano") num = 3500;
			else num = 4500;
		}
		
		this.money -= num;
		return num;
	}
	
	public void showInfo() {
		System.out.println(this.firstName + "¾¾ÀÇ ÀÜ¾×Àº" + this.money + "¿ø ÀÔ´Ï´Ù.");
	}
}
