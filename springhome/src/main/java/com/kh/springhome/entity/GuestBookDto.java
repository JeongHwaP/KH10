package com.kh.springhome.entity;

public class GuestBookDto {
	private int no;
	private String name, memo;

	@Override
	public String toString() {
		return "GuestBookDto [no=" + no + ", name=" + name + ", memo=" + memo + "]";
	}

	public GuestBookDto() {
		super();
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
}
