package if_example;

import java.util.Scanner;

public class If_Ex03 {

	public static void main(String[] args) {
		// 65세 이상은 입장료 무료
		// 나이를 입력
		// 65세 이상 입장료 무료
		// 2000 : default
		
		System.out.println("나이를 입력하세요: ");
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		// 삼항 연산자
		int cost = (age >= 65) ? 0 : 2000;
		
		// 조건문
		if (cost == 0) {
			System.out.println("65세 이상은 입장료 무료!");
		}
		else
			System.out.println("요금은 " + cost + "원 입니다.");
		
		// Scanner 닫기
		sc.close();
			
	}

}
