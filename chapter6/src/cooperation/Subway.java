package cooperation;

public class Subway {
	String lineNum;
	int passengetCount;
	int money;
	
	//default 생성자 
	public Subway() {
		this("0호선");
	}
	//생성자
	public Subway(String lineNum) {
		this.lineNum = lineNum;
	}
			
	//메서드
	public void take(int money) {
		this.passengetCount++;
		this.money += money;
	}
		
	public void showInfo() {
		System.out.println(this.lineNum + "지하철의 승객수는 " + this.passengetCount + "명 입니다.");
	}
}
