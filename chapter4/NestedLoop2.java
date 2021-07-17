package chapter4;

public class NestedLoop2 {

	public static void main(String[] args) {
		int i;
		int k;
		for (i=3; i<8; i++) {
			for (k=1; k<10; k++) {
				System.out.println(i + "X" + k + "=" + i*k);
			}
			System.out.println();
		}
	}

}
