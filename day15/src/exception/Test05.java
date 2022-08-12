package exception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test05 {
	public static void main(String[] args) {
		//다음 요구사항에 맞게 프로그래밍 하세요
		// 1. 사용자에게 이름, 국어점수, 수학점수, 영어점수를 입력받아 총점과 평균을 구하는 프로그램을 만듭니다.
		// 2. 사용자가 입력을 잘못한 경우 '잘못된 입력입니다. 처음부터 다시 진행해주세요.'라는 메세지를 출력하고 진행중인 프로그램을 종료합니다.
		// 3. 다음 상황에 해당하지 않으면 입력을 잘못한 것으로 간주합니다.
		// -> 이름은 한글로 2글자 이상 7글자 이하로 작성해야 합니다.
		// -> 점수는 모두 0점이상 100점 이하의 정수인 경우만 가능합니다.
		// 4. 입력이 정상적으로 진행된 경우에는 이름, 총점, 평균을 출력해주세요.
		
		//준비
		try {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("국어 : ");
			int k = sc.nextInt();
			
			System.out.print("수학 : ");
			int m = sc.nextInt();
			
			System.out.print("영어 : ");
			int e = sc.nextInt();
			
			sc.close();
			
			//계산
			//합계 점수, 평균 점수
			int total = k + m + e;
			double avg = total / 3.0;
			System.out.println("총점 : " + total + "점");
			System.out.println("평균 : " + avg + "점");
			
			//이름 한글로 2글자 이상 7글자 이하
			String regex = "^[가-힣]{2,7]$";
			boolean test = Pattern.matches(regex, name);
			
			//점수는 0점 이상 100점 이하의 정수
			boolean score = k >= 0 && k <= 100;
			score &= m >= 0 && m <= 100;
			score &= e >= 0 && e <= 100;
			
			//출력
			if(test && score) {
				System.out.println("이름 : " + name);
				System.out.println("총점 : " + total);
				System.out.println("평균 : " + avg);
			}
			else {
				System.exit(0);
			}
		}
		catch(Exception e) {
			System.err.println("잘못된 입력입니다. 처음부터 다시 진행해주세요.");
		}
	}
}
