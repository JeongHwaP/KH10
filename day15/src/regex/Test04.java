package regex;

import java.util.regex.Pattern;

public class Test04 {
	public static void main(String[] args) {
		//사용자에게 생년월일을 'YYYY - MM - DD'형식으로 입력받아 올바른 날짜 형식인지 검사하세요.
		// 1. 연도는 1900년부터 2099년까지 가능합니다.
		// 2. 최초 검사식을 만들 때는 모든 달은 31일까지 있다고 가정하고 만듭니다.
		// 3. 2번을 풀고 나서 큰달과 작은달을 구분해서 만듭니다. (2월은 28일로 가정)
		// 4. 3번을 풀고 나서 윤년을 고려하도록 만듭니다. (정규 표현식만으로 불가능)
		
		String date = "2022-08-12";
		
//		String regex = "^YYYY-MM-DD$";
//		String regex = "^(19YY-20YY)-(1-12)-(1-31)$";
//		String regex = "^((19|20)[0-9]{2})-(1-12)-(1-31)$";
		//String regex = "^(19[0-9]{2}|20[0-9]{2})-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[01])$";

		// 3번
		//^(19[0-9]{2}|20[0-9]{2})-(02-|작은달-|큰달-(0[1-9]|1[0-9]|2[0-9]|3[01])$;
		String regex = "^(19[0-9]{2}|20[0-9]{2})-(02-(0[1-9]|1[0-9]|2[0-8])|(0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30)|(0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))$";
		
		boolean test = Pattern.matches(regex, date);
		System.out.println(test);
		
		
		if(test) {
			System.out.println("올바른 날짜");
		}
		else {
			System.out.println("올바르지 않은 날짜");
		}
	}
}
