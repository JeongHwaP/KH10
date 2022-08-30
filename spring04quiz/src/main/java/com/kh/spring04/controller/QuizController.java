package com.kh.spring04.controller;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/quiz")//공용주소
public class QuizController {
	
	//http://localhost:8765/quiz/sum
	//시작(begin)과 종료(end)값을 정수로 입력받아 해당 구간의 숫자 합계 출력
	@RequestMapping("/sum")
	@ResponseBody
	public String sum(
			@RequestParam int begin, @RequestParam int end) {
		int sum = 0;
		for(int i=begin; i<=end; i++) {
			sum += i;
		}
		return begin+" ~ "+end+"의 합계 : "+sum;
	}
	
	//http://localhost:8765/quiz/gugudan
	//문제 개수(count)를 입력받아 해당 개수만큼 구구단 문제를 랜덤으로 출력
	//범위는 2~9단, x1 ~ x9로 설정
	@RequestMapping("/gugudan")
	@ResponseBody
	public String gugudan(@RequestParam int count) {
		StringBuffer buffer = new StringBuffer();
		Random r = new Random();
		for(int i=0; i<count; i++) {
			int a = r.nextInt(8)+2;
			int b = r.nextInt(9)+1;
			buffer.append(a);
			buffer.append(" X ");
			buffer.append(b);
			buffer.append(" = ");
			buffer.append("<br>");
		}
		return buffer.toString();
	}
	
	//다음 주소가 처리되도록 구현해보세요
	//http://localhost:8765/quiz/total?v=10&v=20&v=30
	//전달된 v에 해당하는 모든 값들의 합계를 구하여 출력
	
	//파라미터가 같은 이름으로 여러 개 존재하는 경우
	// -> 배열 혹은 Collection으로 처리
	@RequestMapping("/total")
	@ResponseBody
	public String total(@RequestParam int v[]) {
	//public String total(@RequestParam List<Integer> v) {
		int total = 0;
		//for(int i=0; i<v.length; i++) {
			//total += v[i];
		for(int n:v) {
			total += n;
		}
		return "합계 = "+total;
	}
}
