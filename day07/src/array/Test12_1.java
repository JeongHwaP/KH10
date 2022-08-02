package array;

import java.util.Arrays;

public class Test12_1 {
	public static void main(String[] args) {
		//다음 규칙에 따라 정렬을 구현하세요.
		//30, 10, 20, 50, 40을 저장할 배열을 만듭니다.
		//배열의 위치를 변경하여 10, 20, 30, 40, 50 순으로 저장될 수 있도록 만든 뒤 출력
		// 배열에서 가장 작은 값을 찾아 가장 왼쪾에 있는 데이터와 교체
		// 교체된 데이터의 위치는 제외하고 나머지 위치에서 가장 작은 값을 찾아 좌측 데이터와 교체
		// 데이터가 완전히 정렬될 때까지 반복
		
		int[] data = new int[] {30, 10, 20, 50, 40};
		
		//1턴 : 전체 배열에서 가장 작은 숫자의 위치를 찾아 맨 앞에 데이터와 교체
		
		//최소값 찾기
		int min = 0;
		for(int i = 1; i<=4; i++) {
			if(data[min] > data[i]) { //더 작은 값을 발견하면
				min = i;
			}
		}
		System.out.println("min = " + min);
		
		//교체
		int backup = data[0];
		data[0] = data[min];
		data[min] = backup;
		
		//출력
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		
		//2턴
//		int min = 1; //
//		for(int i = min + 1; i<=4; i++) { //
//			if(data[min] > data[i]) { //더 작은 값을 발견하면
//				min = i;
//			}
//		}
//		System.out.println("min = " + min);
//		
//		//교체
//		int backup = data[1]; //
//		data[1] = data[min]; //
//		data[min] = backup;
//		
//		//출력
//		for(int i=0; i<data.length; i++) {
//			System.out.println(data[i]);
//		}
	}
}
