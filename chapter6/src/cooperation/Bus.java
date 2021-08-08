package cooperation;

public class Bus {
	int busNum;
	int passengetCount;
	int money;
	
	//default 생성자 
	public Bus() {
		this(0);
	}
	//생성자
	public Bus(int busNum) {
		this.busNum = busNum;
	}
		
	//메서드
	public void take(int money) {
		this.passengetCount++;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(this.busNum + "번 버스의 승객수는 " + this.passengetCount + "명 입니다.");
	}
}
