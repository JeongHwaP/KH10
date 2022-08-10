package oop.inherit8_1;

public class Magician extends Player{

	public Magician(String nickname) {
		super(nickname);
	}
	public Magician(String nickname, int level) {
		super(nickname, level);
	}

	@Override
	public void attack() {
		System.out.println("마법사가 마법으로 공격합니다!");
	}

	@Override
	public void move() {
		System.out.println("마법사가 날아서 이동합니다!");
	}
}
