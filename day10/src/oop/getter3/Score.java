package oop.getter3;

public class Score {
	//field
	String name;
	int year;
	int korean, english, math;
	
	//method
	void print() {
		System.out.println("이름 : " + this.name);
		System.out.println("학년 : " +this.year);
		System.out.println("국어 점수 : " + this.korean);
		System.out.println("영어 점수 : " + this.english);
		System.out.println("수학 점수 : " + this.math);
		System.out.println("총점 : " + this.getTotal() + "점");
		System.out.println("평균 : " + this.getAverage() + "점");
		System.out.println("등급 : " + this.getGrade());
		System.out.println();
	}
	
	//setter method
	void setName(String name) {
		this.name = name;
	}
	void setYear(int year) {
		if(year >= 1 && year <=3) {
			this.year = year;			
		}
	}
	void setKorean(int korean) {
		if(korean < 0 || korean>100) return;
		this.korean = korean;
	}
	void setEnglish(int english) {
		if(english<0 || english<100) {
			return;
		}
		this.english = english;
	}
	void setMath(int math) {
		if(math<0 || math>100) {
			return;
		}
		this.math = math;
	}
	
	//getter method
	String getName() {
		return this.name;
	}
	int getYear() {
		return this.year;
	}
	int getKorean() {
		return this.korean;
	}
	int getEnglish() {
		return this.english;
	}
	int getMath() {
		return this.math;
	}
	int getTotal() {
		return this.korean + this.english + this.math;
	}
	float getAverage() {
		return this.getTotal() / 3f;
	}
	String getGrade() {
		float average = this.getAverage();
		if(average >= 90)
			return "A";
		else if(average >= 80)
			return "B";
		else if(average >= 70)
			return "C";
		else
			return "F";
	}
	
	//constructor
	Score(String name, int year, int korean, int english, int math){
		this.setName(name);
		this.setYear(year);
		this.setKorean(korean);
		this.setEnglish(english);
		this.setMath(math);
	}
}
