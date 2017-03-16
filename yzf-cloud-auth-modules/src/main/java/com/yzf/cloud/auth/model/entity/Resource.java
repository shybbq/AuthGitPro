package com.yzf.cloud.auth.model.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.yzf.cloud.common.entity.BaseEntity;

@Table(name="resouce")
@Entity
public class Resource extends BaseEntity{

	// 功能名称
	private String funcName;
	// 功能类型
	private String funcType;
	// 功能URL
	private String funcUrl;
	// 功能等级
	private String funcLevel;
	// 上级功能Id
	private String upFunId;
	// 显示顺序
	private String funcSeq;
	// 备注
	private String remark;
	
	@ManyToMany(mappedBy="resourceSet",fetch=FetchType.LAZY)
	private Set<Role> roleResSet;

	public Resource() {}

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

	public String getFuncUrl() {
		return funcUrl;
	}

	public void setFuncUrl(String funcUrl) {
		this.funcUrl = funcUrl;
	}

	public String getFuncLevel() {
		return funcLevel;
	}

	public void setFuncLevel(String funcLevel) {
		this.funcLevel = funcLevel;
	}

	public String getUpFunId() {
		return upFunId;
	}

	public void setUpFunId(String upFunId) {
		this.upFunId = upFunId;
	}

	public String getFuncSeq() {
		return funcSeq;
	}

	public void setFuncSeq(String funcSeq) {
		this.funcSeq = funcSeq;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set<Role> getRoleResSet() {
		return roleResSet;
	}

	public void setRoleResSet(Set<Role> roleResSet) {
		this.roleResSet = roleResSet;
	}

	@Override
	public String toString() {
		return "Resource [funcName=" + funcName + ", funcType=" + funcType + ", funcUrl=" + funcUrl + ", funcLevel="
				+ funcLevel + ", upFunId=" + upFunId + ", funcSeq=" + funcSeq + ", remark=" + remark + ", roleResSet="
				+ roleResSet + "]";
	}
	
}
