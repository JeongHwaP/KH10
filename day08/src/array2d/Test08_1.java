package array2d;

public class Test08_1 {
	public static void main(String[] args) {
		//다음은 우리반 학생의 과목별 성적 정보입니다.
		//이름		국어		영어		수학		총점		평균		순위
		//피카츄	100		90		80		?			?			?
		//라이츄	95		92		93		?			?			?
		//파이리	70		95		95		?			?			?
		//이름을 제외한 나머지 정보들을 단 하나의 2차원 배열로 저장
		//총점과 평균과 순위는 최초 0으로 설정한 뒤 계산을 통해서 채운 뒤 출력
		//프로그래밍 코드를 작성하여 모든 정보를 채우고 출력
		
		//준비
		float[][] data = new float[][] {
			{100, 90, 80, 0, 0, 0},
			{95, 92, 95, 0, 0, 0},
			{70, 95, 95, 0, 0, 0}
		};
		
		//계산
		//[1] 총점
		for(int i=0; i < data.length; i++) {
			float total = 0;
			for(int k=0; k<3; k++) {
				total += data[i][k];
			}
			data[i][3] = total;
		}
		
		//[2] 평균
		for(int i=0; i < data.length; i++) {
			float average = data[i][3] / 3;
			//소수점 1자리 처리
			average = (int)(average * 10) / 10f;
			data[i][4] = average;
		}
		
		//[3] 순위
		for(int i=0; i < data.length; i++) {
			int rank = 1;
			float score = data[i][3];
			for(int k=0; k < data.length; k++) {
				if(score > data[k][3]) {
					rank++;
				}
			}
			data[i][5] = rank;
		}
		
		//출력
		System.out.println("국어\t영어\t수학\t총점\t평균\t순위");
		for(int i=0; i < data.length; i++) {
			for(int k=0; k < data[i].length; k++) {
				//평균만 float로 출력하고 나머지는 int로 변환하여 출력
				if(k==4) {
					System.out.print(data[i][k]);					
				}
				else {
					System.out.print((int)data[i][k]);	
				}
				System.out.print("\t");					
			}
			System.out.println();
			System.out.println();
		}
	}
}
