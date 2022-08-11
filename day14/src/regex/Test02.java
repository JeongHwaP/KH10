package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test02 {
	public static void main(String[] args) {
//		문자열을 검사하기 위한 식(도우미 사이트 : regexper)
//		주요 명령
//		^ : 문자열의 시작지점
//		$ : 문자열의 종료지점
//		[abc] : a, b, c중 하나(one of)
//		[a-c] : a부터 c 사이의 글자 중 하나(범위표시)
//		[a-c]{5} : a부터 c사이의 글자 중 하나가 5번 반복
//		[a-c]{3,5} : a부터 c사이의 글자 중 하나가 3에서 5번 반복

		//사용자가 입력한 아이디가 다음 규칙에 맞는지 검사하도록 코드를 작성하시오.
		//아이디의 첫 글자는 알파벳 소문자로 시작해야 한다.
		//아이디의 두 번째 글자부터는 숫자 혹은 알파벳 소문자로 작성되어야 한다.
		//아이디는 총 8글자 이상 20글자 이하로 작성되어야 한다.
		
		//준비
		//String id = "abcdefg1r";
		Scanner sc = new Scanner(System.in);
		System.out.println("사용하실 아이디를 입력하세요.");
		String id = sc.next();
		sc.close();
		
		//계산
		//아이디 규칙
		String regex = "^[a-z][a-z,0-9]{7,19}$";
		boolean test = Pattern.matches(regex, id);
		//System.out.println("글자규칙 = " + test);
		
		//8글자 이상 20글자 이하
		boolean first = id.length() >= 8 && id.length() <= 20;
		//System.out.println("글자수 = " + first);
		
		//출력
		if(test && first) {
			System.out.println("사용하실 수 있는 아이디입니다.");
		}
		else {
			System.out.println("사용하실 수 없는 아이디입니다.");
		}
	}
}
