package cooperation;

public class Student {
	//멤버변수
	String name;
	int grade;
	int money;
	
	//default 생성자 
	public Student() {
		this("이름없음", 0);
	}
	//생성자
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//메서드
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1000);
		this.money -= 1000;
	}
	
	public void takeTexi(Texi texi) {
		texi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(this.name + "님의 남은 용돈은 " + this.money + "원 입니다.");
	}
}
