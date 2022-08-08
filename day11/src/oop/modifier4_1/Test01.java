package oop.modifier4_1;

public class Test01 {
	public static void main(String[] args) {
		Police p1 = new Police("포돌이", "순경", "영등포경찰서");
		Police p2 = new Police("포순이", "경장", "당산파출소");
		Police p3 = new Police("포그리", "순경", "마포경찰서");
		
		p1.shoot();
		p1.shoot();
		p1.print();
		
		p2.shoot();
		p2.print();
		
		p3.shoot();
		p3.shoot();
		p3.shoot();
		p3.print();
	}
}
