package chapter5;

public class Man {
	int age;
	String name;
	boolean ismarried;
	int numOfChildren;
	
	public static void main(String[] args) {
		Man man1 = new Man();
		man1.age = 40;
		man1.name = "james";
		man1.ismarried = true;
		man1.numOfChildren = 3;
		
		System.out.println("���̰� " + man1.age + "��, �̸��� " + man1.name + "��� ���ڰ� �ֽ��ϴ�.");
		System.out.println("�� ���ڴ� ��ȥ�� �߰�, �ڽ��� " + man1.numOfChildren + "�� �ֽ��ϴ�.");
	}
}
