package com.kh.spring18;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;

import com.kh.spring18.entity.CertDto;
import com.kh.spring18.service.EmailService;

@SpringBootTest
public class CreateCertTest3 {

	@Autowired
	private EmailService emailService;
	
	String email = "hwang8243@gmail.com";//사용자가 입력할 정보
	
	@Test
	public void test() {
		emailService.sendCertMail(email);
	}
	
}
