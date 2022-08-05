package oop.setter1;

public class Car {
	//field
	String name;
	int speed;
	int passenger;
	int price;
	
	//setter method
	// - 이름을 지을 때 set + 변수형으로 작성
//	void 이름(준비물) {
//	void setName(준비물) {
	void setName(String name) {
		this.name = name;
	}
	void setSpeed(int speed){
		if(speed > 0) {
			this.speed = speed;			
		}
	}
	void setPassenger(int passenger) {
		//[1] passenger가 0보다 클 경우에만 설정하세요.
//		if(passenger > 0) {		
//			this.passenger = passenger;
//		}
		//[2] passenger가 0이하라면 설정하지 마세요.
		// - return은 메소드를 종료하는 명령
		if(passenger <= 0) {
			return;
		}
		this.passenger = passenger;
	}
	void setPrice(int price) {
//		//[1]
//		if(price >= 0) {
//			this.price = price;
//		}
		
		//[2]
		if(price < 0) {
			return;
		}
		this.price = price;
	}
	
	void print() {
		System.out.println(this.name);
		System.out.println(this.speed);
		System.out.println(this.passenger);
		System.out.println(this.price);
	}
	
	Car(String name, int speedm, int passerger, int price){
		this.setName(name);
		this.setSpeed(speedm);
		this.setPassenger(passerger);
		this.setPrice(price);
	}
	
}
