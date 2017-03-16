package com.yzf.cloud.common.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.util.StringUtils;

import com.yzf.cloud.common.utils.DateUtils;

@MappedSuperclass
public class BaseEntity extends MysqlSequenenceEntityId{

	protected String createTime;
	
	protected String createPerson;
	
	protected String updateTime;
	
	protected String updatePerson;
	
	@Column(length=2)
	protected String deletedFlag = "0";
	
	protected String dataVersion;
	
	//扩展字段1
	protected String exp1;	
	//扩展字段2
	protected String exp2;		
	//扩展字段3
	protected String exp3;
	//扩展字段4
	protected String exp4;
	//扩展字段5
	protected String exp5;
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreatePerson() {
		return createPerson;
	}
	public void setCreatePerson(String createPerson) {
		this.createPerson = createPerson;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdatePerson() {
		return updatePerson;
	}
	public void setUpdatePerson(String updatePerson) {
		this.updatePerson = updatePerson;
	}
	public String getDeletedFlag() {
		return deletedFlag;
	}
	public void setDeletedFlag(String deletedFlag) {
		this.deletedFlag = deletedFlag;
	}
	public String getDataVersion() {
		return dataVersion;
	}
	public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
	}
	public String getExp1() {
		return exp1;
	}
	public void setExp1(String exp1) {
		this.exp1 = exp1;
	}
	public String getExp2() {
		return exp2;
	}
	public void setExp2(String exp2) {
		this.exp2 = exp2;
	}
	public String getExp3() {
		return exp3;
	}
	public void setExp3(String exp3) {
		this.exp3 = exp3;
	}
	public String getExp4() {
		return exp4;
	}
	public void setExp4(String exp4) {
		this.exp4 = exp4;
	}
	public String getExp5() {
		return exp5;
	}
	public void setExp5(String exp5) {
		this.exp5 = exp5;
	}
	
	@Override
	public int hashCode() {
		return id == null ? System.identityHashCode(this) : (this.getClass().getName() + this.getId()).hashCode();
	}
	
	@PrePersist
	public void PrePresist(){
		if(null == this.createTime) {
			this.createTime = DateUtils.getDateTime();
		}
		this.updateTime = DateUtils.getDateTime();
		if(StringUtils.isEmpty(this.deletedFlag)){
			this.deletedFlag = "0";
		}
	}
	
	@PreUpdate
	public void PreUpdate(){
		this.createTime = DateUtils.getDateTime();
	}
	
}
