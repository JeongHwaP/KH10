package api.lang.string;

import java.util.Random;
import java.util.Scanner;

public class Test5_6 {
	public static void main(String[] args) {
		//'바나나'라는 제시어가 주어져 있을 때
		//사용자에게 입력받은 글자가 제시어와 이어지는지 검사하여 출력
		//(추가) 반복적으로 수행하면 '끝말잇기' 혹은 '쿵쿵따'를 만들 수 있습니다.
		//끝말잇기는 2글자 이상, 쿵쿵따는 반드시 3글자
		
		Scanner sc = new Scanner(System.in);
		
		//준비
		String[] words = new String[] {
				"바나나", "타이어", "카센터", "사거리", "신발끝"
		};
		
		Random r = new Random();
		int index = r.nextInt(words.length);
		String given = words[index];
		
		while(true) {
			System.out.print(given + "! 쿵쿵따! -> ");
			String input = sc.next();
			
			//계산
			boolean good = given.charAt(given.length()-1)==input.charAt(0);
			//good = good && input.length() == 3;
			good &= input.length() == 3; //위 코드를 줄임
			
			//출력
			if(good) {
				//System.out.println("이어짐");
				given = input; //제시어 교체
			}
			else {
				//System.out.println("안이어짐");
				break;
			}
		}
		
		sc.close();
		
		System.out.println("게임 오버!");
	}
}
