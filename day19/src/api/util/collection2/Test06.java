package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test06 {
	public static void main(String[] args) {
		//다음 요구사항에 따른 계산을 수행하여 결과를 출력하시오.
		//철수와 영희는 각자 국내에서 상영하는 영화를 다음과 같이 봤습니다.
		// - 철수 : '이상한 나라의 수학자', '더 배트맨', '인민을 위해 복무하라', '블랙라이트'
		// - 영희 : '더 배트맨', '스파이더맨 : 노웨이 홈', '블랙라이트', '우리가 사랑이라고 믿는 것'
		//(Q) 철수와 영희가 둘 다 본 영화 목록을 출력하세요.
		//(Q) 철수와 영희 중 한 명만 본 영화 목록을 출력하세요.
		
		Set<String>a = new TreeSet<>(); //철수
		a.add("이상한 나라의 수학자");
		a.add("더 배트맨");
		a.add("인민을 위해 복무하라");
		a.add("블랙라이트");
		
		Set<String>b = new TreeSet<>(); //영희
		b.add("더 배트맨");
		b.add("스파이더맨 : 노웨이 홈");
		b.add("블랙라이트");
		b.add("우리가 사랑이라고 믿는 것");
		
		Set<String>c = new TreeSet<>(); //합집합
		c.addAll(a);
		c.addAll(b);
		//System.out.println(c);
		
		Set<String>d = new TreeSet<>(); //둘 다 본 영화 (교집합)
		d.addAll(a);
		d.retainAll(b);
		System.out.println("둘 다 본 영화 목록 : " + d);
		
		Set<String>g = new TreeSet<>(); //둘 중 한 명만 본 영화(합집합 - 교집합)
		g.addAll(c);
		g.removeAll(d);
		System.out.println("둘 중 한 명만 본 영화 목록 : " + g);
		
		Set<String>e = new TreeSet<>(); //철수만 본 영화(차집합)
		e.addAll(a);
		e.removeAll(b);
		System.out.println("철수만 본 영화 목록 : " + e);
		
		Set<String>f = new TreeSet<>();//영희만 본 영화(차집합)
		f.addAll(b);
		f.removeAll(a);
		System.out.println("영희만 본 영화 목록 : "+ f);
	}
}
