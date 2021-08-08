package exercise;

public class DogTest {

	public static void main(String[] args) {

		Dog[] dogList = new Dog[5];
		
		for (int i = 0; i < dogList.length; i++) {
			dogList[i] = new Dog();
		}
		dogList[0].setName("훈이");
		dogList[0].setType("강아지");
		dogList[1].setName("별이");
		dogList[1].setType("강아지");
		dogList[2].setName("이브");
		dogList[2].setType("강아지");
		dogList[3].setName("셜록");
		dogList[3].setType("강아지");
		dogList[4].setName("나비");
		dogList[4].setType("강아지");
		
		for (Dog dog : dogList) {
			System.out.println(dog.showInfo());
		}
		
	}

}
