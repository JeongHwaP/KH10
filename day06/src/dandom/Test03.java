package dandom;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//랜덤으로 구구단 문제를 하나 출제
		//사용자가 정답을 입력하면 정답과 오답을 판정하는 프로그램을 구현
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int dan = r.nextInt(8) + 2;
		System.out.println("구구단 " + dan + "단 시작!");
		
		int correctCount = 0;
		int wrongCount = 0;
		
		for(int i = 1; i < 10; i++) {
			System.out.print(dan + " X " + i + " = ");
			int user = sc.nextInt();
			if(dan * i == user) {
				correctCount++;
			}
			else {
				wrongCount++;
			}
		}
		
		sc.close();
		
		System.out.println("정답 : " + correctCount + "개");
		System.out.println("오답 : " + wrongCount + "개");
	}
}
