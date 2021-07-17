package chapter4;

public class Exercise5 {

	public static void main(String[] args) {
		int i;
		int k;
		
		for (i=0; i<7; i++) {
			if (i<=3) {
				for(k=0; k < 3-i; k++) {
					System.out.print(" ");
				}
				for(k=0; k<(i*2+1); k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(k=0; k < i-3; k++) {
					System.out.print(" ");
				}
				for(k=0; k<((7-i)*2-1); k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}

	}

}
