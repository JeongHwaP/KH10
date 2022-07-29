package loop;
import java.lang.*;
import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) throws InterruptedException {
		//사용자가 분과 초를 설정하면 해당하는 시간만큼의 메세지 출력 후 종료되는 프로그램을 구현
		// 분 입력 : 2
		// 초 입력 : 10
		// 2분 10초 남았습니다.~
		// 0분 0초 남았습니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("분 : ");
		int minute = sc.nextInt();
		System.out.println("초 : ");
		int second = sc.nextInt();
		sc.close();
		
		int total = minute * 60 + second;
		//System.out.println("total = " + total);
		
		for(int i=total ; i >= 0; i--) {
			//System.out.println(i + "초 남았습니다.");
			System.out.println(i/60 + "분 "+ i%60 + "초 남았습니다.");
			Thread.sleep(1000L);
		}		
	}
}
