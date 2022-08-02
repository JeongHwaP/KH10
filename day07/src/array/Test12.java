package array;

import java.util.Arrays;

public class Test12 {
	public static void main(String[] args) {
		//다음 규칙에 따라 정렬을 구현하세요.
		//30, 10, 20, 50, 40을 저장할 배열을 만듭니다.
		//배열의 위치를 변경하여 10, 20, 30, 40, 50 순으로 저장될 수 있도록 만든 뒤 출력
		// 배열에서 가장 작은 값을 찾아 가장 왼쪾에 있는 데이터와 교체
		// 교체된 데이터의 위치는 제외하고 나머지 위치에서 가장 작은 값을 찾아 좌측 데이터와 교체
		// 데이터가 완전히 정렬될 때까지 반복
		
		int[] data = new int[] {30, 10, 20, 50, 40};
		
		for(int i = 0; i < data.length - 1; i++) {
			int index = i;
			
			//최소값
			for(int j = i + 1; j < data.length; j++) {
				//if(index 위치의 값보다 j 위치의 값이 더 작다면){
				if(data[index] > data[j]) {
					//index를 i로 변경
					index = j;
				}
			}
			int backup = data[index];
			data[index] = data[i];
			data[i] = backup;
		}
		System.out.println(Arrays.toString(data));
	}
}
