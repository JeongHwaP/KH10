package oop.keyword7;

public class Test01 {
	public static void main(String[] args) {
		Bank a = new Bank("유재석", 1.2f, 0.3f, 5000000);
		Bank b = new Bank("강호동", 1.2f, 0.5f, 3500000);
		Bank c = new Bank("신동엽", 1.2f, 0.2f, 8000000);
		
		a.print();
		b.print();
		c.print();
	}
}
