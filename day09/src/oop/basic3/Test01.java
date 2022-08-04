package oop.basic3;

public class Test01 {
	public static void main(String[] args) {
		//객체 생성
		Plan a = new Plan();
		Plan b = new Plan();
		Plan c = new Plan();
		
		//객체 초기화
		a.telecom = "SK";
		a.name = "5G언택트 52";
		a.price = 52000;
		a.data = 200;
		a.call = 1000;
		a.sms = 2000;
		
		b.telecom = "KT";
		b.name = "5G세이브";
		b.price = 45000;
		b.data = 100;
		b.call = 900;
		b.sms = 1500;
		
		c.telecom = "LG";
		c.name = "5G시그니처";
		c.price = 130000;
		c.data = 500;
		c.call = 2000;
		c.sms = 2500;
		
		//객체 정보 출력
		System.out.println(a.telecom);
		System.out.println(a.name);
		System.out.println(a.price);
		System.out.println(a.data);
		System.out.println(a.call);
		System.out.println(a.sms);
		System.out.println();
		
		System.out.println(b.telecom);
		System.out.println(b.name);
		System.out.println(b.price);
		System.out.println(b.data);
		System.out.println(b.call);
		System.out.println(b.sms);
		System.out.println();
		
		System.out.println(c.telecom);
		System.out.println(c.name);
		System.out.println(c.price);
		System.out.println(c.data);
		System.out.println(c.call);
		System.out.println(c.sms);
	}
}
