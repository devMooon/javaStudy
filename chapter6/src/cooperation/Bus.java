package cooperation;

public class Bus {
	int busNum;
	int passengetCount;
	int money;
	
	//default ������ 
	public Bus() {
		this(0);
	}
	//������
	public Bus(int busNum) {
		this.busNum = busNum;
	}
		
	//�޼���
	public void take(int money) {
		this.passengetCount++;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(this.busNum + "�� ������ �°����� " + this.passengetCount + "�� �Դϴ�.");
	}
}
