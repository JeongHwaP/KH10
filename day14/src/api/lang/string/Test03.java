package api.lang.string;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//사용자에게 프로그램에서 사용할 닉네임을 입력받을 예정입니다.
		//닉네임은 2글자 이상 10글자 이내로 설정해야 합니다.
		//닉네임에는 절대로 '운영자'라는 글자가 포함될 수 없습니다.
		//위의 경우에 해당한다면 '잘못된 닉네임 형식입니다'출력
		//아니면 '닉네임 설정 완료'출력
		
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.print("닉네임 : ");
		String nickname = sc.next();
		sc.close();
		
		//계산
		//(1) 글자 수 = .length()
		//boolean first = 글자수가 2글자 이상 10글자 이하;
		boolean first = nickname.length() >= 2 && nickname.length() <= 10;
		System.out.println("first = " + first);
		
		//(2) 운영자의 포함 여부 - .contains()
		//boolean second = nickname.contains("운영자") == false;
		boolean second = !nickname.contains("운영자");
		//System.out.println("second = " + second);
		
		//boolean result = first && second;
		
		//출력
		if(first && second) {
			System.out.println("닉네임 설정 완료");			
		}
		else {			
			System.out.println("잘못된 닉네임입니다.");
		}
	}
}
