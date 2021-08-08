package array;

public class TowArrayTest {

	public static void main(String[] args) {

		char[][] alphabets = new char[13][2];
		
		char ch = 'a';
		
		for(int i = 0; i < alphabets.length; i++) {
			for(int k = 0; k < alphabets[i].length; k++, ch++) {
				alphabets[i][k] = ch;
			}
		}
		
		for(int i = 0; i < alphabets.length; i++) {
			for(int k = 0; k < alphabets[i].length; k++, ch++) {
				System.out.print(alphabets[i][k]);
			}
			System.out.println();
		}
	}

}
