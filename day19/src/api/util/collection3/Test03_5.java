package api.util.collection3;

import java.net.URL;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test03_5 {
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
		
//		String url = ;
		
		while(true) {
			System.out.print("검색어 : ");
			String keyword = sc.nextLine();
			keyword = keyword.toLowerCase(); //소문자 변환
			//keyword = keyword.trim(); //좌우 불필요한 여백 제거
			keyword = keyword.replace(" ", ""); //공백 제거
			
			if(keyword.equals("종료")) {
				break;
			}
			
//			Runtime.getRuntime().exec("cmd /c start " + url + keyword)
			
			//int count = 1 or history.get(keyword);
			int count;
			//if(검색한적이 있으면) {
			if(history.containsKey(keyword)) { //검색한적이 있으면
				count = history.get(keyword) + 1;
			}
			else {
				count = 1;
			}
			history.put(keyword, count);
			System.out.println("[" + keyword + "] 검색이 완료되었습니다." + "현재 검색횟수 [" + history.get(keyword) + "]");
			
			System.out.println(history);
		}
		
		sc.close();
		
		System.out.println("프로그램 종료");
		//검색 이력 출력
	}
}
