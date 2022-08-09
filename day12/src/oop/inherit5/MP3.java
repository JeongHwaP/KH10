package oop.inherit5;

public class MP3 extends File{
	//필드
	private int duration;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	//메소드
	public void forward() {
		System.out.println("빨리감기 실행");
	}
	public void rewind() {
		System.out.println("되감기 실행");
	}
	
}
