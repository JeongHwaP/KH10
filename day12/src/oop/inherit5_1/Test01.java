package oop.inherit5_1;

public class Test01 {
	public static void main(String[] args) {
		MP3 a = new MP3("test.mp3", 1000L, 180);
		a.execute();
		a.forward();
		a.rewind();
		
		AVI b = new AVI("test.avi", 100L*1024L*1024L);
		b.execute();
		b.forward();
		b.rewind();
		System.out.println(b.getSpeed());
		
		PPT c = new PPT("test.pptx", 5L*1024L*1024L, 25);
		c.execute();
		c.information();
	}
}
