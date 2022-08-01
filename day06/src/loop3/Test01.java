package loop3;

public class Test01 {
	public static void main(String[] args) {
		
		//while 반복문 - 특정 시점까지 반복하는 반복문
		//for 반복문 - 횟수나 범위가 주어졌을 때의 반복문
		
		//ex : 1부터 10까지 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		//while은 자리가 정해져있지 않아 신경써야할게 많다. (실수할 확률 높음)
		int n=1; //선언부
		while(n <= 10) { //조건부
			System.out.println(n);
			n++; //증감부
		}
		System.out.println("n = " + n);
	}
}
