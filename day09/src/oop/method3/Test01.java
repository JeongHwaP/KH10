package oop.method3;

public class Test01 {
	public static void main(String[] args) {
		Exam a = new Exam();
		Exam b = new Exam();
		Exam c = new Exam();
		
		a.setting("피카츄", 90, 90, 85);
		b.setting("라이츄", 80, 90, 85);
		c.setting("꼬부기", 100, 90, 90);
		
		a.print();
		b.print();
		c.print();
	}
}
