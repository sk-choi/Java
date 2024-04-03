package 예외처리;

public class ExceptionEx3 {

	public static void main(String[] args) {

		try {
			int[] numbers = new int[3];
			System.out.println(numbers[3]);
			
		} catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("배열 인덱스 예외 발생 : " + e1.getMessage());
		} catch(ArithmeticException e1) {
			System.out.println("산술 연산의 예외 발생 : " + e1.getMessage());
		} catch(Exception e1) {
			System.out.println("기타 연산 예외 발생 :" + e1.getMessage());
		}
	}

}
