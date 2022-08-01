package loop2;

public class Test01 {
	public static void main(String[] args) {
		//중첩 반복문
		//하루동안의 시간메세지를 출력
		for(int hour=0; hour < 24; hour++) {//x24
			for(int min = 0; min < 60; min++) {//x60
				for(int sec=0; sec < 60; sec++) {//x60
					System.out.println(hour + ":시" + min + "분" + sec + "초");
				}
			}
		}
	}
}
