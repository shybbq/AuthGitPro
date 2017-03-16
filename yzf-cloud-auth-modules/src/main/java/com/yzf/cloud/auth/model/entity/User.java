package com.yzf.cloud.auth.model.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.yzf.cloud.common.entity.BaseEntity;

@Table(name="user")
@Entity
public class User extends BaseEntity{

	private String name;
	
	private String phone;
	
	private String sex;
	
	private String address;
	
	private String password;
	
	private String nickname;
	
	private String iconurl;
	
	private String birthday;
	
	private String email;
	
	private String degree;
	
	private String isActive = "1";
	
	private String isOperate = "1";
	// 00-注册 01-正常 02-冻结 09-注销
	private String userStatu ;
	
	private String wxId;
	
	private String qqId;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name = "user_role",joinColumns=@JoinColumn(name="USER_ID"),
							inverseJoinColumns=@JoinColumn(name="ROLE_ID"))
	private Set<Role> userRoleSet;

	public User() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getIconurl() {
		return iconurl;
	}

	public void setIconurl(String iconurl) {
		this.iconurl = iconurl;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getIsOperate() {
		return isOperate;
	}

	public void setIsOperate(String isOperate) {
		this.isOperate = isOperate;
	}

	public String getUserStatu() {
		return userStatu;
	}

	public void setUserStatu(String userStatu) {
		this.userStatu = userStatu;
	}

	public String getWxId() {
		return wxId;
	}

	public void setWxId(String wxId) {
		this.wxId = wxId;
	}

	public String getQqId() {
		return qqId;
	}

	public void setQqId(String qqId) {
		this.qqId = qqId;
	}

	public Set<Role> getUserRoleSet() {
		return userRoleSet;
	}

	public void setUserRoleSet(Set<Role> userRoleSet) {
		this.userRoleSet = userRoleSet;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + ", sex=" + sex + ", address=" + address + ", password="
				+ password + ", nickname=" + nickname + ", iconurl=" + iconurl + ", birthday=" + birthday + ", email="
				+ email + ", degree=" + degree + ", isActive=" + isActive + ", isOperate=" + isOperate + ", userStatu="
				+ userStatu + ", wxId=" + wxId + ", qqId=" + qqId + ", userRoleSet=" + userRoleSet + "]";
	}
}
