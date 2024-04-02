package hiding;

public class MyDateTest {

	public static void main(String[] args) {

		My_Data date = new My_Data();
		date.setYear(2024);
		date.setMonth(4);
		date.setDay(2);
		date.setValid(true); //isValid 값에 따라 결과가 다르게 출력
		date.showDate();
	}
}
