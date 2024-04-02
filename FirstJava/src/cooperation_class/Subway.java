package cooperation_class;

public class Subway {

	int lineNum;
	int passengerCnt;
	int money;
	
	public Subway(int lineNum) {
		this.lineNum = lineNum;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCnt++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNum + "번 지하철 승객은" + passengerCnt + "명이고,  수입은 " + money + "입니다." ); 
	}
	
	
}
