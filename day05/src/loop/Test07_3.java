package loop;
//import java.lang.*;
public class Test07_3 {
	public static void main(String[] args) {
		//다음 규칙에 따라 369 게임을 시뮬레이션하세요
		// - 1부터 순차적으로 숫자가 증가하며 출력됨
		// - 3또는 6또는 9가 들어있는 숫자라면 해당하는 숫자 개수만큼 "짝"이라고 출력
		// - ex : 36 = 짝짝, 34 -짝
		// - 범위는 99까지 출력합니다.
		
		// 1. 1부터 99까지 화면에 출력
		for(int i = 1; i < 100; i++) {
			//if(369가 있는 숫자라면) {
			//if(십의자리3 || 십의자리6 || 십의자리9 || 일의자리3 || 일의자리6 || 일의자리9) {
			boolean ten = i / 10 == 3 || i / 10 == 6 || i / 10 == 9;
			boolean one = i % 10 == 3 || i % 10 == 6 || i % 10 == 9;
			
			if(ten || one) {
				System.out.println("짝");
			}
			else {
			System.out.println(i);
			}
		}
	}
}
