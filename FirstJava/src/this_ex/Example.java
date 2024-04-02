package this_ex;

public class Example {

	private int number;
	
	public Example(int number) {
		this.number = number;
	}
	
	public void printNumber() {
		System.out.println("Number : " + this.number);
	}
	
	public static void main(String[] args) {
		// 객체 생성
		Example obj = new Example(100);
	
		obj.printNumber();
	}
}
