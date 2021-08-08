package cooperation;

public class transTest {

	public static void main(String[] args) {
		Student James = new Student("James", 5000);
		Student tomas = new Student("tomas", 10000);
		Student Edword = new Student("Edword", 20000);
		
		Bus bus100 = new Bus(100);
		Subway line2 = new Subway("2호선");
		Texi texiSeoul = new Texi("서울");
		
		James.takeBus(bus100);
		tomas.takeSubway(line2);
		Edword.takeTexi(texiSeoul);
		
		James.showInfo();
		bus100.showInfo();
		
		tomas.showInfo();
		line2.showInfo();
		
		Edword.showInfo();
		texiSeoul.showInfo();
		
	}

}
