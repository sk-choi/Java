package static_ex;

public class Singleton {

		private static Singleton instance;
		private Singleton(){}
		
		public static Singleton getInstance() {
			
			if (instance == null) {
				instance = new Singleton();
			}
			return instance;
		}	

	public static void main(String[] args) {
		
		Singleton obj01 = new Singleton();
		Singleton obj02 = new Singleton();
		
		if (obj01 == obj02)
			System.out.print("서로 동일한 값 ");
	}
}
 