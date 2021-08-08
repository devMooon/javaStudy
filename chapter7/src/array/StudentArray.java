package array;

public class StudentArray {

	public static void main(String[] args) {

		Student[] students = new Student[3];
		
		students[0] = new Student("James");
		students[1] = new Student("Tomas"); 
		students[2] = new Student("Edward");
		
		for(Student s : students) {
			s.showStudentInfo();
		}
		
	}

}
