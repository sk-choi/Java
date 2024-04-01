package while_ex;

public class For_Ex02 {

	public static void main(String[] args) {

		// 숫자 배열에 들어 있는 값 더해서 출력
		
		int[] numbers = {10, 20, 30, 40, 5, 6, 80, 9, 10, 20};
		
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) { // java는 배열 길이 계산을 위해서 length 함수 사용!
			sum += numbers[i];
			// System.out.println(sum);
		}
		
		System.out.println(sum);
	}

}
