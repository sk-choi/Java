package while_ex;

public class Test02 {

	public static void main(String[] args) {

		int n = 7;
		// 상단
		for (int i = 1; i <= n / 2 + 1; i++){
			for (int j = (n+1)/2 - i; j >= 1; j--){
				System.out.print(' ');
			}
			for (int k = 1; k <= 2*i-1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		// 하단
		for (int i = 1; i <= n / 2; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(' ');
			}
			for (int k = n - (2*i); k >= 1; k--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
	
