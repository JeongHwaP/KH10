package api.lang.etc;

import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
		//Runtime 클래스
		// - 객체를 하나만 만들어서 공유하는 방식 (singleton 방식)
		// - 객체의 일관성을 유지할 수 있다.
		// - 외부 환경에 명령을 전송할 수 있다.
		
		//Runtime run = new Runtime(); //생성 코드
		Runtime run = Runtime.getRuntime(); //렌탈 코드
		
		if(System.getProperty("os.name").startsWith("Windows")) {			
			run.exec("notepad"); //외부 환경에 notepad라는 명령을 전송해라
			run.exec("calc"); //계산기
			run.exec("mapaint"); //그림판
		}
		else if(System.getProperty("is.name").startsWith("Mac")){
			run.exec("open -a TextEdit.app"); //mac
		}
	}
}
