package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test06_1 {
	public static void main(String[] args) {
		// 다음 요구사항에 따른 계산을 수행하여 결과를 출력하시오.
		// 철수와 영희는 각자 국내에서 상영하는 영화를 다음과 같이 봤습니다.
		// - 철수 : '이상한 나라의 수학자', '더 배트맨', '인민을 위해 복무하라', '블랙라이트'
		// - 영희 : '더 배트맨', '스파이더맨 : 노웨이 홈', '블랙라이트', '우리가 사랑이라고 믿는 것'
		// (Q) 철수와 영희가 둘 다 본 영화 목록을 출력하세요.
		// (Q) 철수와 영희 중 한 명만 본 영화 목록을 출력하세요.

		// 참고 : 배열로 합집합 구현
		String[] a = new String[] { "이상한 나라의 수학자", "더 배트맨", "인민을 위해 복무하라", "블랙라이트" };
		String[] b = new String[] { "더 배트맨", "스파이더맨 : 노웨이 홈", "블랙라이트", "우리가 사랑이라고 믿는 것" };

		String[] c = new String[a.length + b.length];
		int index = 0;

		// c <-- a
		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			for (int k = 0; k < i; k++) {
				if (c[k].equals(c[i])) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				c[index] = a[i];
				index++;
			}
		}

		// c <-- b
		for (int i = 0; i < b.length; i++) {
			boolean flag = false;
			for (int k = 0; k < index; k++) {
				if (c[k].equals(b[i])) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				c[index] = b[i];
				index++;
			}
		}

		// 버블 정렬
		for (int i = 0; i < index - 1; i++) {
			for (int k = i; k < index - 1; k++) {
				if (c[k].compareTo(c[k + 1]) > 0) {
					String backup = c[k];
					c[k] = c[k + 1];
					c[k + 1] = backup;
				}
			}
		}

		// 출력
		for (int i = 0; i < index; i++) {
			System.out.println(c[i]);
		}
	}
}
