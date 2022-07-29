package loop;
//import java.lang.*;
public class Test05 {
	public static void main(String[] args) {
		//(Q) 1부터 100까지 홀수 / 짝수를 출력
		
		//홀수 1, 3, 5, 7, 9, ... 95, 97, 99, ...
		for(int i = 1; i <= 99; i+=2) {
			System.out.println("홀수 = " + i);
		}
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
				System.out.println("홀수 = " + i);
			}
		}
		
		//짝수 2, 4, 6, 8... 96, 98, 100,...
		for(int i = 2; i <=100; i+=2) {
			System.out.println("짝수 = " + i);
		}
		
		for(int i = 1; i <=100; i++) {
			if( i % 2 == 0) {
				System.out.println("짝수 = " + i);
			}
		}
	}
}
