package 예외처리;

public class ExceptionEx2 {

    public static void main(String[] args) {
        try {
            // 예외 발생을 일으키는 메서드 호출
            throwCustomException();
        }catch (CustomException e) {
            // CustomException 예외를 처리
            System.out.println("예외 발생: " + e.getMessage());
            e.printStackTrace(); // 예외의 전체 스택 트레이스 출력
        }
    }
    
    // 사용자 정의 예외를 발생시키는 메서드
    public static void throwCustomException() throws CustomException {
        // 사용자 정의 예외 객체 생성 후 throw
        throw new CustomException("사용자 정의 예외 발생!");
    }
}

// 사용자 정의 예외 클래스
class CustomException extends Exception{
    // 생성자에서 예외 메시지 설정
    public CustomException(String message) {
        super(message);
    }
}