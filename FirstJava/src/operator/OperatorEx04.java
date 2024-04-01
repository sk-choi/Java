// @SuppressWarnings("resource")

package operator;

import java.util.Scanner;

public class OperatorEx04 {

	public static void main(String[] args) {
		
		int num2;
		int num3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("num2를 입력하세요 : ");
		num2 = sc.nextInt();
		System.out.println("num3를 입력하세요 : ");
		num3 = sc.nextInt();
		
		// 삼항 연산자
		int max = (num2 > num3) ? num2 : num3;
		
		System.out.println("두 숫자 중 큰 값은 : " + max);
		
		sc.close();
	}

}
