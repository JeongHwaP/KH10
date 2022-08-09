package oop.inherit8;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사용하실 닉네임을 설정하세요.");
		Warrior a = new Warrior(sc.next(), 1);
		a.attack();
		a.move();
		a.data();
		
		System.out.println("사용하실 닉네임을 설정하세요.");
		Magician b = new Magician(sc.next(), 1);
		b.attack();
		b.move();
		b.data();
		
		System.out.println("사용하실 닉네임을 설정하세요.");
		Elf c = new Elf(sc.next(), 1);
		c.attack();
		c.move();
		c.data();
		
		sc.close();
	}
}
