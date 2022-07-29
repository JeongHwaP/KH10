package loop;
//import java.lang.*;
public class Test06 {
	public static void main(String[] args) {
		//다음 값을 화면에 출력
		//(1) 1부터 99 사이의 7의 배수
		//(2) 1부터 99 사이의 5가 들어간 숫자
		
		//1부터 99 사이의 7의 배수
		// - 7, 14, 21,...84, 91, 98
		for(int i = 1; i < 100; i++) {
			if(i % 7 == 0) {//7의 배수
				System.out.println("1번 = " + i);
			}
		}
		//1부터 99 사이의 5가 들어간 숫자
		// - 나누기와 나머지를 통해 십의자리, 일의자리를 분리해서 비교
		
		for(int i = 1; i < 100; i++) {
			//if(5가 들어있다면) {
			//if(십의자리에 5 또는 일의자리에 5) {
			if(i / 10 == 5 || i % 10 == 5) {
			System.out.println("2번 = " + i);
			}
		}
	}
}
