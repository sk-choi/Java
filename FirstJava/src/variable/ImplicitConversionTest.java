package variable;

public class ImplicitConversionTest {

	public static void main(String[] args) {

		int num1 = 10;
		double num2 = 5.5;
		
		double result = num1 + num2;
		
		System.out.println("Result : " + result);
		System.out.println("Result Type : " + Double.TYPE);
	}

}
