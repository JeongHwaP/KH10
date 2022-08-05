package oop.modifier;

public class Test01 {
	public static void main(String[] args) {
		Student a= new Student("홍길동", 50);
		
		//a.score = 50; //접근 불가(사용 불가)
		a.setScore(-60); //접근 허용(사용 가능)
		
		a.print();
	}
}
