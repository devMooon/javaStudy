package array;

public class ObejectCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("�¹ڻ��1", "������");
		bookArray1[1] = new Book("�¹ڻ��2", "������");
		bookArray1[2] = new Book("�¹ڻ��3", "������");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		//���� ����Ǵ� �� �ƴϰ� �ּҰ� ����Ǵ� ����. //���� ����
		//System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray2.length);
		
		//���� ����
		for (int i=0; i<bookArray2.length; i++) {
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		
		bookArray1[0].setBookName("����");
		bookArray1[0].setAuthor("�ڿ���");
		
		System.out.println("============================");
		for (int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("============================");
		for (int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
	}

}
