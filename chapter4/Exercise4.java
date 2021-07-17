package chapter4;

public class Exercise4 {

	public static void main(String[] args) {
		int i;
		int k;
		
		for (i=0; i<4; i++) {
			for(k=0; k < 3-i; k++) {
				System.out.print(" ");
			}
			for(k=0; k<(i*2+1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
