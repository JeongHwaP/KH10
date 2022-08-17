package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test01 {
	public static void main(String[] args) {
		//Set
		// - 중복이 없는 저장소 (중복이 필요없을때)
		// - 순서가 정해진 저장소
		
		TreeSet a = new TreeSet(); //자료형을 명시하지 않아서 경고가 나옴
		TreeSet<String>b = new TreeSet<>();
		Set<String>c = new TreeSet<>(); //순서가 정해짐(가나다순)
		
		//추가 - .add()
		c.add("마리오");
		c.add("루이지");
		c.add("쿠파");
		c.add("피오나");
		c.add("루이지");
		
		//검색 - .contains()
		System.out.println(c.contains("피카츄")); //피카츄가 있는가?
		System.out.println(c.contains("루이지")); //루이지가 있는가?
		
		//삭제 - .remove()
		c.remove("마리오"); //마리오를 삭제
		
		System.out.println(c);
		System.out.println(c.size()); //데이터가 몇개인가?
		
		//주의 - ,get()이 없다. = 낱개를 꺼낼수가 없다.
		
	}
}
