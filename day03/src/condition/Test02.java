package condition;
import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
		//NCS 능력 단위인 프로그래밍 언어 활용 평가를 진행했습니다.
		// 서술형, 문제해결 시나리오 두 과목을 응시한 학생의 점수가 다음과 같습니다.
		// - 서술형 : 85점 / - 문제해결 시나리오 : 52점
		// 평균 60점 이상이면 통과라고 했을 때, 이 학생이 통과인지 재시험인지 판정하여 출력
		//(true, false가 아닌 글자로 결과가 출력되록 조건을 구현하세요.)
		
		//준비
		//int 서술형 = 85;
		//int 시나리오 = 52;
		int exam1 = 85;
		int exam2 = 52;
		
		//계산
		int total = exam1 + exam2;
		double average = (double)total / 2;
		
		boolean pass = average >= 60, fail = average < 60;
		
		//출력
		System.out.println("평균점수 = " + average);
		//if(pass == true) {
		if(average >= 60) {
			System.out.println("통과입니다.");
		}
		//if(fail == true) {
		if(average < 60) {
			System.out.println("재시험을 보셔야 합니다.");
		}
	}
}
