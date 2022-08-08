package oop.modifier4_1;

import oop.modifier4_1.*;

public class Police {
	private String name;
	private String rank;
	private String zone;
	
	Gun a = new Gun(2); //경찰을 만들면 권총이 생김
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	
	public void print() {
		a.print();
		System.out.println();
		System.out.println("<경찰 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("직급 : " + this.rank);
		System.out.println("근무지역 : " + this.zone);
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	
	public void shoot() {
		a.fire();
	}
	
	public Police(String name, String rank, String zone) {
		this.setName(name);
		this.setRank(rank);
		this.setZone(zone);
	}
}
