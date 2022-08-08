package oop.modifier4;

public class Gun {
	public int bullet = 2; //총알 2발부터 시작

	public int getBullet() {
		return bullet;
	}

	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	
	//사격
	public void fire() {
		if(bullet > 0) {
			System.out.println("빵야!");
			bullet--;
		}
		else {
			System.out.println("딸깍!");
		}
	}
	
	//남은 총알
	public void print() {
		System.out.println("남은 총알 : " + this.bullet + "발");
	}

	public Gun(int bullet) {
		this.setBullet(bullet);
	}
}
