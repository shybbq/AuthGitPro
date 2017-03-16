package com.yzf.cloud.auth.model.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.yzf.cloud.common.entity.BaseEntity;

@Table(name="role")
@Entity
public class Role extends BaseEntity{
	
	// 角色名字
	private String roleName;
	// 角色状态
	private String roleSta;
	// 角色顺序
	private String roleSeq;
	// 上级id
	private String upRoleId;
	// 备注
	private String remark;
	
	@ManyToMany(mappedBy="roleSet",fetch=FetchType.LAZY)
	private Set<User> userSet;

	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="role_Resource",joinColumns=@JoinColumn(name="ROLE_ID"), inverseJoinColumns=@JoinColumn(name="RESOURCE_ID"))
	private Set<Resource> resourceSet;
	
	public Role() {}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleSta() {
		return roleSta;
	}

	public void setRoleSta(String roleSta) {
		this.roleSta = roleSta;
	}

	public String getRoleSeq() {
		return roleSeq;
	}

	public void setRoleSeq(String roleSeq) {
		this.roleSeq = roleSeq;
	}

	public String getUpRoleId() {
		return upRoleId;
	}

	public void setUpRoleId(String upRoleId) {
		this.upRoleId = upRoleId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set<User> getUserSet() {
		return userSet;
	}

	public void setUserSet(Set<User> userSet) {
		this.userSet = userSet;
	}

	public Set<Resource> getResourceSet() {
		return resourceSet;
	}

	public void setResourceSet(Set<Resource> resourceSet) {
		this.resourceSet = resourceSet;
	}

	@Override
	public String toString() {
		return "Role [roleName=" + roleName + ", roleSta=" + roleSta + ", roleSeq=" + roleSeq + ", upRoleId=" + upRoleId
				+ ", remark=" + remark + ", userSet=" + userSet + ", resourceSet=" + resourceSet + "]";
	}
	
}
