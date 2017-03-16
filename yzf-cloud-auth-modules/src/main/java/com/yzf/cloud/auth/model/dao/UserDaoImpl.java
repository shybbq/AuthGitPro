package com.yzf.cloud.auth.model.dao;

import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.yzf.cloud.auth.model.dto.CommonRecDTO;
import com.yzf.cloud.auth.model.entity.User;
import com.yzf.cloud.common.dao.CustomBaseSqlDaoImpl;
import com.yzf.cloud.common.dao.PageModel;

public class UserDaoImpl extends CustomBaseSqlDaoImpl{

	@SuppressWarnings("unchecked")
	public List<User> findUsers(Map<String ,Object> params) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("select u from User u where u.deletedFlag = '0' and u.isActive = '1'");
		Object name = params.get("name");
		if(!StringUtils.isEmpty(name)) {
			sb.append(" and u.name = :name");
		}
		if(!StringUtils.isEmpty("nickName")){
			sb.append(" and u.nickName like :nickName");
		}
		sb.append(" order by u.createTime desc");
		return this.queryByMapParams(sb.toString(), params);
	}
	
	/**
	 * 根据用户信息查询分页信息
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public PageModel<User> queryUserPage(CommonRecDTO commonRecDTO) {
		StringBuilder sb = new StringBuilder();
		sb.append("select u from User u where u.deletedFlag = '0' and u.isActive = '1'");
		if(!StringUtils.isEmpty(commonRecDTO.getNickName())){
			sb.append(" and u.nickName like "+"%"+commonRecDTO.getNickName()+"%");
		}
		sb.append("order by u.createTime desc");
		PageModel page = null;
		try {
			page = queryForPage(sb.toString(), Integer.parseInt(commonRecDTO.getCurrentPage()),
					Integer.parseInt(commonRecDTO.getPageSize()));
		} catch (NumberFormatException e) {
			System.out.println("-- 方法 queryUserPage--出错 原因为： "+e);
		}
		return page;
	}
	
	
}
