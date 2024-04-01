package if_example;

import java.util.Scanner;

public class If_Ex04 {

	public static void main(String[] args) {

		System.out.println("점수를 입력해주세요:");
		
		Scanner sc = new Scanner(System.in); // 입력 받기
		
		int score = sc.nextInt();
		char grade;
		
		// 조건
		if(score >= 90){
			grade = 'A';
		}
		else if(score >= 80){
			grade = 'B';
		}
		else if(score >= 70){
			grade = 'C';
		}
		else if(score >= 60){
			grade = 'D';
		}
		else
			grade = 'F';
		
		System.out.println("score:" + score);
		System.out.println("grade:" + grade);
	
		sc.close();
	}

}
