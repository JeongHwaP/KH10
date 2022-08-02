package array;

import java.util.Scanner;

public class Test09_1 {
	public static void main(String[] args) {
		//사용자에게 숫자 5개를 입력받아 배열에 저장합니다.
		//입력받은 모든 숫자를 출력합니다.
		//입력받은 모든 숫자의 합계와 평균을 구하여 출력합니다.
		
		//배열 준비
		int[] data = new int[5];
				
		Scanner sc = new Scanner(System.in);
		for(int i=0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
				
		for(int i=0; i < data.length; i++) {
			System.out.println("data = " + data[i]);	
			}
				
		int total = 0;
		for(int i=0; i < data.length; i++) {
			total += data[i];
		}
				
		System.out.println("합계 = " + total);
		double average = (double)total / data.length;
		System.out.println("평균 = " + average);
	}
}
