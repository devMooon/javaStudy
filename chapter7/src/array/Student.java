package array;

public class Student {
	public static int serialNum = 1000;
	int studentID;
	String name;
	
	public Student(String name) {
		serialNum++;
		this.studentID = serialNum;
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println(this.studentID + "," + this.name);
	}
}
