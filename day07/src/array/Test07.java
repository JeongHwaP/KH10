package array;

public class Test07 {
	public static void main(String[] args) {
		//반 학생 5명의 신장을 측정한 결과는 다음과 같습니다.
		// [ 150.5, 185.2, 177.9, 175.4, 163.6 ]
		// 1. 전체 학생들의 신장을 배열에 저장하고 출력하세요.
		// 2. 반 평균 신장을 출력하세요.
		// 3. 가장 작은 학생의 위치와 신장을 출력하세요.
		// 4. 평균에 가장 가까운 학생의 신장을 출력하세요.
		
		float[] height = new float[] {150.5f, 185.2f, 177.9f, 175.4f, 163.6f};
		
		float total = 0;
		
		double s = height[0];
		int index = 0;
		
		for(int i = 0; i < height.length; i++) {
			System.out.println("키 : " + height[i]);
			
			total += height[i];
			
			if(s > height[i]) {
				s = height[i];
			}
			if(height[index] > height[i]) {
				index = i;
			}
		}
		
		
		float avg = (float)total / height.length;
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("평균 = " + avg);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("가장 작은 학생 : " + s + ", " + index + "번 째");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println(index + (height.length / 2));
	}
}
