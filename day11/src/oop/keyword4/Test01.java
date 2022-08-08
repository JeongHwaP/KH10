package oop.keyword4;

import oop.keyword3.Calculator;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(11*11); //11곱하기 11
		System.out.println(Robot.squared(11)); //11의 제곱
		
		System.out.println(Robot.bmi(180, 80)); //키 180, 체중80의 bmi
		
		System.out.println(Robot.subway(1999)); //1999년생의 지하철요금
		
		System.out.println(Robot.triangle(5, 7)); //밑변5, 높이7의 삼각형넓이
		
		System.out.println(Robot.circle(7)); //반지름 7인 원의 넓이
	}
}
