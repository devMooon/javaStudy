package chapter4;

public class Exercise2 {

	public static void main(String[] args) {
		int i;
		int k;
		
		for(i=2; i<10; i++) {
			if(i%2 == 0) {
				for(k=2; k<10; k++) {
					System.out.println(i + "x" + k + "=" + i*k);
				}
				System.out.println();
			}
			else {
				continue;
			}
		}
	}

}
