package if_example;

import java.util.Scanner;

public class If_Ex05 { // 홀수와 짝수 구분하는 프로그램

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String result;
		
//		
//		if (num % 2 == 0) { // 나머지 연산자(%) 사용
//			result = "짝수";
//		}
//		else
//			result = "홀수";
		
		result = (num % 2 == 0) ? "짝수" : "홀수"; // 삼항 연산자 버전
		
		System.out.println("숫자 " + num + "은 " + result + "입니다");
	
		sc.close();
	}

}
