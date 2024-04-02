package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setmathSubject("수학", 90);
		studentLee.showStudentScore();
		
		Student studentHong = new Student(101, "Hong");
		studentHong.setKoreaSubject("국어", 90);
		studentHong.setmathSubject("수학", 85);
		studentHong.showStudentScore();
		
	}

}
