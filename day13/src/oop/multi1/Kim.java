package oop.multi1;

public class Kim implements Singer, Magician{

	@Override
	public void sing() {
		System.out.println("죽을만큼 보고싶다~");
	}
	@Override
	public void show() {
		System.out.println("나와라 비둘기~");
	}
	
}
