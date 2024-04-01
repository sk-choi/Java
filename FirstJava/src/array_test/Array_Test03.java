package array_test;

public class Array_Test03 {

	public static void main(String[] args) {

		char[] alphabet = new char[26];
		char ch = 'A';
		for (int i = 0; i < 26; i++) {
			alphabet[i] = ch;
			ch++;
			System.out.println(alphabet[i] + " " + (int)alphabet[i]);
		}
	}
}