package while_ex;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		// 두 수를 변수로 선언, 사칙연산이 수행되는 프로그램 만들기
		// num 1, num 2
		// 사칙연산 선택하세요(+, -, * , /)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력해주세요 : ");
		double num1 = sc.nextDouble();
		System.out.println("두 번째 숫자를 입력해주세요 : ");
		double num2 = sc.nextDouble();
		System.out.println("연산 기호를 입력해주세요 : ");
		char operator = sc.next().charAt(0);
		double result = 0;
		
		if (operator == '+') { 
			result = num1 + num2;
		}
		else if (operator == '-') {
			result = num1 - num2;
		}
		else if (operator == '*') {
			result = num1 * num2;
		}
		else if (operator == '/') {
			if (num2 != 0) {
				result = num1 / num2;
			}
			else {
				System.out.println("0으로 나눌 수 없습니다");
				return;
			}
		}
		else 
			System.out.println("올바른 연산자를 입력해주세요");
		System.out.println(result);
			
		}
		
	}
