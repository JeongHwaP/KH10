package api.lang.string;

public class Test6_4 {
	public static void main(String[] args) {
		//욕설 필터링 프로그램
		//사용자에게 입력받은 문자열 중에서 욕설에 해당하는 단어를 블라인드(***) 처리하도록 구현
		// - 문자열을 띄어쓰기까지 입력받는 명령 : String text = sc.nextLine();
		//실제 욕 대신 욕같은 단어로 대체합니다.
		// - 신발, 수박, 시베리아, 십장생, 개나리, 주옥, 조카, 시방, 된장, 십자수
		//블라인드 처리 시 별 개수는 3개로 고정합니다.
		//(추가) 필터링 할 때 별 개수(*)를 필터링되는 단어 글자 수와 맞추세요.
		
		//준비
		String[]filter = new String[] {
				"신발", "수박", "시베리아", "십장생", "개나리",
				"주옥", "조카", "시방", "된장", "십자수"
		};
		
		String text = "이런 신발끈 개나리같은 수박씨를 보았나";
	
		String star = "*";
		
		for(int i=0; i<filter.length; i++) {
			//text = text.replace(filter[i], star.repeat(글자수));
			text = text.replace(filter[i], star.repeat(filter[i].length()));
		}
		System.out.println(text);
		
	}
}
