package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test03 {
	public static void main(String[] args) {
		//사용자가 입력한 닉네임이 다음 규칙에 맞는지 검사하도록 코드를 작성하시오.
		//닉네임은 한글 또는 숫자로만 작성되어야 한다.
		//닉네임은 2글자 이상 10글자 이하로 작성되어야 한다.
		//'ㅋㅋㅋ', 'ㅡㅡ'와 같은 자음 모음만 있는 경우는 불가능하다.
		
//		//유니코드표 안보고 한글 번호 맞추기
//		System.out.println((int)'가');
//		System.out.println((int)'힣');
//		System.out.println((int)'ㄱ');
//		System.out.println((int)'ㄲ');
//		System.out.println((int)'ㅡ');
//		-> 자음(ㄱ-ㅎ), 모음(ㅏ-ㅣ), 글자(가-힣) 따로 설정해야함
		
		//준비
		//String nickname = "정화1";
		Scanner sc = new Scanner(System.in);
		System.out.println("사용하실 아이디를 입력하세요.");
		String nickname = sc.next();
		sc.close();
		
		//계산
		//2글자 이상 10글자 이하
//		boolean first = nickname.length() >= 2 && nickname.length() <= 10; //위 계산식에 표기 되어있어서 없어도됨
		//System.out.println("글자 수 = " + first);
		
		//닉네임 규칙
		String regex = "^[가-힣0-9]{2,10}$";
		boolean test = Pattern.matches(regex, nickname); //왼쪽이 검사식, 오른쪽이 검사값 -> 순서 조심!
		//System.out.println("글자 규칙 = " + test);
		
		//출력
		//if(first && test) {
		if(test) {
			System.out.println("사용하실 수 있는 닉네임입니다.");
		}
		else {
			System.out.println("사용하실 수 없는 닉네임입니다.");
		}
	}
}
