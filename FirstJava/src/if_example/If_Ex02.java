package if_example;

import java.util.Scanner;

public class If_Ex02 {

	public static void main(String[] args) {

		System.out.println("나이를 입력해주세요: ");
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		int cost = 0;
		
		if (age <= 8)
		{
			cost = 1000;
		}
		else if (age > 8 && age <= 14)
		{
			cost = 1500;
		}
		else if (age > 14 && age <= 20)
		{
			cost = 2000;
		}
		else
		{
			cost = 3000;
		}
	
		System.out.println("나이 : " + age);
		System.out.println("요금 : " + cost);
	
		sc.close();
	}

}
