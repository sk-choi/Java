package hiding;

public class My_Data {

	private int day;
	private int month;
	private int year;
	
	private boolean isValid = true;
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public boolean getValid() {
		return isValid;
	}
	public void showDate() {
		if (isValid) {
			System.out.println(year + "년" + month + "월" + day + "일");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
	
}
