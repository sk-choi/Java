package copy_ex;

public class Copy_Ex01 {

	private int number;
	
	public Copy_Ex01(int number) {
		this.number = number;
	}
	
	// 복사 생성자
	public Copy_Ex01(Copy_Ex01 original) {
		this.number = original.number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public static void main(String[] args) {
		Copy_Ex01 original = new Copy_Ex01(10);
		
		Copy_Ex01 copy = new Copy_Ex01(10);
		
		System.out.println(original.number);
		System.out.println(copy.number);
	}
}
