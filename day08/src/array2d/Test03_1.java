package array2d;

import java.util.Scanner;

public class Test03_1 {
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
		// - 기준을 (줄, 칸)이 아니라 숫자로 보면? ex) 1부터 12까지 = 1부터 row * cow까지
		// - 1부터 row * col까지 반복하도록 반복문을 구성
		int x = 0, y = 0;
		for(int i=1; i<=row*col; i++) {
			System.out.println(i+"를 ("+x+", "+y+")에 대입합니다.");
			arr[x][y]=i;
			if(y<col-1) {
				y++; //다음칸
			}
			else {
				x++; //다음줄
				y = 0; //첫 칸
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
