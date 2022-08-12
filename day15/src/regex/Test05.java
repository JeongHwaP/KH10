package regex;

public class Test05 {
	public static void main(String[] args) {
		// 반드시 1개 이상에 대한 처리
		String password = "Hello1234!@#$";
		
		int upperCount = 0, lowerCount = 0, numberCount = 0, specialCount = 0;
		
		for(int i=0; i<password.length(); i++) {
			char ch = password.charAt(i);
			//if(대문자라면) {
			if(ch>='A' && ch<='Z') {
				upperCount++;
			}
			//else if(소문자라면) {
			else if(ch>='a' && ch<='z') {
				lowerCount++;
			}
			//else if(숫자라면) {
			else if(ch>='0' && ch<='9') {
				numberCount++;
			}
			//else if(특수문자라면) {
			else if(ch == '!' || ch == '@' || ch == '#' || ch == '$') {
				specialCount++;
			}
		}
		
		boolean check = upperCount > 0;
		check &= lowerCount > 0;
		check &= numberCount > 0;
		check &= specialCount > 0;
		check &= password.length() >= 8 && password.length() <= 16;
		
		System.out.println("결과 : " + check);
		
//		^(대문자 반드시 1개 이상)[A-Za-z0-9!@#$]{8,16}$
//		^(?=.*[A-Z])[A-Za-z0-9!@#$]{8,16}$
//		^(?=.*[A-Z])(?=.*[a-z])[A-Za-z0-9!@#$]{8,16}$ -> 소문자도 반드시 1개 이상
	}
}
