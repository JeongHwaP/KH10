package loop;
//import java.lang.*;
public class Test12 {
	public static void main(String[] args) {
		//오늘부터 30일간 다이어트를 하기로 했습니다.
		//매일매일 개수를 늘려가면서 푸시업을 할 계획입니다.
		//첫째날은 힘드니까 3개만 합니다.
		//둘째날부터는 전날보다 3개씩 더 합니다.
		// 1. 30일 동안 일자별로 하게 되는 푸시업 개수를 출력
		// 2. 30일 동안 하게 되는 푸시업 개수의 총 합계를 출력
		
		//일자를 기준으로 반복문을 구현
		
		int pushup = 3;
		int total = 0;
		for(int day = 1; day <= 30; day++) {
			//System.out.println(day + "일 = " + day * 3 + "개");
			System.out.println(day + "일 = " + pushup + "개");
			total += pushup; //total을 pushup 개수만큼 증가시키세요.
			pushup += 3;
		}
		System.out.println("합계 = " + total);
	}
}
