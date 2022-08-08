package oop.keyword5;

public class Galaxy22s {
	//field
	private String company; //제조사 정보
	private String color; //생상
	private String number; //전화번호
	private int memory; //메모리 용량
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	public Galaxy22s(String color, String number, int memory) {
		this.company = "삼성";
		this.color = color;
		this.number = number;
		this.memory = memory;
	}
	
	public void print() {
		System.out.println(this.company);
		System.out.println(this.color);
		System.out.println(this.number);
		System.out.println(this.memory);
	}
}
