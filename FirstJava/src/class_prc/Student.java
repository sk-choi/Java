package class_prc;

public class Student {
	// 멤버 변수
	public int student_num;
	public String student_name;
	public String student_addr;
	
	// 메서드
	public void ShowStudentInfo() {
		System.out.println("학생 학번은 " + student_num + "이고 " + "학생 이름은 " + student_name + "이고 " + "학생 주소는 " + student_addr + "입니다.");
	}

}
