package oop.inherit8_1;

public class Warrior extends Player{

	public Warrior(String nickname) {
		super(nickname);
	}
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
}
