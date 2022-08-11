package api.lang.string;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//사용자에게 아이디와 비밀번호를 입력받아서 로그인을 처리하는 프로그램을 구현
		// - 아이디는 'khacademy', 비밀번호는 'student'일 경우에만 로그인 성공 메세지 출력
		//그 외는 로그인 불가 메세지 출력
		//(추가) 허용 아이디와 비밀번호 개수를 늘려보기
		
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String userId = sc.next();
		System.out.print("비밀번호 : ");
		String userPassword = sc.next();
		sc.close();
		
		//계산
		//boolean isLogin = 아이디가 khacademy이고 비밀번호가 student인가요?;
		//boolean isLogin = userId == "khacademy" && userPassword == "student";
		boolean isLogin = userId.equals("khacademy") && userPassword.equals("student");
		
		//출력
		if(isLogin == true) {
			System.out.println("로그인 성공");			
		}
		else {
			System.out.println("로그인 불가");			
		}
	}
}
