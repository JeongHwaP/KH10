package array;

public class Test05 {
	public static void main(String[] args) {
		//우리반 학생들의 시험 성적은 다음과 같습니다.
		//75점, 92점, 86점, 65점, 79점, 95점, 88점, 85점, 72점, 77점
		// 1. 전체 학생의 점수를 배열에 저장한 뒤 출력하세요
		// 2. 전체 학생의 평균을 구하여 출력하세요.
		// 3. 성적 우수자(90점 이상)의 숫자를 카운트하여 출력하세요
		// 4. 만약 이 반에 85점인 학생이 전학을 왔다면, 이 학생의 예상 등수는 몇 등인지 출력하세요.
		
		//성적 데이터 준비
		int[] score = new int[] {75, 92, 86, 65, 79, 95, 88, 86, 72, 77};
		
		//System.out.println(score.length);
		
		int total = 0;
		
		int count = 0;
		
		int rank = 1;
		int student = 85;
		
		for(int i = 0; i < score.length; i++) {
			System.out.println("점수 = " + score[i]);
			
			total += score[i];			

			if(score[i] >= 90) {
				count ++;
			}
			
			//85점 학생의 예상 등수
			// = 85점보다 높은 점수의 개수 +1
			if(score[i] > student) {
				rank++;
			}
		}
		
		double avg = (double)total / score.length;
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("평균 = " + avg);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("성적 우수자 : " + count + "명");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("예상 등수 : " + rank);
	}
}
