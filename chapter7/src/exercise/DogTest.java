package exercise;

public class DogTest {

	public static void main(String[] args) {

		Dog[] dogList = new Dog[5];
		
		for (int i = 0; i < dogList.length; i++) {
			dogList[i] = new Dog();
		}
		dogList[0].setName("����");
		dogList[0].setType("������");
		dogList[1].setName("����");
		dogList[1].setType("������");
		dogList[2].setName("�̺�");
		dogList[2].setType("������");
		dogList[3].setName("�ȷ�");
		dogList[3].setType("������");
		dogList[4].setName("����");
		dogList[4].setType("������");
		
		for (Dog dog : dogList) {
			System.out.println(dog.showInfo());
		}
		
	}

}
