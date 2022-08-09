package oop.inherit5;

//상위 클래스
public class File {
	//공용 필드
	private String fileName;
	private String fileSize;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	
	//공용 메소드
	public void execute() {
		System.out.println();
		System.out.println("실행!");
	}
	
	
}
