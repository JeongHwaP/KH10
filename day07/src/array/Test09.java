package array;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		//사용자에게 숫자 5개를 입력받아 배열에 저장합니다.
		//입력받은 모든 숫자를 출력합니다.
		//입력받은 모든 숫자의 합계와 평균을 구하여 출력합니다.
		
		Scanner sc = new Scanner(System.in);
		int [] number = new int[5];
		
		int total = 0;
		
		for(int i = 1; i <= number.length; i++) {
			System.out.print("숫자 : ");
			int user = sc.nextInt();
			
			total += user;
		}
		
		sc.close();
		
		System.out.println("합계 : " + total);
		
		double avg = (double)total / number.length;
		System.out.println("평균 : " + avg);
	}
}
