package arraylist;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("Lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 50);
		
		Student studentKim = new Student("Kim");
		studentKim.addSubject("����", 70);
		studentKim.addSubject("����", 85);
		studentKim.addSubject("����", 100);
		
		studentLee.showInfo();
		System.out.println("==================================");
		studentKim.showInfo();
	}

}
