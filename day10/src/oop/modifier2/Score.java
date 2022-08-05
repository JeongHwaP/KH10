package oop.modifier2;

public class Score {
	//field (private)
	private String name;
	private int year;
	private int korean, english, math;
	
	//method (public)
	public void setName(String name) {
		this.name = name;
	}
	public void setYear(int year) {
		if(year >= 1 && year <= 3) {
			this.year = year;			
		}
	}
	public void setKorean(int korean) {
		if(korean < 0 || korean > 100) return;
		this.korean = korean;
	}
	public void setEnglish(int english) {
		if(english < 0 || english > 100) return;
		this.english = english;
	}
	public void setMath(int math) {
		if(math < 0 || math > 100) return;
		this.math = math;
	}
	
	public String getName() {
		return this.name;
	}
	public int getYear() {
		return this.year;
	}
	public int getKorean() {
		return this.korean;
	}
	public int getEnglish() {
		return this.english;
	}
	public int getMath() {
		return this.math;
	}
	
	public int getTotal() {
		return this.korean + this.english + this.math;
	}
	public float getAverage() {
		return this.getTotal() / 3.f;
	}
	public String getGrade() {
		float average = this.getAverage();
		if(average >= 90) return "A";
		else if(average >= 80) return "B";
		else if (average >= 70) return "C";
		else return "F";
	}
	
	public void print() {
		System.out.println("<학생 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("학년 : " + this.year);
		System.out.println("국어 : " + this.korean + "점");
		System.out.println("영어 : " + this.english + "점");
		System.out.println("수학 : " + this.math + "점");
		System.out.println("총점 : " + this.getTotal() + "점");
		System.out.println("평균 : " + this.getAverage() + "점");
		System.out.println("등급 : " + this.getGrade());
		System.out.println();
	}
	
	public Score(String name, int year, int korean, int english, int math){
		this.setName(name);
		this.setYear(year);
		this.setKorean(korean);
		this.setEnglish(english);
		this.setMath(math);
	}
	
	//기본 생성자 -> Score a = new Score();
	public Score() {}
}
