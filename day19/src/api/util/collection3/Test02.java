package api.util.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//다음 아이디와 비밀번호를 Map에 저장해두고 로그인 프로그램을 구현
		// - 아이디 : testuser, 비밀번호 : testuser1234
		// - 아이디 : student, 비밀번호 : student1234
		// - 아이디 : manager, 비밀번호 : manager1234
		//요구사항
		// 1. 사용자에게 아이디와 비밀번호를 입력받는다.
		// 2. 저장소에 있는 아디이 = 비밀번호 정보와 일치하는 항목이 있다면 '로그인 성공' 출력
		// 3. 일치하는 항목이 없으면 '로그인 실패' 출력
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, String>a = new HashMap<>();
		
		a.put("testuser", "testuser1234");
		a.put("student", "student1234");
		a.put("manager", "manager1234");
		
		//System.out.println(a);
		
		System.out.println("아이디 : ");
		String id = sc.next();
		System.out.println("비밀번호 : ");
		String password = sc.next();
		
		sc.close();
		
		//if(입력하는 아이디와 비밀번호가 저장소에 있는 정보와 일치한다면) {
//		if() {
//			System.out.println("로그인 성공");
//		}
//		else {
//			System.out.println("로그인 실패");
//		}
		
	}
}
