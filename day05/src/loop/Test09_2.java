package loop;
//import java.lang.*;
import java.util.Scanner;
public class Test09_2 {
	public static void main(String[] args) {
		//소수 판정 프로그램
		//소수는 나누어 떨어지는 값이 없는 숫자를 말합니다 (ex : 2, 3, 5, 7, 11,...)
		//모든 숫자는 1로 나누기가 가능하고, 자기자신으로 나누기가 가능
		//ex : 4는 소수가 아님 -> 4 % 1 = 0, 4 % 2 = 0< 4 % 3 = 1, 4 % 4 = 0
		//ex : 5는 소수 -> 5 % 1 = 0, 5 % 2 = 1, 5 % 3 = 2, 5 % 4 = 1, 5 % 5 = 0
		
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int number = sc.nextInt();
		sc.close();
		
		int count = 0;
		
		//계산 - 1부터 number까지의 숫자로 나누기를 시도
		for (int i =1; i <= number; i++) {
			//System.out.println(number + " % " + i + " = " + number % i);
			if(number % i == 0) {//number가 i로 나누어 떨어진다면
				//System.out.println("찾았다.");
				count++;
			}
		}
		
		System.out.println("cont = " + count);
		
		//출력
		if(count == 2) {
			System.out.println(number + " : 소수입니다.");			
		}
		else {
			System.out.println(number + " : 소수가 아닙니다.");			
		}
	}
}
