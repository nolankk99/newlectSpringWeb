package com.example.web.controller.admin.board;

import java.util.List;

import org.apache.catalina.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.web.entity.Notice;
import com.example.web.entity.NoticeView;
import com.example.web.service.NoticeService;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {
	@Autowired
	private NoticeService service;
	
	@RequestMapping("list")
	public String list() {
		
		List<NoticeView> list = service.getList();
		
		return "admin.board.notice.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		
		Notice notice = service.get(1);
		
		return "admin.board.notice.detail";
	}
	
	@RequestMapping("reg")
	public String reg() {
		return "admin.board.notice.reg";
	}

}
