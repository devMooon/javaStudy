package chapter5.student;

public class Student {
	//�������
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	//�޼���
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	/*public Student(int studentID) {
		this.studentID = studentID;
	}*/

	
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "�ȿ���";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
