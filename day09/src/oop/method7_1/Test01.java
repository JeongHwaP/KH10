package oop.method7_1;

public class Test01 {
	public static void main(String[] args) {
		Song s1 = new Song();
		Song s2 = new Song();
		Song s3 = new Song();
		Song s4 = new Song();
		
		s1.setting("그때 그 순간 그대로(그그그)", "WSG워너비", "WSG워너비 1집", 104250, 91835);
		s2.setting("보고싶었어", "WSG워너비", "WSG워너비 1집", 83127, 90805);
		s3.setting("LOVE DIVE", "IVE(아이브)", "LOVE DIVE", 64590, 174519);
		s4.setting("POP!", "나연(TWICE)", "IM NAYEON", 58826, 70313);
		
		s1.print();
		s2.print();
		s3.print();
		s4.print();
	}
}
