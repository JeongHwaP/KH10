package oop.method3;

public class Exam {
	String name;
	int k;
	int e;
	int m;
	int total;
	double avg;
	
	void setting(String name, int k, int e, int m) {
		this.name = name;
		this.k = k;
		this.e = e;
		this.m = m;
		this.total = k+e+m;
		this.avg = this.total / 3.0;
	}
	
	void print() {
		System.out.println("<학생 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("국어 : " + this.k + "점");
		System.out.println("영어 : " + this.e + "점");
		System.out.println("수학 : " + this.m + "점");
		System.out.println("총점 : " + this.total + "점");
		System.out.println("평균 : " + this.avg + "점");
		System.out.println();
	}
}
