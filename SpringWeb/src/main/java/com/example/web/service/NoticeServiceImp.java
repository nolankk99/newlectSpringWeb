package com.example.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.dao.NoticeDao;
import com.example.web.entity.Notice;
import com.example.web.entity.NoticeView;
@Service //@Component ,@service, @Controller, @Repository @Configuration 
public class NoticeServiceImp implements NoticeService{
	
	@Autowired
	private NoticeDao noticeDao;

	
	
	@Override
	public List<NoticeView> getViewList(Boolean pub) {
		// TODO Auto-generated method stub
		return getViewList(1,"title","",pub);
	}
	@Override
	public List<NoticeView> getViewList(String field, String query ,Boolean pub) {
		// TODO Auto-generated method stub
		return getViewList(1,field,query,pub);
	}
	@Override
	public List<NoticeView> getViewList(int page, String field, String query, Boolean pub) {
		int size=10;
		int offset = 0+(page-1)*size; //page 1->0, 2->10 3->30  an=a1+(n-1)d  0+(page-1)*10
		
		List<NoticeView> list = noticeDao.getViewList(offset, size,field, query,pub);
		
		return list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return getCount("title","",true);
	}

	@Override
	public int getCount(String field, String query,Boolean pub) {
		// TODO Auto-generated method stub
		return noticeDao.getCount(field,query,pub);
	}
	@Override
	public NoticeView getView(int id) {
		NoticeView notice = noticeDao.getView(id);
		return notice;
	}

	@Override
	public Notice getNext(int id) {
		// TODO Auto-generated method stub
		return noticeDao.getNext(id);
	}

	@Override
	public Notice getPrev(int id) {
		// TODO Auto-generated method stub
		return noticeDao.getPrev(id);
	}

	@Override
	public int updatePubAll(int[] pubIds, int[] closeIds) {
		// TODO Auto-generated method stub
		int result =0;
		result+=noticeDao.updatePubAll(pubIds, true);
		result+=noticeDao.updatePubAll(closeIds,false);
		return result;
		
	}

	@Override
	public int deleteAll(int[] ids) {
		// TODO Auto-generated method stub
		return noticeDao.deleteAll(ids);
	}

	@Override
	public int update(Notice notice) {
		// TODO Auto-generated method stub
		return noticeDao.update(notice);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return noticeDao.delete(id);
	}

	@Override
	public int insert(Notice notice) {
		// TODO Auto-generated method stub
		return noticeDao.insert(notice);
	}
	
	 

}
