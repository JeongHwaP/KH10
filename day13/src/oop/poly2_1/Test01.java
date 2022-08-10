package oop.poly2_1;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//준비
		//int type = 1 or 2 or 3 or 4;
		//int action = 1 or 2 or 3 or 4;
		
		int type = 1;
		int action = 1;
		
		//type을 이용해서 전화기(Phone)를 하나 생성 (업캐스팅 : 하위요소를 상위형태로 보관)
		Phone phone;
		if(type == 1) {
			phone = new Galaxy22s();
		}
		else if(type == 2) {
			phone = new GalaxyFold3();			
		}
		else if(type == 3) {
			phone = new IPhone12();
		}
		else {
			phone = new IPhone13();			
		}
		System.out.println(phone);
		
		if(action == 1){
			phone.camera();
		}
		else if(action == 2) {
			phone.gallery();
		}
		else if(action == 3) {
			phone.call();
		}
		else {
			phone.sms();
		}
	}
}
