package chapter4;

public class NestedLoop {

	public static void main(String[] args) {
		int i;
		int k;
		for (i=2; i<10; i++) {
			for (k=1; k<10; k++) {
				System.out.println(i + "X" + k + "=" + i*k);
			}
			System.out.println();
		}

	}
}
