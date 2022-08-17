package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test07_8 {
	public static void main(String[] args) {
		//이번 주 로또 예상번호 6개를 추첨하여 출력
		//단, 번호는 낮은 것부터 나와야 합니다.
		
		//풀이 방법
		// 1. 1부터 45까지를 6번 추첨하는 방법
		// 2. 1부터 45를 저장하고 섞은 뒤 6개를 추첨하는 방법
		
		List<Integer> lotto = new ArrayList<>();
		for(int i=1; i <= 45; i++) {
			lotto.add(i);
		}

		Collections.shuffle(lotto);
		//System.out.println(lotto);
		
		//lotto의 앞 6개를 choice에 옮겨서 정렬 후 출력
		
		//List<Integer> choice = lotto.subList(0, 6);
		List<Integer> choice = new ArrayList<>();
		//앞에서 6개 추첨
		for(int i=0; i < 6; i++) {
			choice.add(lotto.get(i));
		}
		
		Collections.sort(choice);
		for(int i=0; i < choice.size(); i++) {
			System.out.println(choice.get(i));
		}
	}
}
