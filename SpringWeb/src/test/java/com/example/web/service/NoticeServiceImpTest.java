package com.example.web.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class NoticeServiceImpTest {

	private NoticeService service;
	
	@Test
	void test() {
		System.out.println(service.getCount());
	}

}
