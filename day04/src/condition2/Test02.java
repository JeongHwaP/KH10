package condition2;
import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
		//Test01을 switch~case 구문으로 변경
		
		int direction = 2;
		
		switch(direction) {
		case 2:
			System.out.println("아래로 한 칸 이동");
			break; //더 이상의 실행을 멈추고 나가세요.
		case 4:
			System.out.println("왼쪽으로 한 칸 이동");
			break;
		case 6:
			System.out.println("오른쪽으로 한 칸 이동");
			break;
		case 8:
			System.out.println("아래로 한 칸 이동");
			break;
			default:
				System.out.println("잘못된 입력");
				break; // 마지막이라 생략가능
		}
	}
}
