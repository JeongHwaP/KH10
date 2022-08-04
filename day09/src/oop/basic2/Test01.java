package oop.basic2;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("순위 	국가 	점수");
		
		//3개의 나라 정보(객체 or 인스턴스) 생성
		Country a = new Country();
		Country b = new Country();
		Country c = new Country();
		
		//정보 설정
		a.rank = 1;
		a.name = "브라질";
		a.score = 1828.45;
		
		b.rank = 2;
		b.name = "벨기에";
		b.score = 1823.42;
		
		c.rank = 3;
		c.name = "프랑스";
		c.score = 1786.15;
		
		//정보 출력
		System.out.print(a.rank);
		System.out.print("\t");
		System.out.print(a.name);
		System.out.print("\t");
		System.out.println(a.score);
		
		System.out.print(b.rank);
		System.out.print("\t");
		System.out.print(b.name);
		System.out.print("\t");
		System.out.println(b.score);
		
		System.out.print(c.rank);
		System.out.print("\t");
		System.out.print(c.name);
		System.out.print("\t");
		System.out.println(c.score);
	}
}