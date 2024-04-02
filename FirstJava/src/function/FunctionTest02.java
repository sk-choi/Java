package function;

public class FunctionTest02 {

	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static int calcSum() {
		int sum = 0;
		int i;
		for(i = 0; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {

		int n1 = 16;
		int n2 = 20;
		int res = addNum(n1, n2);
		int total = calcSum();
		
		System.out.println(res);
		System.out.println(total);
	}

}
