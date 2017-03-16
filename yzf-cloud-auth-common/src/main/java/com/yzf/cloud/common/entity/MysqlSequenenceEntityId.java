package com.yzf.cloud.common.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public class MysqlSequenenceEntityId {
	
	@Id
	@GenericGenerator(name="sys_uuid", strategy="uuid")
	@GeneratedValue(generator="sys_uuid")
	protected String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
