package cooperation;

public class Student {
	//�������
	String name;
	int grade;
	int money;
	
	//default ������ 
	public Student() {
		this("�̸�����", 0);
	}
	//������
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//�޼���
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
		System.out.println(this.name + "���� ���� �뵷�� " + this.money + "�� �Դϴ�.");
	}
}
