package com.example.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.example.web.entity.Notice;
import com.example.web.entity.NoticeView;


public interface NoticeDao {
	
	List<NoticeView> getViewList(int offset, int size, String field, String query, Boolean pub);
	int getCount(String field, String query,Boolean pub);
	NoticeView getView(int id);
	
	Notice getNext(int id);
	Notice getPrev(int id);
	
	
	int update(Notice notice);
	int insert(Notice notice);
	int delete(int id);
	
	int deleteAll(int[] ids);
	//int updatePubAll(int[] pubIds, int[] closeIds);
	int updatePubAll(int[] ids, Boolean pub);
	//int updatePubAll(int[] pubIds, int[] closeIds);
	 

}
