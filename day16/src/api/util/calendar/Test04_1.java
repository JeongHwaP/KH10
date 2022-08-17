package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test04_1 {
	public static void main(String[] args) {
		
		//사용자에게 연, 월을 입력받아서 해당하는 달의 달력을 보여주세요.
		//달력은 어떠한 연도와 월이든 총 6주치가 나와야 합니다.
		//처음 출력되는 날짜는 해당 연도와 월이 아닐 수 있습니다.
		// - 이전 달이 출력되어야 한다면 이전 달부터 출력합니다.
		//한 줄에 한 주치 일자가 출력되어야 합니다.
		//최상단에는 요일 정보가 출력되어야 합니다.
		//ex) 2022, 3을 입력한 경우
		//일		월		화		수		목		금		토
		//27		28	1		2		3		4		5
		//6		7		8		9		10	11	12
		//13		14	15	16	17	18	19
		//20		21	22	23	24	25	26
		//27		28	29	30	31	1		2
		//3		4		5		6		7		8		9
		
		//준비
		int year = 2022;
		int month = 7;
		
		//계산
		//1. 해당 월의 1일로 설정해서 무슨 요일인지를 알아야 한다
		//2. 앞에 날짜를 몇 개 더 출력해야하는지 알 수 있다
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);//1
		
		//출력
		Date d = c.getTime();
		Format f = new SimpleDateFormat("yyyy-MM-dd E");
		System.out.println(f.format(d));
	}
}