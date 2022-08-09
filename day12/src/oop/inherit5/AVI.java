package oop.inherit5;

public class AVI extends File{
	//필드
	private double speed;

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	//메소드
	public void forward() {
		System.out.println("빨리감기 실행");
	}
	public void rewind() {
		System.out.println("되감기 실행");
	}
	
}
