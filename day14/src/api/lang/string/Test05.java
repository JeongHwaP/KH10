package api.lang.string;

public class Test05 {
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
		boolean good = given.charAt(given.length()-1)==input.charAt(0);
		
		
		//출력
		if(good) {
			System.out.println("이어짐");			
		}
		else {
			System.out.println("안이어짐");			
		}
	}
}
