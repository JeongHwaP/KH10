package oop.getter2;

public class Exam {
	//field -> 1
	String name;
	String subject;
	int score, score2;
	
	//method -> 3
	void print() {
		System.out.println("<시험 결과>");
		System.out.println("이름 : " + this.name);
		System.out.println("과목 : " + this.subject);
		System.out.println("서술형 점수 : " + this.score + "점");
		System.out.println("평가자 체크리스트 점수 : " + this.score2 + "점");
		System.out.println("결과 : " + this.getResult());
		System.out.println();
	}
	
	//setter method -> 4
	void setName(String name) {
		this.name = name;
	}
	void setSubject(String subject) {
		this.subject = subject;
	}
	void setScore(int score) {
		if(score >= 0 && score <= 100) {
			this.score = score;			
		}
	}
	void setScore2(int score2) {
//		if(score < 0 || score > 100) { //0점 미만 또는 100점 초과
		if(!(score >= 0 && score2 <= 100)) { //0점 이상이며 100점 이하가 아니면
			return;
		}
		this.score2 = score2;			
	}
	
	//getter method
	String getName() {
		return this.name;
	}
	String getSubject() {
		return this.subject;
	}
	int getScore() {
		return this.score;
	}
	int getScore2() {
		return this.score2;
	}
	//가상의 getter
	int getTotal() {
		return this.score + this.score2;
	}
	double getAverage() {
//		return (this.score + this.score2;) / 2.0;
		return this.getTotal() / 2.0;
	}
	String getResult() {
		if(this.score >= 40 && this.score2 >= 40 && getAverage() >= 60) {
			return "합격";
		}
		else {
			return "재평가";
		}
	}
	
	//constructor -> 2
	Exam(String name, String subject, int score, int score2){
		this.setName(name);
		this.setSubject(subject);
		this.setScore(score);
		this.setScore2(score2);
	}
}
