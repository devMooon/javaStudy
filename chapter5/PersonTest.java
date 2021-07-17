package chapter5;

public class PersonTest {

	public static void main(String[] args) {
		//생성자를 만들어줬기 때문에 디폴트 생성자 사용불가
		Person personLee = new Person();
		Person personMoon = new Person("문서연", 153, 47.8);
	}

}
