package com.kh.spring19;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoggingTest2 {

	//Spring에서는 Log4J든 Logback이든 직접적으로 사용하지 않는다.
	// - 어댑터 라이브러리로 SLF4J라는 것을 사용한다.
	private Logger log = LoggerFactory.getLogger(LoggingTest2.class);
	
	@Test
	public void test() {
		for(int i=0; i < 100000; i++) {
			log.debug("hello logging");
		}
	}
}
