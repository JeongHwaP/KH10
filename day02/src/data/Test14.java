package data;
//BMI는 체질량지수(비만지수)를 말합니다.
//구하는 공식은 'BMI = 체중(kg) / 키(m)²'입니다.
//키가 180cm이고, 체중이 80kg인 사람의 BMI 지수를 구하여 출력
//(네이버에 BMI 계산기 라고 검색하면 완성된 프로그램이 나옵니다.)
import java.lang.*;
import java.text.DecimalFormat;
public class Test14 {
	public static void main(String[] args) {
		//준비 - 신장(cm), 체중(kg)
		//float height = 180;
		//float weight = 80;
		double height = 180;
		double weight = 80;
		
		//계산 - BMI
		//(공식) BMI = 체중(kg) / 키(m)²
		//float heightM = height / 100;
		//float BMI = weight / (heightM * heightM);
		
		double heightMeter = height / 100;
		
		//double bmi = weight / 키 / 키;
		//double bmi = weight / (키 * 키);
		double bmi = weight / (heightMeter * heightMeter);
		
		//출력
		System.out.println("BMI결과");
		//System.out.println(BMI);
		System.out.println(bmi);
		
		//추가 : 소수점을 2자리까지만 표시
		//(1) 직접 구현
		double bmi2 = (int)(bmi * 100) / 100.0;
		System.out.println(bmi2);
		
		//(2) 라이브러리 사용
		DecimalFormat fm = new DecimalFormat("0.00");
		System.out.println(fm.format(bmi));
	}
}
