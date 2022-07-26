package api.lang.object;

public class Test03 {
	public static void main(String[] args) {
		Student a = new Student("피카츄", 50);
		Student b = new Student("피카츄", 50);
		Student c = new Student("피카츄", 60);
		Student d = new Student("라이츄", 60);
		
		//객체간의 비교는 원시형처럼 단순하지 않다.
		// - 상황에 따라, 기준에 따라 달라진다.
		// - 배교 연산(==)이 아니라 equals()를 재정의하여 사용한다.
		
		System.out.println(a == b); //a와 b가 쳐다보는 대상이 같아요?
		System.out.println(a.equals(b)); //a와 b의 값이 같아요?
		System.out.println(b.equals(c));
		System.out.println(c.equals(d));
	}
}
