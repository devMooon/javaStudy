package exercise;
import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		
		dogList.add(new Dog("����", "������"));
		dogList.add(new Dog("����", "������"));
		dogList.add(new Dog("�̺�", "������"));
		dogList.add(new Dog("�ȷ�", "������"));
		dogList.add(new Dog("����", "������"));		
		
		for (Dog dog : dogList) {
			System.out.println(dog.showInfo());
		}
		
	}

}
