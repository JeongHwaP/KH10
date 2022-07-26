package array2d;

public class Test02 {
	public static void main(String[] args) {
		//2차원 배열
		
		//생성
		
		int[][] a = new int[2][3];
		//a ----> a[0] ----> [0] [0] [0]
		//a ----> a[1] ----> [0] [0] [0]
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		
		int[][] b = new int[][] {
			{10, 20, 30},
			{40, 50, 60}
			};
			//b ----> b[0] ----> [10] [20] [30]
			//b ----> b[1] ----> [40] [50] [60]
			System.out.println(b.length);
			System.out.println(b[0].length);
			System.out.println(b[1].length);
			
			//전체출력
			System.out.print(b[0][0]);
			System.out.print("\t");
			System.out.print(b[0][1]);
			System.out.print("\t");
			System.out.print(b[0][2]);
			System.out.print("\t");
			System.out.println();
			
			System.out.print(b[1][0]);
			System.out.print("\t");
			System.out.print(b[1][1]);
			System.out.print("\t");
			System.out.print(b[1][2]);
			System.out.print("\t");
			System.out.println();
			
			//반복문으로 출력
			for(int i=0; i<=1; i++) {
				for(int k=0; k<=2; k++) {
					System.out.print(b[i][k]);
					System.out.print("\t");
				}
				System.out.println();
			}
			
			//크기를 length로 최적화
			for(int i=0; i<b.length; i++) {
				for(int k=0; k<b[i].length; k++) {
					System.out.print(b[i][k]);
					System.out.print("\t");
				}
				System.out.println();
			}
	}
}
