package singleton;

public class Car {
	public static int seriralNum = 1000;
	
	public int carNum;
	
	public Car() {
		seriralNum++;
		this.carNum = seriralNum;
	}
	
	public int getCarNum() {
		return this.carNum;
	}
}
