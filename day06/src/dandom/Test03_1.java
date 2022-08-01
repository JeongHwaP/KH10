package dandom;

import java.util.Random;
import java.util.Scanner;

public class Test03_1 {
	public static void main(String[] args) {
		//랜덤으로 구구단 문제를 하나 출제
		//사용자가 정답을 입력하면 정답과 오답을 판정하는 프로그램을 구현
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int a = r.nextInt(8) + 2;
		int b = r.nextInt(9) + 1;
		
		System.out.print(a + " X " + b + " = ");
		
		int user = sc.nextInt();
		
		if(user == a * b) {
			System.out.println("정답");
		}
		else {
			System.out.println("오답");
		}
		sc.close();
	}
}
