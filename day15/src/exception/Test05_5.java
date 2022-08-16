package exception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test05_5 {
	public static void main(String[] args) {
		//다음 요구사항에 맞게 프로그래밍 하세요
		// 1. 사용자에게 이름, 국어점수, 수학점수, 영어점수를 입력받아 총점과 평균을 구하는 프로그램을 만듭니다.
		// 2. 사용자가 입력을 잘못한 경우 '잘못된 입력입니다. 처음부터 다시 진행해주세요.'라는 메세지를 출력하고 진행중인 프로그램을 종료합니다.
		// 3. 다음 상황에 해당하지 않으면 입력을 잘못한 것으로 간주합니다.
		// -> 이름은 한글로 2글자 이상 7글자 이하로 작성해야 합니다.
		// -> 점수는 모두 0점이상 100점 이하의 정수인 경우만 가능합니다.
		// 4. 입력이 정상적으로 진행된 경우에는 이름, 총점, 평균을 출력해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		//준비
		try{//Plan A
				
			System.out.print("이름 : ");
			String name = sc.next();
//			if(이름이 2글자 이상 7글자 이하가 아니라면) {
//				
//			}
//			if(name.length()<2 || name.length()>7) {
//				
//			}
//			if(!(name.length()>=2 && name.length()<=7)) {
//				
//			}
			if(!Pattern.matches("^[가-힣]{2,7}$", name)) {
				//catch로 강제 이동시키는 코드 = 강제 예외
				//-> throw new Exception();
				throw new Exception("이름은 한글 2~7글자로 작성해야 합니다.");
			}
			
			System.out.print("국어 : ");
			int korean = sc.nextInt();
			if(korean<0 || korean>100) {
				//throw new Exception();
				throw new Exception("국어점수는 0~100점으로만 설정 가능합니다.");
			}
			
			System.out.print("수학 : ");
			int math = sc.nextInt();
			if(math<0 || math>100) {
				throw new Exception("수학점수는 0~100점으로만 설정 가능합니다.");
			}
			
			System.out.print("영어 : ");
			int english = sc.nextInt();
			if(english<0 || english>100) {
				throw new Exception("영어점수는 0~100점으로만 설정 가능합니다.");
			}
			
			//계산
			//합계 점수, 평균 점수
			int total = korean + math + english;
			float  average = total / 3f;
			
			System.out.println("이름 : " + name);
			System.out.println("총점 : " + total + "점");
			System.out.println("평균 : " + average + "점");
		}
		catch(Exception e) {//Plan B
			if(e.getMessage()==null) {
				System.err.println("입력이 잘못되었습니다.");
			}
			else {
				System.err.println("오류 : " + e.getMessage());				
			}
		}
		//finally는 선택적으로 사용 가능하며 try, catch의 실행 여부와 관계 없이 항상 실행
		finally {
			sc.close();			
		}
	}
}
