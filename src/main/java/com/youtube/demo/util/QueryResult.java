package com.youtube.demo.util;

import java.util.List;

public class QueryResult {

	private int totalRecords;
	private List<Object> list;
	
	public int getTotalRecord() {
		return totalRecords;
	}
	
	public void setTotalRecord(int totalRecord) {
		this.totalRecords = totalRecord;
	}
	
	public List<Object> getList() {
		return list;
	}
	
	public void setList(List<Object> list) {
		this.list = list;
	}
	
	
}
