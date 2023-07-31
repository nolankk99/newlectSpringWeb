package com.example.web.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
///admin/board/notice/list,detail,edit,reg,del
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.entity.Notice;
import com.example.web.entity.NoticeView;
import com.example.web.service.NoticeService;
import com.example.web.service.NoticeServiceImp;
@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	@Autowired
	private NoticeService service;
	
	@RequestMapping("list")
	public String list(Model model) {
		int page =2;
		String field="title";
		String query="";
		
		List<NoticeView> list = service.getList(page,field,query);
		System.out.println(list);
		model.addAttribute("list", list);
		
		//return "customer/notice/list"; // ResouceViewResolver
		return "customer.notice.list"; //tilesViewResolver
	}

	@RequestMapping("detail")
	public String detail() {
		return "customer.notice.detail";
	}

}
