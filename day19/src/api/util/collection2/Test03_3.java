package api.util.collection2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test03_3 {
	public static void main(String[] args) {
		//사용자에게 글 번호를 입력받아 해당하는 번호의 게시물에 좋아요를 설정/해제하는 프로그램을 구현
		// 1. 사용자에게 글 번호를 입력받는다.
		// 2. 글 번호를 Set을 이용하여 저장하거나 삭제하도록 구현
		// 3. 좋아요를 누른 적이 없는 글 번호가 입력된 경우 '?번 글에 좋아료를 눌렀습니다.' 출력 후 저장소에 번호를 저장
		// 4. 좋아요를 누른 적이 있는 글 번호가 입력된 경우 '?번 글에 좋아요를 취소했습니다.' 추력 후 저장소에서 번호를 제거
		// 5. 0을 입력하면 프로그램을 종료하고 종료 직전까지 좋아요를 누른 모든 게시글의 번호를 오름차순으로 출력한다.
		
		Set<Integer>like = new TreeSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("번호 : ");
			int number = sc.nextInt();		
			
			if(number == 0) { //0을 입력하면 종료되도록 처리(가장 먼저 검사)
				break;
			}
			
			//if(number가 이미 있다면) {
			if(like.contains(number)) {
				like.remove(number);
				System.out.println(number + "번호 게시글에 좋아요를 취소했습니다.");
			}
			else {
				like.add(number);
				System.out.println(number + "번호 게시글에 좋아요를 눌렀습니다.");
			}
		}
		
		sc.close();
		
		//목록 출력
		System.out.println(like);
		
		//개별 접근은 불가능하지만 전체를 다 추출하는 것은 가능하다.
		// 1. Iterator라는 별개의 저장소로 이동
		Iterator<Integer> iter = like.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
//			int number = iter.next();
//			System.out.println(number);
		}
		
		// 2. 확장형 for 구문을 사용
		//for(like에 있는 데이터 개수만틈 몽땅) {
		for(int number : like) { //오른쪽이 저장소 왼쪽이 저장할 변수
			System.out.println(number);
		}
		
		// 3. 배열로 복사하거나 List로 복사(비추천 - 메모리 낭비가 심함)
		
		
	}
}
