package cooperation_class;

public class TakeTransTest {

	public static void main(String[] args) {

		Student student1 = new Student("진우", 5000);
		Student student2 = new Student("태섭", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		Subway subway02 = new Subway(2);
		Subway subway06 = new Subway(6);
		
		bus100.showBusInfo();
		subway02.showSubwayInfo();
	}

}
