package array2d;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//Test03번과 동일하게 줄과 칸 수를 입력받아 2차원 배열을 생성
		//초기화는 대각선 방향으로 하세요.
		//ex) 줄 수 : 3 / 칸 수 : 4
		//1	3	6		9
		//2	5	8		11
		//4	7	10	12
		
		//준비
		Scanner sc = new Scanner(System.in);
		
		//준비
//		System.out.print("줄 : ");
//		int row = sc.nextInt();
//		System.out.print("칸 : ");
//		int col = sc.nextInt();
		int row = 3;
		int col = 4;
		
		int[][] arr = new int[row][col];
		
		//계산
		//- x위치와 y위치의 합계가 0부터 5까지인 경우를 찾아서 대입(벗어나는 경우 빼고)
		int n = 1;
		for(int i=0; i<=(row-1) + (col - 1); i++) { //for(int i=0; i<=5; i++){
			//System.out.println("합계 : " + i);
			for(int k=i; k >= 0; k--) {
				//if(줄이 범위를 벗어나지 않으면서 칸이 범위를 벗어나지 않는다면) {
				if(k<row && (i-k)<col) {
					//System.out.println("(" + k + ", " + (i-k) + ")");			
					arr[k][i-k]=n++;
				}
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
