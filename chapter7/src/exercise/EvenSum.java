package exercise;

public class EvenSum {

	public static void main(String[] args) {
		int[] numList = new int[5];
		int index = 0;
		int total = 0;
		
		for (int i=1; i<=10; i++) {
			if (i%2 == 0) {
				numList[index] = i;
				index++;	
				total += i;
			}
		}
		
		for (int n : numList) {
			System.out.println(n);
		}
		System.out.println("รัวี : " + total);
	}

}
