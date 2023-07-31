package com.example.web.dao.mybatis;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.web.dao.NoticeDao;
import com.example.web.entity.NoticeView;
@SpringBootTest
class MybatisNoticeDaoTest {
	private NoticeDao noticeDao;
	
	
	@Test
	void test() {
		List<NoticeView> list=noticeDao.getViewList(0, 1, null, null, null);
		System.out.println(list.get(0));
		
	}

}
