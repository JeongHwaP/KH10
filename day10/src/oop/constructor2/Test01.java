package oop.constructor2;

public class Test01 {
	public static void main(String[] args) {
		Game a = new Game("마리오", "전사", 50);
		Game b = new Game("루이지", "마법사");
		Game c = new Game("피오나", "마법사");
		
		//b의 레벨이 올랐다.
//		b.level++; //비추천
		b.levelUp(); //추천
		
		a.print();
		b.print();
		c.print();
	}
}
