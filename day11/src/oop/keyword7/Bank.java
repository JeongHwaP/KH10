package oop.keyword7;

public class Bank {
	private String name;
	private static float a;
	private float b;
	private int money;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getA() {
		return a;
	}
	public void setA(float a) {
		Bank.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public Bank(String name, float a, float b, int money) {
		this.name = name;
		Bank.a = 1.2f;
		this.b = b;
		this.money = money;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(Bank.a);
		System.out.println(this.b);
		System.out.println(this.money);
	}
}
