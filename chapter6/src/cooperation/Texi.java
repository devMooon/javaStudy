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
		System.out.println(this.texiNum + " �ý��� �ҵ��� " + this.money + "�� �Դϴ�.");
	}
}
