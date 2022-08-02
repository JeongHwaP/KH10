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
		
		//최소값 찾기
		for(int i=0; i<data.length; i++) { //0위치에서 시작해 4번째 위치까지 정방향
			
		int min = i; //처음 발견한 위치를 i로 설정
		
		for(int j=i+1; j<data.length-1; j++) { //새 위치를 j로 설정 했을때 i+1부터 시작
			if(data[min] > data[j]) { //처음 발견한 위치가 새로 발견한 보다 큰 경우 = 새로 발견한 위치가 더 작음
				min = j; //새 위치 j로 지정
				}
			}
		
		//System.out.println("min = " + min);
		
		//교체
		int backup = data[i]; // 처음 발견한 위치를 백업설정
		data[i] = data[min]; // 처음 발견한 위치와 새로 발견한 위치를 교환
		data[min] = backup; // 교환후 뒤에 백업설정한 위치
		
		//출력
		System.out.println(data[i]);
		}
	}
}
