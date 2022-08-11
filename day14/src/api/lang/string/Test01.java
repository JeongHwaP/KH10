package api.lang.string;

public class Test01 {
	public static void main(String[] args) {
		//String - 문자열을 다루는 클래스
		String a = "hello";
		System.out.println("a = " + a);
		
		char[] ch = new char[] {'h','e','l','o'};
		String b = new String(ch);
		System.out.println("b = " + b);
		
		String c = new String("hello");
		System.out.println("c = " + c);
		
		String d = "hello";
		
		//문자열 비교
		//System.out.println(a == b); //a와 b가 정확히 일치하는 값입니까?
		System.out.println(a.equals(b)); //a와 b가 값이 같습니까?
		//System.out.println(a == d);
		System.out.println(a.equals(d));
		
		//문자열에는 대소문자가 있다.
		//무시하려면 (1) 대/소문자로 변환 후 비교 or (2) 대소문자 무시하고 비교
		String e = "JAVA";
		String f = "Java";
		System.out.println(e.equals(f));
		
		//(1)
		//System.out.println(e를 소문자로 바꾼값.equals(f를 소문자로 바꾼값));
		System.out.println(e.toLowerCase().equals(f.toLowerCase()));
		
		//System.out.println(e를 대문자로 바꾼값.equals(f를 대문자로 바꾼값));
		System.out.println(e.toUpperCase().equals(f.toLowerCase()));
		
		//(2)
		System.out.println(e.equalsIgnoreCase(f));
	}
}
