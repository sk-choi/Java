package while_ex;

public class For_Ex03 {

	public static void main(String[] args) {

		// 구구단 출력 프로그램
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				int multi = i * j;
				System.out.println(i + " x " + j + " = " + multi);
			}
			System.out.println();
		}
	}
}
