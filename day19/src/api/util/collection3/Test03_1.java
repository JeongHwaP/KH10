package api.util.collection3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test03_1 {
	public static void main(String[] args) {
		//검색엔진 검색어 수집기 만들기
		//검색엔진은 사용자가 입력한 정보를 수집하도록 설계되어 있습니다.
		//이를 토대로 예측을 한다던가 다양한 방법으로 활용을 합니다.
		//빈도만 측정하려고 할 때, 사용자에게 지속적으로 입력받고 이를 카운팅하는 프로그램을 구현
		//주의사항
		// 1. 대문자 소문자를 무시하도록 구현
		// 2. java와 j a v a 는 같은 단어로 취급되도록 처리
		//검색어 입력 : 자바
		//[자바] 검색이 완료되었습니다. 현재 검색횟수 [1]
		//검색어 입력 : 자바
		//[자바] 검색이 완료되었습니다. 현재 검색횟수 [2]
		//검색어 입력 : 파이썬
		//[파이썬] 검색이 완료되었습니다. 현재 검색횟수 [1]
		//검색어 입력 : 종료
		//검색 프로그램을 종료합니다.
		
		//저장소 생성
		Map<String, Integer>history = new TreeMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색어 : ");
		String keyword = sc.nextLine();
		
		history.put(keyword, 1);
		System.out.println("[" + keyword + "] 검색이 완료되었습니다." + "현재 검색횟수 [" + history.get(keyword) + "]");
		
		sc.close();
	}
}
