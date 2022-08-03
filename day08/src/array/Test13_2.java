package array;

public class Test13_2 {
	public static void main(String[] args) {
		//Test12와 같은 데이터를 버블정렬(BUBBLE SORT)을 통해 오름차순으로 정렬하고 출력
		
		//준비
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		//계산
		for(int i=data.length-2; i>=0; i--) {
			for(int k=0; k<=3; k++) {
				System.out.println(data[k]+", "+data[k+1]);
				if(data[k] > data[k+1]) {
					int backup = data[k];
					data[k] = data[k+1];
					data[k+1] = backup;
				}
			}
		}
			
			//출력
			for(int i=0; i<data.length; i++) {
				System.out.println(data[i]);			
			}
	}
}
