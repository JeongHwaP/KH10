package array;

public class Test11_2 {
	public static void main(String[] args) {
		//배열 뒤집기
		//30, 10, 20, 50, 40을 배열에 저장합니다.
		//배열의 데이터를 순차적으로 출력합니다.
		//배열의 모든 데이터의 위치를 반대로 변경(result : 40, 50, 20, 10, 30)
		//변경된 데이터를 순차적으로 출력합니다.
		
		int[] data = new int[] {30, 10, 20, 50, 40};
		
		System.out.println("배열 크기 : " + data.length);
		System.out.println("반복 횟수 : " + data.length / 2);
		
		//출력
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
		System.out.println("ㅡ");
		//뒤집기 코드
		for(int i = 0; i < data.length / 2; i++) {
			int other = data.length - 1 - i;
			//System.out.println("i = " + i + ", other = " + other);
			int backup = data[i];
			data[i] = data[other];
			data[other] = backup;
		}
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);			
		}
	}
}
