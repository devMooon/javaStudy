package cooperation;

public class Texi {
	String texiNum;
	int money;
	
	public Texi(String texiNum) {
		this.texiNum = texiNum;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(this.texiNum + " 택시의 소득은 " + this.money + "원 입니다.");
	}
}
