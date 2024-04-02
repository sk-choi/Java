package class_prc;

public class Student_Test {

	public static void main(String[] args) {

		Student Lee = new Student();
		Student Hong = new Student();
		Student Kang = new Student();
		
		Lee.student_num = 11111;
		Lee.student_name = "이순신";
		Lee.student_addr = "서울";
		
		Hong.student_num = 11112;
		Hong.student_name = "홍길동";
		Hong.student_addr = "부산";
		
		Kang.student_num = 11113;
		Kang.student_name = "강감찬";
		Kang.student_addr = "경주";
		
		Lee.ShowStudentInfo();
		Hong.ShowStudentInfo();
		Kang.ShowStudentInfo();
	}

}
