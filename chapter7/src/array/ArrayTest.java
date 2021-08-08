package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int num = 100;
		int[] numbers = new int[3];
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]); 
		}
		System.out.println();
		
		int[] studentID = new int[3];
		
		for(int i=0; i<studentID.length; i++) {
			System.out.println(studentID[i]); 
		}
		
		
	}

}
