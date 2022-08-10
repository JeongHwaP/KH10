package oop.multi2;

public class Transportation implements Drone, Airplane, Train, Bus, Kickboard{

	@Override
	public void board() {
		System.out.println("전동킥보드가 이동합니다.");
	}

	@Override
	public void bus() {
		System.out.println("버스가 이동합니다.");
	}

	@Override
	public void train() {
		System.out.println("기차가 이동합니다.");
	}

	@Override
	public void air() {
		System.out.println("비행기가 이동합니다.");
	}

	@Override
	public void drone() {
		System.out.println("드론이 이동합니다.");
	}
}
