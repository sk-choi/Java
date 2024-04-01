package while_ex;

public class For_Ex04 {

	public static void main(String[] args) {

		// 구구단 출력 프로그램
		for (int i = 1; i < 10; i++) {
			if (i == 9) 
				break; // 구문 탈출
			else if(i % 2 == 0)
				continue; // 해당하는 조건 넘어가기
			for (int j = 1; j < 10; j++) {
				int multi = i * j;
				System.out.println(i + " x " + j + " = " + multi);
			}
			System.out.println();
		}
	}
}
