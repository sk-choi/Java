package beans;

public class HelloWorld_Main {

	public static void main(String[] args) {

		HelloWorldEn eng = new HelloWorldEn();
		System.out.print("HelloWorld 클래스의 오버라이딩 결과 01 : ");
		eng.sayHello();
		HelloWorldKo kor = new HelloWorldKo();
		System.out.print("HelloWorld 클래스의 오버라이딩 결과 02 : ");
		kor.sayHello();
		
	}

}
