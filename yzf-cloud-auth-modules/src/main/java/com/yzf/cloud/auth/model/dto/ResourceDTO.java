package com.yzf.cloud.auth.model.dto;

public class ResourceDTO extends CommonRecDTO{

	private String funcName;
	// 功能类型
	private String funcType;
	public String getFuncName() {
		return funcName;
	}
	public void setFuncName(String funcName) {
		this.funcName = funcName;
	}
	public String getFuncType() {
		return funcType;
	}
	public void setFuncType(String funcType) {
		this.funcType = funcType;
	}
	@Override
	public String toString() {
		return "ResourceDTO [funcName=" + funcName + ", funcType=" + funcType + "]";
	}
	
}
