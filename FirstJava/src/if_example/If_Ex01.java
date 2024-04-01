package if_example;

public class If_Ex01 {

	public static void main(String[] args) {

		char gender = 'F';
		
		if (gender == 'M') {
			System.out.println("남성입니다.");
		}
		else if (gender == 'F'){
			System.out.println("여성입니다.");
		}
		else {
			System.out.println("다시 입력해주세요");
		}
		
	}

}
