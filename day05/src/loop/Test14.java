package loop;

import java.util.Scanner;

//import java.lang.*;
public class Test14 {
	public static void main(String[] args) throws InterruptedException {
		//사용자에게 숫자를 하나 입력받아 해당되는 숫자의 구구단을 출력합니다. (ex : 5 입력시 구구단 5단 출력)
		//사용자는 출력된 구구단을 보고 정답을 입력하며 프로그램에서는 정답 여부를 판정하여 카운트를 합니다.
		// 모든 문제가 출력되고 난 후 정답 개수와 오답 개수를 구하여 화면에 출력하세요.
		// 답 입력 : 5 -> 5단 시작! -> 5x1=10,... 5x9=45
		// 게임 종료! 정답 ?개 / 오답 ?개
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작하실 구구단을 입력하세요~");
		int number = sc.nextInt();
		System.out.println(number + "단 시작!");
		Thread.sleep(2000L);
		
		int success = 0;
		int fail = 0;
		
		for(int i = 1; i < 10; i++) {
				System.out.println(number + " X "+ i + " =");
				int test = sc.nextInt();
				
				if(test == number * i) {
					success++;
				}
				else {
					fail++;
				}
		}
		
		sc.close();
		
		System.out.println("게임 종료!");
		Thread.sleep(2000L);
		System.out.println("정답 = " + success + "개");
		System.out.println("오답 = " + fail+ "개");
	}
}
