package array_test;

public class BookTest {

	public static void main(String[] args) {
		
		Array_Test04[] Books = new Array_Test04[3];
		
		Books[0] = new Array_Test04("지리산", "조정래");
		Books[1] = new Array_Test04("1984", "조지오웰");
		Books[2] = new Array_Test04("초한지", "홍길동");
		
		for (int i = 0; i < Books.length; i++) {
			//System.out.println(Books[i].toString());
			Books[i].display();
		} // 주소값 처리는 다음시간에...
;	}
		
}
