package variable;

public class CharTest {

	public static void main(String[] args) {

		char ch = 'A';
		char ch1 = 'B';
		
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println((int)ch);
		System.out.println((int)ch1);
		
		
		int ich = 65;
		System.out.println((char)ich);
		int ichnew = 70;
		System.out.println((char)ichnew);
		char ch2 = (char)80;
		System.out.println(ch2);
		
		char hangul = '\uAc01';
		System.out.println(hangul);
		
	}

}
