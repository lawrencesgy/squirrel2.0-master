package com.nepu.service;

import java.util.List;

import com.nepu.pojo.Notice;

public interface NoticeService {

	List<Notice> getNoticeList();
	
	public void insertSelective(Notice notice);
	
	



}
