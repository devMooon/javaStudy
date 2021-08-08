package arraylist;
import java.util.ArrayList;

public class Student {

	private static int serialNum = 1000;
	
	int studentID;
	String name;
	ArrayList<Subject> subjectList;
	
	public Student(String name) {
		serialNum++;
		this.studentID = serialNum;
		this.name = name;
		this.subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	public void showInfo() {
		int total = 0;
		for (Subject s : subjectList) {
			System.out.println(this.name + " 학생의 " + s.getName() + "점수는 " 
		+ s.getScorePoint() + "점 입니다.");
			total += s.getScorePoint();
		}
		System.out.println("총점은 " + total + "점 입니다.");
	}
}
