package api.lang.etc;

public class Test04 {
	public static void main(String[] args) {
		//String 합성(StringBuffer, StringBuilder)
		// - 문자열의 덧셈이 성능이 좋지 않은 이유는 문자열이 불변(immutable)System.out.println(star);이기 때문
		
		//별 생성 코드
		
		//10개
		long a = System.currentTimeMillis();
		
		String star = "";
		for(int i=0; i<1000000; i++) {
			star+="*";
		}
		
		long b = System.currentTimeMillis();
		System.out.println(b-a);
		//System.out.println(star);
	}
}
