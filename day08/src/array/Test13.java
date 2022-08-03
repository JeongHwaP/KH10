package array;

public class Test13 {
	public static void main(String[] args) {
		//Test12와 같은 데이터를 버블정렬(BUBBLE SORT)을 통해 오름차순으로 정렬하고 출력
		
		int[] data = new int[] {30, 10, 20, 50, 40};
		
		for(int i=data.length-1; i>0; i--) { //4번 위치부터 시작 0번 위치까지 역방향( = 버블정렬은 우측끝에서 i로 고정시키고 다시 왼쪽끝부터 계산
			for(int j=0; j<i; j++) { // 새 계산 j는 왼쪽끝 0부터 시작 고정 / i의 위치에 고정되었으니 i까지 계산(i보다 j가 작아야함)
				if(data[j] > data[j+1]) { //새로 고정시키려는 j 계산위치가 원래 고정했던 위치(j+1)보다 큰 경우 = 새로 고정한 위치가 더 작음 / ex)0위치가 0+1위치보다 큰 경우
					//교체
					int backup = data[j]; //새로 고정시키려는 j위치
					data[j] = data[j+1]; //새로 고정시키려는 j위치와 원래 고정했던 j+1위치
					data[j+1] = backup;
				}
			}
		}
		//출력
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);			
		}
	}
}
