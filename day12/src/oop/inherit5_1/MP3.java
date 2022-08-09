package oop.inherit5_1;

public class MP3 extends MediaFile{
	
	public MP3(String fileName) {
		super(fileName);
	}
	public MP3(String fileName, long fileSize, int duration) {
		super(fileName);
		//this.fileSize = fileSize;
		this.setFileSize(fileSize);
		//super.setFileSize(fileSize);
		this.setDuration(duration);
	}
	
	//고유 필드
	private int duration;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		if(duration < 0) {
			return;
		}
		this.duration = duration;
	}
	
	//메소드 - MediaFile
}
