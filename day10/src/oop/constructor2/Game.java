package oop.constructor2;

public class Game {
	//field
	String id;
	String job;
	int level;
	
	//method
	void print() {
		System.out.println("아이디 : " + this.id);
		System.out.println("직업 : " + this.job);
		System.out.println("레벨 : " + this.level);
	}	
	
	void levelUp() {
		this.level++;
		//그 외 추가 작업 코드
	}
		
	//constructor
	
	//기본 생성자
	// - 클래스는 객체를 만들기 위해 존재한다.
	// - 생성자를 안만들어도 하나는 만들어준다.
	// - 마음에 안들면 다른 생성자를 만든다.
	//Player()[]
	Game(String id, String job){
		this(id, job, 1);
	}
	Game(String id, String job, int level){
		this.id = id;
		this.job = job;
		this.level = level;
	}	
}
