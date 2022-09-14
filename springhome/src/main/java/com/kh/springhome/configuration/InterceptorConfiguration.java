package com.kh.springhome.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.kh.springhome.interceptor.AdminInterceptor;
import com.kh.springhome.interceptor.MemberInterceptor;
import com.kh.springhome.interceptor.TestInterceptor;

//스프링 설정파일
//- application.properties에서 설정하기 어려운 복잡한 설정을 구현
//- 프로그램 동작 방식과 관련된 설정일 경우 특정 인터페이스를 상속 받아야 함
//- interface WebMvcConfigurer
@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer{
	
	@Autowired
	private MemberInterceptor memberInterceptor;
	
	@Autowired
	private AdminInterceptor adminInterceptor;
	
	@Autowired
	private TestInterceptor testInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//registry에 추가하여 인터셉터가 작동하도록 설정
		//(참고) 등록 코드 작성 순으로 실행됨
		
		registry.addInterceptor(testInterceptor)
					.addPathPatterns("/**");
		
		registry.addInterceptor(memberInterceptor)
					.addPathPatterns(//인터셉터가 감시할 주소
							"/pocketmon/**",//포켓몬스터 전부
							"/music/detail",//음원 상세
							"/member/**"//회원 전체
					)
					.excludePathPatterns(//위의 주소에서 제외할 주소
							"/member/join*",//회원가입
							"/member/login",//로그인
							"/member/goodbye_result"//탈퇴완료
					);
		
		registry.addInterceptor(adminInterceptor)
					.addPathPatterns(//인터셉터가 감시할 주소
						"/guestbook/edit*",//방명록 수정페이지
						"/guestbook/delete",//방명록 삭제페이지
						"/music/**",//음원 전체
						"/member/list",//회원목록
						"/member/detail",//회원상세
						"/member/change*",//회원수정
						"/member/exit"//회원삭제
					)
					.excludePathPatterns(//위의 주소에서 제외할 주소
						"/music/list",//음원 목록
						"/music/detail"//음원 상세
					);
	}
}
