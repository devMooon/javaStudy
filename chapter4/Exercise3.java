package chapter4;

public class Exercise3 {

	public static void main(String[] args) {
		int i;
		int k;
		for (i=2; i<10; i++) {
			for (k=2; k<10; k++) {
				System.out.println(i + "x" + k + "=" + i*k);
				if (i==k) break;
			}
			System.out.println();
		}
	}

}
