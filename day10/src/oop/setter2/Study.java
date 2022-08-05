package oop.setter2;

public class Study {
	//field
	String name;
	int time;
	int price;
	String type;
	
	//method
	void setName(String name) {
		this.name = name;
	}
	void setTime(int time) {
		//[1]
//		if(time % 30 == 0 && time > 0)
//		this.time = time;
//	}
		if(time <= 0) {
			return;
		}
		if(time % 30 != 0) {
			return;
		}
		this.time = time;
	}
	void setPrice(int price) {
//		[1]
//		if(price >= 0) {
//			this.price = price;
//		}
		//[2]
		if(price < 0) {
			return;
		}
		this.price = price;
	}
	//tip ; if로는 문자열 비교가 힘들다(안될 경우가 존재) = 문자열은 비교 연산이 힘들다
	void setType(String type) {
		switch(type) {
		case "온라인":
		case "오프라인":
		case "혼합":
		}
		this.type = type;
	}
	
	void print() {
		System.out.println("강의명 : " + this.name);
		System.out.println("강의시간 : " + this.time);
		System.out.println("수강료 : " + this.price + "원");
		System.out.println("구분 : " + this.type);
		System.out.println();
	}
	
	//constructor
	Study(String name, int time, int price, String type){
		this.setName(name);
		this.setTime(time);
		this.setPrice(price);
		this.setType(type);
	}
}
