package loop;
//import java.lang.*;
import java.util.Scanner;
public class Test10 {
	public static void main(String[] args) {
		//사용자에게 10개의 숫자를 입력받아 짝수와 홀수 개수를 각각 구하여 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		for(int i = 0; i < 10; i++) {
			int number = sc.nextInt();
			
			for(i = 1; i <= number; i++) {
				if(number % 2 == 0) {
					System.out.println(number + " : 짝수");
				}
				else {
					System.out.println(number + " : 홀수");
				}
			}
		}
		sc.close();
	}
}
