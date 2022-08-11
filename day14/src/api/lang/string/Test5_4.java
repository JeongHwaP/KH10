package api.lang.string;

import java.util.Scanner;

public class Test5_4 {
	public static void main(String[] args) {
		//'바나나'라는 제시어가 주어져 있을 때
		//사용자에게 입력받은 글자가 제시어와 이어지는지 검사하여 출력
		//(추가) 반복적으로 수행하면 '끝말잇기' 혹은 '쿵쿵따'를 만들 수 있습니다.
		//끝말잇기는 2글자 이상, 쿵쿵따는 반드시 3글자
		
		//준비
		String given = "바나나";
		
		Scanner sc = new Scanner(System.in);
		System.out.print(given + "! 쿵쿵따! ->");
		String input = sc.next();
		sc.close();
		
		//계산
		boolean good = given.charAt(given.length()-1)==input.charAt(0);
	
		
		//출력
		if(good) {
			System.out.println("이어짐");			
		}
		else {
			System.out.println("안이어짐");			
		}
	}
}
