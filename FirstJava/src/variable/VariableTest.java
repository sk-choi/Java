package variable;

public class VariableTest {

	public static void main(String[] args) {

//		int age;
//		char text;
//		age = 30;
//		text = 'h';
//		System.out.println(age);
//		System.out.println(text);
		
		int number = 10;
		byte bs = -128;
		long lVal = 12345678900L;
		double pi = 3.14;
		String message = "Hello Java!";
		
//		System.out.println(bs);
//		System.out.println(lVal);
//		System.out.println(pi);
//		System.out.println(message);
//		System.out.println("첫번째 정수형 변수"+number);
//		System.out.println("두번째 바이트형 변수"+bs);
//		System.out.println("세번째 롱타입형 변수"+lVal);
//		System.out.println("네번째 실수형 변수"+pi);
//		System.out.println("다섯번째 문자열 변수"+message);
		
		number = 300;
		bs = 127; // -128~127 (2^8 = 8 비트 = 1바이트)
		lVal = 1234545464644L;
		pi = 3.14159;
		message = "Hi Java!";
		
		System.out.println("첫번째 정수형 변수 : "+number);
		System.out.println("두번째 바이트형 변수 : "+bs);
		System.out.println("세번째 롱타입형 변수 : "+lVal);
		System.out.println("네번째 실수형 변수 : "+pi);
		System.out.println("다섯번째 문자열 변수 : "+message);
		
		
	}

}
