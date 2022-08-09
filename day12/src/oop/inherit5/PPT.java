package oop.inherit5;

public class PPT extends File{
	//필드
	private int pagesSize;

	public int getPagesSize() {
		return pagesSize;
	}

	public void setPagesSize(int pagesSize) {
		this.pagesSize = pagesSize;
	}
	
	//메소드
	public void informationg() {
		System.out.println("파일 정보 확인 실행");
	}
	
}
