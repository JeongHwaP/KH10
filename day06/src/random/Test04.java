package random;

import java.util.Random;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//사용자가 3번 틀릴 때 까지 무작위로 구구단 문제를 출제하는 프로그램을 구현
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int dan = r.nextInt(9) + 1;
		System.out.println("구구단 " + dan + "단 시작!");

		int correctCount = 0;
		int wrongCount = 0;
		
		int n=1;
		while(n < 10) {
			System.out.print(dan + " X " + n + " = ");
			n++;
			int user = sc.nextInt();
			
			if(dan * n == user) {
				correctCount++;				
			}
			else {
				wrongCount++;
			}
			}
		
			sc.close();
			
			System.out.println("Game over!");
	}
}
