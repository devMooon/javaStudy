package cooperation;

public class Subway {
	String lineNum;
	int passengetCount;
	int money;
	
	//default ������ 
	public Subway() {
		this("0ȣ��");
	}
	//������
	public Subway(String lineNum) {
		this.lineNum = lineNum;
	}
			
	//�޼���
	public void take(int money) {
		this.passengetCount++;
		this.money += money;
	}
		
	public void showInfo() {
		System.out.println(this.lineNum + "����ö�� �°����� " + this.passengetCount + "�� �Դϴ�.");
	}
}
