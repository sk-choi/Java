package swich_case;

import java.util.Calendar;
import java.util.Scanner;

public class SwitchCase03 {

	public static void main(String[] args) {

		// 요일
		// 월~금, 주말
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요"); // 월 입력
		int month = sc.nextInt();
		int day = 0;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4: case 6: case 11:
			day = 30;
			break;
		default:
			System.out.println("Error!");
			day = 0;
			
		}
		System.out.println(month + "월은 " + day +  "입니다.");
		
		sc.close();
	}

}
