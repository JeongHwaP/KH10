package io;
import java.lang.*;
import java.util.Scanner;
public class Test05 {
	public static void main(String[] args) {
		//사용자에게 신장(cm)과 체중(kg)을 입력받아서 BMI 지수를 계산하여 출력
		//BMI 지수가 24.5가 넘으면 "비만" 아니면 "정상"으로 표시
		//공식 : BMI = 체중(kg) / 키(m)²
		
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.print("신장 입력 : ");
		double height = sc.nextDouble();
		System.out.print("체중 입력 : ");
		double weight = sc.nextDouble();
		sc.close();
		
		//계산
		double heightMeter = height / 100;
		//double bmi = weight / heighMeter / heighMeter;
		double bmi = weight / (heightMeter * heightMeter);
		
		String message;
		if(bmi > 24.5) {
			message = "비만입니다.";
		}
		else {
			message = "정상입니다.";
		}
		
		//출력
		System.out.println("BMI : " + bmi);
		System.out.println(message);
	}
}
