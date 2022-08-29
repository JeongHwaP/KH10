package com.kh.spring03.controller;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/quiz")//공용 주소
public class QuizController {

	@RequestMapping("/bmi")
	@ResponseBody
	public String bmi(
			@RequestParam double cm,
			@RequestParam double kg) {
		double m = cm / 100;
		double bmi = kg / (m*m);
		Format f = new DecimalFormat("#,##0.00");
		//return "BMI : "+bmi;
		return "BMI : "+f.format(bmi);
	}
	
	@RequestMapping("/subway")//실제 : /quiz/subway
	@ResponseBody
	public String subway(@RequestParam int year) {
		int age = Calendar.getInstance().get(Calendar.YEAR)-year+1;
		
		//int price = 1250 or 720 or 450 or 0;
		int price;
		if(age<8 || age>=65) {//영유아 + 어르신
			price = 0;
		}
		else if(age>=20) {//성인
			price = 1250;
			
		}else if(age>=14) {//청소년
			price = 720;
		}
		else {//어린이
			price = 450;
		}
		
		return "지하철요금 : "+price;
	}
	
	@RequestMapping("/calendar")//실제 주소 : /quiz/calendar
	@ResponseBody
	public String calendar(
			@RequestParam int year, @RequestParam int month) {
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		int max = c.getActualMaximum(Calendar.DATE);
		return year + "년 " + month + "월은 " + max + "일까지 있습니다.";
	}
	
}
