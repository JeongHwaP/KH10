package exception;

import java.util.Scanner;

public class Test08_1 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
			Student s = new Student();
			
			System.out.println("이름 : "); s.setName(sc.next());
			System.out.println("국어 : "); s.setKorean(sc.nextInt());
			System.out.println("영어 : "); s.setEnglish(sc.nextInt());
			System.out.println("수학 : "); s.setMath(sc.nextInt());
			
			System.out.println(s.toString());
		}
		catch(Exception e) {
			//System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
