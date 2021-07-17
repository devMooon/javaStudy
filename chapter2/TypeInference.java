package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		//자바 15.0.1 인데 var 호환 안됨. 뭐지
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
	}

}
