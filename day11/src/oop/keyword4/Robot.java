package oop.keyword4;

public class Robot {
	// 1. 11의 제곱
	// int = 메소드의 반환형(실행 후의 결과물형)
	public static int squared(int value) {
		return value * value;
	}
	
	// 2. 신장 180cm, 체중 80kg인 사람의 BMI	
	public static double bmi(double cm, double kg) {
		double m = cm / 100;
		return kg / (m*m);
	}
	
//	 3. 1999년생의 지하철 요금(이전 문제와 동일한 요금표)
	public static int subway(int year) {
		int age = 2022 - year + 1;
		if(age < 8 || age >= 65) {
			return 0;			
		}
		else if(age < 14) {
			return 450;
		}
		else if(age < 20) {
			return 720;
		}
		else {
			return 1250;
		}
	}
	
	// 4. 밑변 5, 높이 7인 삼각형의 넓이
	public static double triangle(double width, double height) {
		return width * height / 2.0;
	}
	
	// 5. 반지름 7인 원의 넓이
	public static double circle(double radius) {
		return 3.14 * radius * radius;
	}
}
