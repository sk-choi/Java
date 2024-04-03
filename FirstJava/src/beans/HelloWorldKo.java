package beans;

public class HelloWorldKo implements HelloWorld{

	@Override
	public void sayHello() {
		System.out.println("안녕하세요!");//오버라이드에서는 상위 클래스에서 선언한 함수의 내용을 변경할 수 있습니다.
	}
}
