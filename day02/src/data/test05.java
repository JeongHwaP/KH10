package data;
//(Q)커피숍 메뉴는 다음과 같습니다
//아메리카노 : 1300원, 라떼 : 2000원
//우리 팀에서는 아메리카노를 마시는 사람이 4명, 라떼를 마시는 사람이 3명입니다. 커피요금을 계산하여 출력
import java.lang.*;
public class test05 {
	public static void main(String[] args) {
		
		//준비
		int americanoPrice = 1300;//int 아메리카노 = 1300;
		int lattePrice = 2000;//int 라떼 = 2000;
		int americanoCount = 4;//int 아메리카노Count = 4;
		int latteCount = 3;//int 라떼Count = 3;
		
		//계산
		int americanoTotal = americanoPrice * americanoCount;//int 아메리카노Total = 아메리카노 * 아메리카노Count;
		int latteTotal = lattePrice * latteCount;//int 라떼Total = 라떼 * 라떼Count;
		int total = americanoTotal + latteTotal;//int total = 아메리카노Total + 라떼Total;
		
		System.out.println("총 결제 금액은 다음과 같습니다");
		System.out.println(total);	
	}
}
