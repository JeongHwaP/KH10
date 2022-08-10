package oop.multi2;

public class Flyable implements Drone, Airplane{

	@Override
	public void air() {
		System.out.println("비행기가 비행합니다.");
	}

	@Override
	public void drone() {
		System.out.println("드론이 비행합니다.");
	}

}
