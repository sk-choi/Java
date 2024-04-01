package swich_case;

import java.util.Calendar;
import java.util.Scanner;

public class SwitchCase02 {

	public static void main(String[] args) {

		// 요일
		// 월~금, 주말
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요: "); // 연도 입력
		int year = sc.nextInt();
		System.out.println("월을 입력하세요"); // 원 입력
		int month = sc.nextInt();
		System.out.println("일을 입력하세요"); // 일 이입력
		int day = sc.nextInt();
		
		Calendar calendar = Calendar.getInstance(); // 칼렌더 기능 사용, 칼렌더 객체 사용
		calendar.set(year, month - 1, day);
		
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		
		String dayString;
		
		switch(dayOfWeek) {
		case 1:
			dayString = "월요일";
			break;
		case 2:
			dayString = "화요일";
			break;
		case 3:
			dayString = "수요일";
			break;
		case 4:
			dayString = "목요일";
			break;
		case 5:
			dayString = "금요일";
			break;
		default:
			dayString = "주말";
			
		}
		System.out.println(dayString + "입니다.");
		
		sc.close();
		
	}

}
