package loop3;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//숫자 모래성 게임
		//사용자에게 숫자를입력받아서 입력한 숫자만큼 100에서 차감을 합니다.
		//계속적으로 입력받아서 감소시키다가 숫자가 음수가 되면 게임 오버 메세지를 띄우고 종료
		//게임 오버 전까지 입력한 숫자의 개수를 출력해보세요
		
		Scanner sc = new Scanner(System.in);
		
		int total = 100;
		int count = 0;

		while(true) { //입력받는 숫자 무한반복
			System.out.print("숫자 입력 : ");
			int number = sc.nextInt();		

			total -= number; //입력받는 숫자 합계
			//System.out.println("total = " + total);
			
			if(total < 0) {
				break;
			}	
			else {
				count++;
			}
		}
		
		sc.close();
		
		System.out.println("Game over!");
		System.out.println("총 " + count + "번 입력하셨습니다.");
		
	}
}
