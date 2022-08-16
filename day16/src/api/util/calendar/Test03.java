package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) {
		//오늘 사귄 커플의 100일 기념일이 몇일인지 계산하여 출력
		
		Calendar c = Calendar.getInstance();
		
		//c.set(2022, Calendar.AUGUST, 16+99);
//		int year = 2022, month = 8, date = 16;
//		c.set(year, month-1, date+99);
		c.add(Calendar.DATE, 99);
		
		Date a = c.getTime();
		Format f = new SimpleDateFormat("y년 M월 d일 E요일");
		System.out.println(f.format(a));
		
	}
}
