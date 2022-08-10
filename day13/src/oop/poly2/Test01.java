package oop.poly2;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Phone a = new Galaxy22s();
		a.camera();
		a.gallery();
		a.call();
		a.sms();
		
		Phone b = new GalaxyFold3();
		b.camera();
		b.gallery();
		b.call();
		b.sms();
		
		Phone c = new IPhone12();
		c.camera();
		c.gallery();
		c.call();
		c.sms();
		
		Phone d = new IPhone13();
		d.camera();
		d.gallery();
		d.call();
		d.sms();
		
		sc.close();
	}
}
