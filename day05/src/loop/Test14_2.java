package loop;

import java.util.Scanner;

//import java.lang.*;
public class Test14_2 {
	public static void main(String[] args) throws InterruptedException {
		//사용자에게 숫자를 하나 입력받아 해당되는 숫자의 구구단을 출력합니다. (ex : 5 입력시 구구단 5단 출력)
		//사용자는 출력된 구구단을 보고 정답을 입력하며 프로그램에서는 정답 여부를 판정하여 카운트를 합니다.
		// 모든 문제가 출력되고 난 후 정답 개수와 오답 개수를 구하여 화면에 출력하세요.
		// 답 입력 : 5 -> 5단 시작! -> 5x1=10,... 5x9=45
		// 게임 종료! 정답 ?개 / 오답 ?개
		
		//추가 : 점수 계산
		//추가 : 콤보 도입 (정답이면 증가, 오답이면 초기화)
		//- 맞추면 +10점, 틀리면 - 10점
		int score = 0;
		int combo = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단수 : ");
		int dan = sc.nextInt();
		
		System.out.println(dan + "단 시작!");
		
		//정답과 오답을 카운트하기 위한 변수를 생성
		int correctCount = 0;
		int wrongCount = 0;
		
		for(int i = 1; i < 10; i++) {
				System.out.println(dan + " X "+ i + " =");
				int user = sc.nextInt();
				
				if(user == dan * i) {
					//System.out.println("정답");
					correctCount++;
					combo++;
					score += combo * 10;
				}
				else {
					//System.out.println("오답");
					wrongCount++;
					combo = 0;
					score -= 10;
				}
		}
		
		sc.close();
		
		System.out.println("게임 종료!");
		Thread.sleep(2000L);
		System.out.println("정답 : " + correctCount + "개");
		System.out.println("오답 : " + wrongCount + "개");
		System.out.println("점수 : " + score + "점");
	}
}
