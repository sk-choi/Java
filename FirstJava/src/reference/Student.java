package reference;

import reference.Subject;

public class Student {
	
	int studentID;
	String studentName;
	
//	int koreaScore;
//	int mathScore;
//	int engScore;
//	
//	String koreaName;
//	String mathName;
//	String engName;

	Subject korea;
	Subject math;
	
	public Student (int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();

	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setmathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	public void showStudentScore() {
		int total =  korea.score + math.score;
		System.out.println(total);
	}
}
