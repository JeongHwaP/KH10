package loop;
//import java.lang.*;
public class Test13 {
	public static void main(String[] args) {
		//고대 그리스에 평범한 노인이 살고 있었습니다.
		//어느날 왕이 소문을 듣고 노인에게 말했습니다.
		// "갖고 싶은게 있으면 말해봐라! 다 들어줄게!"
		// 노인이 말했습니다.
		// "저는 욕심이 없습니다. 30일동안 첫 날은 1원만 주시고 둘째 날 부터는 두배를 주십시오."
		//(1) 한달동안 노인이 받게되는 금액을 일자별로 출력
		//(2) 노인의 통장에 한달 뒤에 찍히는 금액을 출력
		//(3) 40일이면 어떻게 되는지 출력
		
		long money = 1;
		long total = 0;
		for(int day = 1; day <= 40; day++) {
			System.out.println(day + "일 - " + money + "원");
			total += money;
			money *= 2;
		}
		System.out.println("합계 = " + total + "원");
	}
}
