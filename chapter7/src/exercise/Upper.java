package exercise;

public class Upper {

	public static void main(String[] args) {
		char ch = 'a';
		int num = 'a' - 'A';
		ch = (char) (ch - num);
		char[] chArray = new char[26];
		
		for (int i=0; i<chArray.length; i++, ch++) {
			chArray[i] = ch;
		}
	}

}
