package array_test;

public class Array_Test04 {

	// 객체 배열
	private String title;
	private String author;
		
	public Array_Test04(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void display() {
	    System.out.println(title + " " + author);
	  }
	public static void main(String[] arg) {
		Array_Test04 Book = new Array_Test04("Java Programming", "홍길동");
		
		System.out.println("Title : " + Book.title);
		System.out.println("Title : " + Book.author);
		
	}
		
}
