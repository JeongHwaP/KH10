package condition;
import java.lang.*;
public class Test10 {
	public static void main(String[] args) {
		// 작성한 게시글이 몇 초 전에 작성되었는지에 대한 값이 주어진다고 가정합니다.
		// 시간을 다음 규칙에 따라 변환하여 출력하는 프로그램을 구현
		// - 방금 전 : 작성한 지 10초 이내인 글
		// - ?초 전 : 작성한지 1분이 되지 않은 글
		// - ?분 전 : 작성한지 1분 이상이면서 1시간이 되지 않은 글
		// - ?시간 전 : 작성한지 1시간 이상이면서 24시간이 되지 않은 글
		// - ?일 전 : 나머지
		
		//준비
		int second = 7199; // 작성시각 a, 열람시각 b 일때 b-a
		
		//계산
		int minute = second / 60;
		int hour = second / 60 / 60;
		int day = second / 60 / 60 / 24;
		
		//출력
		if(second <= 10) {
			System.out.println("방금 전");
		}
		else if(second < 60) {
			System.out.println(second + "초 전");
		}
		else if(second < 1 * 60 * 60) {
			System.out.println(minute + "분 전");
		}
		else if(second < 1 * 24 * 60 * 60) {
			System.out.println(hour + "시간 전");
		}
		else {
			System.out.println(day + "일 전");
		}
	}
}
