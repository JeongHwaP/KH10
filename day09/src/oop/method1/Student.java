package oop.method1;

public class Student {
	//member field : 데이터 저장소
	String name;
	int score;
	
	//member method : 코드 저장소
	//- 메소드에서 this는 "자신"을 의미
	
//	void 이름() {
//		코드
//	}
	
	//설정 메소드(코드 저장소)
	// - 실행하려면 String name, int score){
	void setting(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	//출력 메소드(코드 저장소)
	void print() {
		System.out.println("이름 : " + this.name);
		System.out.println("점수 : " + this.score + "점");
	}
}
