package com.yzf.cloud.auth.model.dto;

public class RoleDTO extends CommonRecDTO{

	private String name;
	
	private String roleSta;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoleSta() {
		return roleSta;
	}

	public void setRoleSta(String roleSta) {
		this.roleSta = roleSta;
	}

}
