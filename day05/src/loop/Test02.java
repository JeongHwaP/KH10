package loop;
import java.lang.*;
import java.util.Scanner;
public class Test02 {
	public static void main(String[] args) {
		//사용자에게 숫자를 5개 입력받는 프로그램을 구현
		
		//(주의) 도구는 반복 내에서 만들지 않는다!
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오.");
		
		for(int i=0; i < 5; i++) {
			int number = sc.nextInt();
		}
		
			sc.close();
		
	}
}
