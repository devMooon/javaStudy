package exercise;

public class Cafe {
	
	public String cafeName;
	public int money;
	
	public Cafe(String cafeName) {
		this.cafeName = cafeName;
		this.money = 0;
	}
	
	public void getMoney(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(this.cafeName + "의 소득액은" + this.money + "원 입니다.");
	}
}
