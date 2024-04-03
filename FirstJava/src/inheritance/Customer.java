package inheritance;

public class Customer {

	protected int customerID; // 고객 아이디
	protected String customerName; // 고객 이름
	protected String customerGrade; // 고객 등급
	int bonusPoint; // 고객의 해피포인트
	double bonusRatio; // 고객
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer 생성자 호출");
	}
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	// 가격을 받으면 보너스 포인트 반환 하는 함수
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며 보너스 포인트는 " + bonusPoint + "입니다. "; 
	}
	 
	
}
