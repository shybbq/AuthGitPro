package com.yzf.cloud.common.dto;

import java.io.Serializable;

public class ResultJson implements Serializable{

	private static final long serialVersionUID = 4505108677459797801L;
	
	private String statusCode;
	
	private String information;
	
	private String description;
	
	private Object content;

	public ResultJson(String statusCode, String information, String description, Object content) {
		this.statusCode = statusCode;
		this.information = information;
		this.description = description;
		this.content = content;
	}

	public ResultJson(String statusCode, String information, String description) {
		this.statusCode = statusCode;
		this.information = information;
		this.description = description;
	}

	public ResultJson(String statusCode, String information, Object content) {
		super();
		this.statusCode = statusCode;
		this.information = information;
		this.content = content;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "ResultJson [statusCode=" + statusCode + ", information=" + information + ", description=" + description
				+ ", content=" + content + "]";
	}
	
}
