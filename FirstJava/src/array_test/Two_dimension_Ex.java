package array_test;

public class Two_dimension_Ex {

	public static void main(String[] args) {

		int [][] arr = {{1,2,3},{4,5,6,7,8}};
		System.out.println(arr.length); // 행 개수 출력
		System.out.println(arr[0].length);//요소의 개수 출력
		System.out.println(arr[1].length);//요소의 개수 출력
		
		// 배열의 요소 하나씩 출력
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
