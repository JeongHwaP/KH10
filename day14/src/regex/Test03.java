package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test03 {
	public static void main(String[] args) {
		//사용자가 입력한 닉네임이 다음 규칙에 맞는지 검사하도록 코드를 작성하시오.
		//닉네임은 한글 또는 숫자로만 작성되어야 한다.
		//닉네임은 2글자 이상 10글자 이하로 작성되어야 한다.
		//'ㅋㅋㅋ', 'ㅡㅡ'와 같은 자음 모음만 있는 경우는 불가능하다.
		
		//준비
		//String nickname = "정화1";
		Scanner sc = new Scanner(System.in);
		System.out.println("사용하실 아이디를 입력하세요.");
		String nickname = sc.next();
		sc.close();
		
		//계산
		//2글자 이상 10글자 이하
		boolean first = nickname.length() >= 2 && nickname.length() <= 10;
		//System.out.println("글자 수 = " + first);
		
		//닉네임 규칙
		String regex = "^[가-힣0-9]{2,10}$";
		boolean test = Pattern.matches(regex, nickname);
		//System.out.println("글자 규칙 = " + test);
		
		//출력
		if(first && test) {
			System.out.println("사용하실 수 있는 닉네임입니다.");
		}
		else {
			System.out.println("사용하실 수 없는 닉네임입니다.");
		}
	}
}
