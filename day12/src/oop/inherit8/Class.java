package oop.inherit8;

public abstract class Class {
	
	protected String nickname;
	protected int level;
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if(level  > 0) {
			return;
		}
		this.level = level;
	}
	
	public Class(String nickname, int level) {
		this.nickname = nickname;
		this.level = level;
	}
	
	public abstract void attack();
	public abstract void move();
	public abstract void data();
}
