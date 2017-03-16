package com.yzf.cloud.auth.model.dto;

import java.util.HashMap;
import java.util.Map;

public class CommonRecDTO {

	private String currentPage;
	
	private String pageSize;
	
	private String nickName;
	
	private Map<String ,String> content = new HashMap<String, String>();
	
	public void addParam(String key, String value){
		content.put(key, value);
	}
	
	public void addPrams(Map<String, String> map) {
		content.putAll(map);
	}
	
	public void removeParam(String key) {
		content.remove(key);
	}

	public String getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
	
	

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public Map<String, String> getContent() {
		return content;
	}

	public void setContent(Map<String, String> content) {
		this.content = content;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
}
