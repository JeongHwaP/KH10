package oop.multi2;

public class Electronic implements Drone, Kickboard{

	@Override
	public void board() {
		System.out.println("전동킥보드의 전원을");
	}

	@Override
	public void drone() {
		System.out.println("드론의 전원을");
	}

}
