package api.util.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Test04 {
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
		
		Calendar c = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 : ");
		int year = sc.nextInt();
		
		System.out.print("월 : ");
		int month = sc.nextInt();
		
		sc.close();
		
		c.set(year, month-1, 1);
		
		int day = c.get(Calendar.DAY_OF_WEEK);
		c.add(Calendar.DATE, - (day-1));
		
		System.out.println();
		System.out.println(year + "년 " + month + "월 달력");
		System.out.println();
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int count = 0;
		for(int i=0; i<42; i++) {
			System.out.print(c.get(Calendar.DATE));
			System.out.print("\t");
			c.add(Calendar.DATE, 1);
			count++;
			if(count % 7 == 0) {
				System.out.println();
			}
		}
	}
}
