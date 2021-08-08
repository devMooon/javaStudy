package exercise;

public class CafeTest {

	public static void main(String[] args) {
		
		Person Kim = new Person("Kim", 10000);
		Person Lee = new Person("Lee", 10000);
		Cafe Bean = new Cafe("Bean");
		Cafe Star = new Cafe("Star");
		
		
		Bean.getMoney(Kim.getcoffee("Bean", "Americano"));
		Star.getMoney(Lee.getcoffee("Star", "Latte"));
		
		
		Kim.showInfo();
		Lee.showInfo();
		Bean.showInfo();
		Star.showInfo();
	}

}
