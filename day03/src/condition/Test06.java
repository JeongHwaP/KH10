package condition;
import java.lang.*;
public class Test06 {
	public static void main(String[] args) {
		//다음 요구사항에 맞는 과속단속 카메라용 프로그램을 구현하세요.
		// 50km를 초과하는 속도로 달리는 자동차를 단속합니다.
		// 벌금은 제한속도보다 10km 늘어날 때마다 10000원씩 증가
		// 벌금은 시작이 30000원입니다.
		// 벌금은 최대 70000원입니다.
		//자동차 속도를 입력받아서 예상되는 벌금을 출력하는 프로그램을 구현
		
		//준비
		int speed = 70;
		int limit = 50;
		
		//계산
		//boolean over = 주행속도 > 제한속도;
		boolean over = speed > limit;
		
		int fine;
		//System.out.println("over = " + over);
		//if(over == true) {
		if(over) {
			//fine = 벌금 계산 결과;
			//fine = 30000원 + 10km당 10000원;
			fine = 30000 + (speed - limit) / 10 * 10000;
			if(fine >= 70000) {//벌금이 7만원 이상이라면
				fine = 70000;
			}
			else {
				//할거 없음
			}
		}
		else {
			fine = 0;
		}
		
		//출력
		System.out.println("예상 벌금 : " + fine + "원");
	}
}
