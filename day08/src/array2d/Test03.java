package array2d;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//사용자에게 줄 수와 칸 수를 입력받아 해당하는 크기만큼의 2차원 배열을 생성하고
		//좌측 상단에 1부터 채워넣어 끝까지 1씩 증가하며 숫자가 채워지도록 구현하고 배열을 출력
		//ex) 줄 수 : 3 / 칸 수 : 4
		//1	2		3		4
		//5	6		7		8
		//9	10	11	12
		//줄 별로 합계를 구하여 출력
		
		Scanner sc = new Scanner(System.in);
		
		//준비
		int row = 3;
		int col = 4;
		
//		System.out.print("줄 : ");
//		int row = sc.nextInt();
//		System.out.print("칸 : ");
//		int col = sc.nextInt();
		
		int[][] arr = new int[row][col];
		//arr.length는 row와 같다.
		//arr[?].length는 col과 같다.
		
		//계산
		int count = 1;
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr[i].length; k++) {
				//arr[i][k]=i * arr[i].length + k + 1; = 줄 수 * 4 + 칸 수 + 1
				
				//arr[i][k] = count;
				//count++;
				
				arr[i][k] = count++; //넣고 증가
				//arr[i][k] = ++count; //증가하고 넣어라
			}
		}
		
		//출력
		for(int i=0; i<arr.length; i++) { 
			for(int k=0; k<arr[i].length; k++) {
				System.out.print(arr[i][k]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
