package com.example.web.service;

import java.util.List;

import com.example.web.entity.Notice;
import com.example.web.entity.NoticeView;


public interface NoticeService {
	//-페이지를 요청할 떄
	List<NoticeView> getViewList(Boolean pub);
	
	//-검색을 요청할 대
	List<NoticeView>getViewList(String field,String query,Boolean pub);
	//-페이지를 요청할 때
	
	List<NoticeView> getViewList(int page, String field, String query, Boolean pub);
	int getCount();
	int getCount(String field,String query,Boolean pub);
	//자세한 페이지 요청할 때
	Notice getView(int id);
	Notice getNext(int id);
	Notice getPrev(int id);
	
	//-일괄공개를 요청할 떄
	int updatePubAll(int[] publds,int[] closelds);
	//-일괄삭제를 요청할 떄
	int deleteAll(int[] ids);

	
	
	//-수정 페이지를 요청할 떄
	int update(Notice notice);
	int delete(int id);
	int insert(Notice notice);
}
