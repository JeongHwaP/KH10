package oop.inherit8_1;

public abstract class Player {
	//필드
	protected String nickname;
	private int level;
	
	//메소드(+추상메소드)
	public abstract void attack();
	public abstract void move();
	public final void print() {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("<플레이어 정보>");
		System.out.println("닉네임 : " + this.nickname);
		System.out.println("레벨 : " + this.level);
		System.out.println();
		System.out.println("==================");
		System.out.println();
	}
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getLevel() {
		return level;
	}
	public void LevelUp() {
		this.level++;
	}
	
	//생성자
	public Player(String nickname) {
		//this.setNickname(nickname);
		//this.setLevel(1);
		this(nickname, 1);
	}
		public Player(String nickname, int level) {
			this.setNickname(nickname);
			this.level = level;
	}
}
