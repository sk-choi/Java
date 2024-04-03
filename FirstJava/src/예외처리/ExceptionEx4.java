package 예외처리;

public class ExceptionEx4 {

	public static void main(String[] args) {

		try {
			throw new ExceptionType("예외 발생");
		}catch(ExceptionType e) {
			System.out.println("예외 메세지 : " + e.getMessage());
		}
	}

}
