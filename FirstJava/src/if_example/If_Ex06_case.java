package if_example;

import java.util.Scanner;

public class If_Ex06_case {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rank = sc.nextInt();

		// if 문
		// 1등 = 금메달, 2등 = 은메달, 3등 = 동메달, 나머지 아쉽네요.
		
//		if(rank == 1) {
//			System.out.println("금메달입니다");
//		}
//		else if (rank == 2) {
//			System.out.println("은메달입니다");
//		}
//		else if (rank == 3) {
//			System.out.println("동메달입니다");
//		}
//		else
//			System.out.println("아쉽네요");
//			
		
		// switch-case 문
		
		switch(rank) {
		case(1):
			System.out.println("금메달입니다");
			break;
		case(2):
			System.out.println("은메달입니다");
			break;
		case(3):
			System.out.println("동메달입니다");
			break;
		default:
			System.out.println("아쉽네요");
		}
		
		sc.close();
	}

}
