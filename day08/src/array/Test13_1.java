package array;

public class Test13_1 {
	public static void main(String[] args) {
		//Test12와 같은 데이터를 버블정렬(BUBBLE SORT)을 통해 오름차순으로 정렬하고 출력
		
		//준비
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		//계산
		for(int i=0; i<=3; i++) {
			System.out.println(data[i]+", "+data[i+1]);
			if(data[i] > data[i+1]) {
				int backup = data[i];
				data[i] = data[i+1];
				data[i+1] = backup;
			}
		}
				
		//출력
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);			
		}
	}
}
