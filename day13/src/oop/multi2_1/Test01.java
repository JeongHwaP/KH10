package oop.multi2_1;

public class Test01 {
	public static void main(String[] args) {
		Drone a = new Drone();
		a.on();
		a.move();
		a.fly();
		a.off();
		
		Kickboard b = new Kickboard();
		b.on();
		b.move();
		b.off();
		
		Bus c = new Bus();
		c.move();
		
		Train d = new Train();
		d.move();
		d.reservation();
		
		Airplane e = new Airplane();
		e.move();
		e.fly();
		e.reservation();
	}
}
