package array2d;

import java.util.Scanner;

public class Test04_1 {
	public static void main(String[] args) {
		//Test03번과 동일하게 줄과 칸 수를 입력받아 2차원 배열을 생성
		//초기화는 세로 방향으로 하세요.
		//ex) 줄 수 : 3 / 칸 수 : 4
		//1	4	7	10
		//2	5	8	11
		//3	6	9	12
		
		Scanner sc = new Scanner(System.in);
		
		//준비
		System.out.print("줄 : ");
		int row = sc.nextInt();
		System.out.print("칸 : ");
		int col = sc.nextInt();
		
		sc.close();
		
		int[][] arr = new int[row][col];
		
		//계산
		//-(줄, 칸) 기준
		//(0, 0) -> (1, 0) -> (2, 0) -> (0, 1) -> (1, 1) -> ...
		int n = 1;
		for(int i=0; i<col; i++) {
			for(int k=0; k<row; k++) {
				arr[k][i] = n;
				n++;
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
