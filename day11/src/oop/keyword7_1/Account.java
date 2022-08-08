package oop.keyword7_1;

public class Account {
	//field
	private String name; //예금주
	private static double basicRate; //기본이율
	private double plusRate; //우대이율
	private long balance; //잔액
	
	//static 전용 초기화구문
	static {
		basicRate = 1.2;
	}
	
	//getter & setter
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPlusRate(double plusRate) {
		if(plusRate < 0) {
			return;
		}
		this.plusRate = plusRate;
	}
	public double getPlusRate() {
		return plusRate;
	}
	public void setBalance(long balance) {
		if(balance < 0) {
			return;
		}
		this.balance = balance;
	}
	public long getBalance() {
		return balance;
	}
	
	//static field는 setter & getter도 static이다.
	public static void setBasicRate(double basicRate) {
		Account.basicRate = basicRate;
	}
	public static double getBasicRate() {
		return basicRate;
	}

	//생성자에서는 static을 초기화할 필요가 없다. (한 번만 초기화하도록 따로 설정)
	public Account(String name, double plusRate, long balance) {
//		Account.basicRate = 1.2;
		this.name = name;
		this.plusRate = plusRate;
		this.balance = balance;
	}
	
	public void print() {
		System.out.println("<계좌 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("기본이율 : " + Account.basicRate + "%");
		System.out.println("우대이율 : " + this.plusRate + "%");
		System.out.println("잔고 : " + this.balance + "원");
	}
}
