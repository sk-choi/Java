package array_test;

public class Array_Test02 {

	public static void main(String[] args) {

		double[] dArr  = new double[5];
		int total = 1;
		dArr[0] = 1.1;
		dArr[1] = 2.1;
		dArr[2] = 3.1;
		
		for (int i = 0; i < dArr.length; i++) {
			total *= dArr[i];
		}
		System.out.println(total);
	}
// 배열 나머지 공간에 0이 들어있어서 결과가 0이 나옴.
}
