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
		
		System.out.println("나이가 " + man1.age + "살, 이름이 " + man1.name + "라는 남자가 있습니다.");
		System.out.println("이 남자는 결혼을 했고, 자식이 " + man1.numOfChildren + "명 있습니다.");
	}
}
