package while_ex;

public class For_Ex05 {

	public static void main(String[] args) {

		// 구구단 출력 프로그램
		// 짝수단만 출력, 단보다 곱하는 수가 작거나 같을 때까지만 출력
		for (int i = 1; i < 10; i++) {
			if(i % 2 == 1)
				continue;
				System.out.println(i+"단");
			for (int j = 1; j <= i; j++) {
				int multi = i * j;
				System.out.println(i + " x " + j + " = " + multi);
			}
			System.out.println();
		}
	}
}
