package array;
import java.util.ArrayList;

public class StudentArrayTest {

	public static void main(String[] args) {
		ArrayList<Student> studentArray = new ArrayList<Student>();
		
		studentArray.add(new Student("James"));
		studentArray.add(new Student("Tomas"));
		studentArray.add(new Student("Edward"));
		
		for (Student student : studentArray) {
			student.showStudentInfo();
		}
		
	}

}
