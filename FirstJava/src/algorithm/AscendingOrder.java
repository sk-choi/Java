package algorithm;

public class AscendingOrder {

	public static void main(String[] args) {

		int[] numbers = {50, 20, 30, 10, 40};
		
		int[] sorted = sortAscending(numbers);
		
		for (int num:sorted) {
			System.out.print(num + " ");
		}
	}

	private static int[] sortAscending(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		return numbers;
	}
}