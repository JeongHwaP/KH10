package array2d;

import java.util.Random;

public class Test07 {
	public static void main(String[] args) {
		//다음 규칙에 따라 지뢰찾기를 만드세요.
		// 1. 9x9 크기의 정수 배열을 준비합니다.
		// 2. 지뢰는 9로 표시하며, 배열 내에 무작위로 20개가 배치됩니다.
		// 3. 배치된 이후 전체 지도를 출력
		// 추가 문제 - 풀이 X
		// 1. 지뢰를 제외한 나머지 칸은 자신을 제외한 반경 8칸의 지뢰 개수를 세어 숫자를 기록
		// 2. 가장자리에 있는 칸의 경우 배열을 벗어나는 부분을 제외하고 계산
		// 3. 반경에 지뢰가 하나도 없다면 0이 설정
		
		//준비
		int row = 9;
		int col = 9;
		int[][] map = new int[row][col];
		
		//계산
		//1. 지뢰 무작위로 20개 배치
		Random r = new Random();
		int bomb = 20;
		for(int i=0; i<bomb; i++) {
			int x = r.nextInt(row);				
			int y = r.nextInt(col);
			if(map[x][y] == 0) { //배치된 적 없는 칸이면
				map[x][y] = 9; //폭탄 배치
			}
			else { //배치된 적 있는 칸이면
				i--; //현재 턴 무효화
				}
		}
				
		//출력 (폭탄을 9로 치환해서 출력)
		for(int i=0; i<row; i++) {
			for(int k=0; k<col; k++) {
				if(map[i][k] == 9) {
					System.out.print("9");
				}
				else {
					System.out.print(map[i][k]);
				}
				System.out.print("\t");
			}
			System.out.println();
			System.out.println();
		}
	}
}
