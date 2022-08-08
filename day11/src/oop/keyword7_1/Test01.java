package oop.keyword7_1;

public class Test01 {
	public static void main(String[] args) {
//		Account.setBasicRate(1.2); //외부에서 직접 기본이율 설정
		
		Account a = new Account("유재석", 0.3, 5000000);
		Account b = new Account("강호동", 0.5, 3500000);
		Account c = new Account("신동엽", 0.2, 8000000);
		
		a.print();
		b.print();
		c.print();
	}
}
