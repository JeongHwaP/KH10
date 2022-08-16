package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) {
		//다음 형식으로 시간을 출력하세요.
		// 1. 2022년 8월 16일 화
		// 2. 오후 12시 2분
		// 3. 12 : 02 : 35
		// 4. 2022 - 08 - 16 화 12:02:35
		
		Date a = new Date();
		
//		SimpleDateFormat f = new SimpleDateFormat("y년 M월 d일 E");
		Format f = new SimpleDateFormat("y년 M월 d일 E"); //up-casting
		System.out.println(f.format(a));
		
//		SimpleDateFormat f2 = new SimpleDateFormat("a h시 m분");
		Format f2 = new SimpleDateFormat("a h시 m분");
		System.out.println(f2.format(a));
		
//		SimpleDateFormat f3 = new SimpleDateFormat("hh:mm:ss");
		Format f3 = new SimpleDateFormat("HH:mm:ss");
		System.out.println(f3.format(a));
		
//		SimpleDateFormat f4 = new SimpleDateFormat("yyyy-MM-dd E hh:mm:ss");
		Format f4 = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
		System.out.println(f4.format(a));
	}
}
