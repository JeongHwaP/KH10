package oop.inherit8_1;

public class Elf extends Player{

	public Elf(String nickname, int level) {
		super(nickname, level);
	}
	public Elf(String nickname) {
		super(nickname);
	}

	@Override
	public void attack() {
		System.out.println("엘프가 활로 공격합니다!");
	}

	@Override
	public void move() {
		System.out.println("엘프가 이동합니다!");
	}
}
