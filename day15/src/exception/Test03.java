package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//예외(Exception)
		// - 예상치 못한 돌발상황
		// - java.util.InputMismatchException
		// - java.lang.ArithmeticException
		
		try { //아무 문제 없을 때 실행될 코드 (Plan A)
			Scanner sc = new Scanner(System.in);
			
			System.out.print("술값 : ");
			int total = sc.nextInt();
			
			System.out.print("인원 : ");
			int people = sc.nextInt();
			
			sc.close();
			
			int price = total / people;
			int etc = total % people;
			
			System.out.println("1인당 " + price + "원");
			System.out.println("자투리 " + etc + "원");
		}
		//catch(RuntimeException e) { //RuntimeException에 대한 Plan B
		catch(Exception e) { //Exception에 대한 Plan B
		//catch(Throwable e) { //Throwable에 대한 Plan B -> api 확인결과 Error가 있다.
		//catch(Object e) { //error
			System.err.println("에러 발생");
		}
	}
}
