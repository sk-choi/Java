package class_prc;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee(); // new 로 생성자 생성
		employeeLee.employeeName = "이순신";
		employeeLee.address = "서울";
		
		Employee employeeHong = new Employee();
		employeeHong.employeeName = "홍길동";
		employeeHong.address = "수원";
		
		employeeLee.showEmployeeInfo();
		employeeHong.showEmployeeInfo();
	}

}
