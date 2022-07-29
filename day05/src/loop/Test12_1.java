package loop;
//import java.lang.*;
public class Test12_1 {
	public static void main(String[] args) {
		//오늘부터 30일간 다이어트를 하기로 했습니다.
		//매일매일 개수를 늘려가면서 푸시업을 할 계획입니다.
		//첫째날은 힘드니까 3개만 합니다.
		//둘째날부터는 전날보다 3개씩 더 합니다.
		// 1. 30일 동안 일자별로 하게 되는 푸시업 개수를 출력
		// 2. 30일 동안 하게 되는 푸시업 개수의 총 합계를 출력
		
		for(int i = 1; i <= 30; i++) {
			System.out.println(i + "일 = " + i * 3 + "개");
		}
		int total = 0;
		for(int i =1; i <= 30; i++) {
			total += i * 3;
		}
		System.out.println("합계 = " + total);
	}
}
