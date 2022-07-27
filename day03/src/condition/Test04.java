package condition;
import java.lang.*;
import java.util.Calendar;
public class Test04 {
	public static void main(String[] args) {
		//4자리로 출생년도가 주어졌을 때(ex : 1995)
		//이 사람이 지하철 무임승차 대상인지 확인해서 알려주도록 구현
		//(65세 이상의 어르신과 7세 이하의 영유아가 무임승차 대상)
		
		//준비 - 출생년도 4자리
		int now = Calendar.getInstance().get(Calendar.YEAR);
		int year = 1995;
		
		//계산
		int age = now - year + 1;
		//boolean 무임승차가능 = age >= 65 || age <=  7;
		
		//출력
		System.out.println("당신의 나이는 " + age + "세 입니다.");
		
		//if(나이가 7살 이하 또는 65세 이상이라면) {
		//if(무임승차가능 == true) {
		if(age <= 7 || age >= 65) {
			System.out.println("무임승차 대상입니다.");
		}
		//if(나이가 7살 초과 그리고 65세 미만이라면) {
		//if(무임승차가능 == false) {
		//if(age > 7 && age < 65) {
		else {//if가 거짓말이면
			System.out.println("무임승차 대상이 아닙니다.");
		}
	}
}
