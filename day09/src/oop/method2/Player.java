package oop.method2;

public class Player {
	//멤버 필드
	String name;
	String event;
	String season;
	int gold;
	int silver;
	int bronze;
	
	//멤버 메소드(설정)
	void setting(String name, String event, String season, int gold, int silver, int bronze) {
		this.name = name;
		this.event = event;
		this.season = season;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}
	
	//멤버 메소드(출력)
	void print() {
		System.out.println("이름 : " + this.name);
		System.out.println("종목 : " + this.event);
		System.out.println("구분 : " + this.season);
		System.out.println("금메달 : " + this.gold);
		System.out.println("은메달 : " + this.silver);
		System.out.println("동메달 : " + this.bronze);
		System.out.println();
	}
}
