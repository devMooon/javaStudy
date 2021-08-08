package exercise;
import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		
		dogList.add(new Dog("훈이", "강아지"));
		dogList.add(new Dog("별이", "강아지"));
		dogList.add(new Dog("이브", "강아지"));
		dogList.add(new Dog("셜록", "강아지"));
		dogList.add(new Dog("나비", "강아지"));		
		
		for (Dog dog : dogList) {
			System.out.println(dog.showInfo());
		}
		
	}

}
