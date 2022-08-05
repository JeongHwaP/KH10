package oop.getter3;

public class Test01 {
	public static void main(String[] args) {
		Score a = new Score("마리오", 1, 90, 80, 70);
		Score b = new Score("루이지", 1, 85, 85, 83);
		Score c = new Score("쿠파", 3, 70, 60, 55);
		
//		a.year = 5; //비추천
//		a.setYear(5); //추천
		
		a.print();
		b.print();
		c.print();
	}
}
