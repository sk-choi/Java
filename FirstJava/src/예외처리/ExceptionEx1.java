package 예외처리;

public class ExceptionEx1 {

public static void main(String[] args) {

	int[] numbers = {1,2,3,4,5};
	try {
	
		System.out.println(numbers[5]);
	}
	catch(ArrayIndexOutOfBoundsException e1) {
		// 예외처리 코드
		System.out.println("배열 인덱스가 범위를 벗어났습니다.");
	}
	
  }
}
