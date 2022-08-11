package api.lang.string;

public class Test5_3 {
	public static void main(String[] args) {
		//'바나나'라는 제시어가 주어져 있을 때
		//사용자에게 입력받은 글자가 제시어와 이어지는지 검사하여 출력
		//(추가) 반복적으로 수행하면 '끝말잇기' 혹은 '쿵쿵따'를 만들 수 있습니다.
		//끝말잇기는 2글자 이상, 쿵쿵따는 반드시 3글자
		
		//준비
		String given = "바나나";
		String input = "나이스";
		
		//계산
		//- given과 input이 이어집니까?
		
		//(1) .charAt() 사용
		//boolean good = given의 마지막 글자와 input의 첫글자가 같습니까?;
//		char a = given.charAt(2);
//		char b = given.charAt(0);
//		boolean good = given.charAt(2) == given.charAt(0);
		//boolean good = given.charAt(given.length()-1)==input.charAt(0);
		
		//(2) substring(), equals()사용
//		boolean good = given.substring(2).equals(input.substring(0, 2));
		//boolean good = given.substring(given.length()-1).equals(input.substring(0, 1));
		
		//(3) substring(), startsWith()사용
		//boolean good = input이 given의 마지막 글자로 시작합니까?;
		//boolean good = input.startsWith(given의 마지막 글자);
		//boolean good = input.startsWith(given.substring(2));
		//boolean good = input.startsWith(given.substring(given.length()-1));
		
		//(4) substring(), indexOf()사용
		//boolean good = given의 마지막 글자가 input의 처음(0)에 위치한다면;
		//boolean good = input.indexOf(given의 마지막 글자) == 0;
		//boolean good = input.indexOf(given.charAt(given.length()-1)) == 0;
		boolean good = input.indexOf(given.substring(given.length()-1))==0;
		
		//출력
		if(good) {
			System.out.println("이어짐");			
		}
		else {
			System.out.println("안이어짐");			
		}
	}
}
