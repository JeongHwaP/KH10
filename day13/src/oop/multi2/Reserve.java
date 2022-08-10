package oop.multi2;

public class Reserve implements Airplane, Train{

	@Override
	public void train() {
		System.out.println("기차를 예약합니다.");
	}

	@Override
	public void air() {
		System.out.println("비행기를 예약합니다.");
	}

}
