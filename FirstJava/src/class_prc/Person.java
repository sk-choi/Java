package class_prc;

public class Person {
	public int age;
	public String name;
	public boolean married;
	public int childNum;
	
	public void printPersonInfo() {
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + name);
		System.out.println("결혼여부 : " + married);
		System.out.println("자녀수 : " + childNum);
	}
}
