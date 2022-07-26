package oop.inner4;

public class Test01 {
	public static void main(String[] args) {
		//잘하면 인터페이스도 객체 생성이 되겠는데?(익명 중첩 클래스 활용)
		//Button bt = new Button();
		
		Button bt = new Button() {
			@Override
			public void push() {
				System.out.println("버튼 클릭!");
			}
		};
		bt.push();
		
		//자바 1.8(Java 8)부터는 함수형 인터페이스, 추론이라는 개념이 생긴다.
		// - 함수형 인터페이스는 메소드가 하나뿐인 인터페이스를 말한다.
		// - 어차피 익명중첩클래스로 객체를 만들거고 메소드가 하나라면 굳이 다 쳐야하나?
		Button exit = /*new Button() {*/
			/*public void push*/()->{
				System.out.println("종료 버튼 클릭");
			}
		/*}*/
		;
		exit.push();
		
		//결론적으로 이렇게 완성된 문법 체계를 람다(Lambda)라고 한다.
		Button menu = ()->{
			System.out.println("메뉴 버튼 클릭");
		};
		menu.push();
	}
}
