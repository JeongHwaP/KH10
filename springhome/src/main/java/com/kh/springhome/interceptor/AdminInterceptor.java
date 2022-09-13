package com.kh.springhome.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class AdminInterceptor implements HandlerInterceptor{ //상속을 통해 자격 획득

	@Override
	public boolean preHandle(
			HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler
			)
			throws Exception {

		HttpSession session = request.getSession();
		String mg = (String) session.getAttribute("mg");
		boolean admin = mg != null && mg.equals("관리자");
		
		if(admin) { //관리자라면
			return true; //통과
		}
		else { //관리자가 아니라면
			//response.sendRedirect("/"); //메인으로 리다이렉트
			response.sendError(403); //사용자에게 권한없음(403) 전송
			return false; //차단
		}
	}
	
}
