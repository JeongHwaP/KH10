package data;
import java.lang.*;
import java.util.Calendar;
public class Test18 {
	public static void main(String[] args) {
		//2000년생이 편의점에 와서 담배를 사려고 합니다.
		//구매 가능한지 판정해서 출력
		//(담배는 한국 나이로 20세 이상이면 구매가 가능합니다.)
		
		//한국식 나이는 태어난 해부터 현재까지의 숫자 개수
		//= 두개의 숫자 사이의 개수
		
		//준비
		//int 올해 = 2022;
		//int 년생 = 2000;
		//int 구매가능 = 20;
		int year = 2000;
		//int now = 2022;
		int now = Calendar.getInstance().get(Calendar.YEAR);
		
		//계산
		//int 나이 = 올해 + 1 - 년생; 
		//boolean 구매 = 나이 >= 구매가능;
		int age = now - year + 1;
		//System.out.println(age);
		
		boolean adult = age >= 20;
		
		//출력
		//System.out.println(구매);
		System.out.println(adult);
	}
}
