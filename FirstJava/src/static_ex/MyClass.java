package static_ex;

public class MyClass {

	static int count = 0;
	public MyClass() {
		count++;
	}
	public static void main(String[] args) {
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass();
		MyClass obj3 = new MyClass();
		
		//printInstanceCount();
		System.out.println("Count : " + MyClass.count);
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
	}
}
