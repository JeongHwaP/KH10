package oop.inherit5_1;

public class PPT extends File{
	
	//고유 필드
	private int pagesSize;
	
	public int getPagesSize() {
		return pagesSize;
	}
	
	public void setPagesSize(int pagesSize) {
		if(pagesSize < 0) {
			return;
		}
		this.pagesSize = pagesSize;
	}
	
	//고유 메소드
	public void information() {
		System.out.println("<파일 정보>");
		System.out.println("이름 : " + this.fileName);
		System.out.println("크기 : " + this.fileSize + "bytes");
		System.out.println("장수 : " + this.pagesSize);
	}
	
	//생성자
	public PPT(String fileName, long fileSize) {
		this(fileName, fileSize, 1);
	}
	public PPT(String fileName, long fileSize, int pageSize) {
		super(fileName);
		this.setFileSize(fileSize);
		this.setPagesSize(pageSize);
	}
}
