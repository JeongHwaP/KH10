package oop.inherit8;

public class Warrior extends Class{

	public Warrior(String nickname, int level) {
		super(nickname, level);
	}

	@Override
	public void attack() {
		System.out.println("전사가 칼로 공격합니다!");
	}

	@Override
	public void move() {
		System.out.println("전사가 뛰어서 이동합니다!");
	}

	@Override
	public void data() {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("<캐릭터 정보>");
		System.out.println("닉네임 : " + this.nickname);
		System.out.println("레벨 : " + this.level);
		System.out.println();
		System.out.println("==================");
		System.out.println();
	}
}
