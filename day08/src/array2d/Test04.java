package array2d;

import java.util.Scanner;

public class Test04 {
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
		
		int[][] arr = new int[row][col];
		
		//계산
		//- 값 기준
		// 1 -> 2 -> 3 -> 4 ->... -> 12(row*col);
		int x = 0, y = 0;
		for(int i=1; i<=row*col; i++) { //for(int i=1; i<=12; i++){
			//System.out.println(i+"를 ("+x+", "+y+")에 대입합니다.");
			arr[x][y] = i;
			if(x < row-1) { //if(x<2){ = 마지막 줄이 아니라면
				x++; //다음줄
			}
			else { // 마지막 줄이라면
				//다음 칸 첫번째 줄로 이동
				y++;
				x = 0;
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
