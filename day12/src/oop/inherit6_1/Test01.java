package oop.inherit6_1;

public class Test01 {
	public static void main(String[] args) {
		Galaxy22s a = new Galaxy22s("010-1234-5678", "빨강");
		a.call();
		a.sms();
		a.samsungPay();
		a.bixby();
		
		GalaxyFold3 b = new GalaxyFold3("010-9123-4567", "주황");
		b.call();
		b.sms();
		b.samsungPay();
		b.iris();
		
		IPhone12 c = new IPhone12("010-8912-3456", "노랑");
		c.call();
		c.sms();
		c.siri();
		c.itunes();
		
		IPhone13 d = new IPhone13("010-7891-2345", "초록");
		d.call();
		d.sms();
		d.siri();
		d.faceTime();
	}
}
