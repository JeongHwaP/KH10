package oop.keyword9_1;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		final String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		System.out.print("닉네임 : ");
		String nickname = sc.next();
		
		sc.close();
		
		Member a = new Member(id, password, nickname);
		a.print();
	}
}
