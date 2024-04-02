package function;

public class FunctionTest01 {
	
	public static int getSub(int a, int b, int c) { //public: 다른 클래스에서도 접근 가능
		int res = a + b + c;						// static: 어떤 클래스에 속해 있지 않다는 것
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getSub(1, 2, 3));

	}

}
