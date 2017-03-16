package com.yzf.cloud.auth.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.yzf.cloud.auth.model.dto.CommonRecDTO;
import com.yzf.cloud.auth.model.dto.RoleDTO;
import com.yzf.cloud.auth.model.entity.Role;
import com.yzf.cloud.common.dao.CustomBaseSqlDaoImpl;
import com.yzf.cloud.common.dao.PageModel;

public class RoleDaoImpl extends CustomBaseSqlDaoImpl{
	
	@SuppressWarnings("unchecked")
	public List<Role> findRoles(Map<String, Object> params) {
		StringBuilder sb = new StringBuilder();
		sb.append("select r from Role r");
		
		if(params != null) {
			StringBuilder sbWhere = new StringBuilder();
			Object roleName = params.get("roleName");
			if(null != roleName) {
				sbWhere.append(" and r.name like :name ");
			}
			
			Object deleteFlag = params.get("deleteFlag");
			if(deleteFlag != null){
				sbWhere.append(" and r.deleteFlag = :deleteFlag ");
			}
			
			sb.append(sbWhere.toString().replaceFirst("and", "where"));
		}
		sb.append("order by r.createTime");
		return this.queryByMapParams(sb.toString(), params);
	}
	
	@SuppressWarnings("unchecked")
	public PageModel<Role> queryRolePage(RoleDTO roleDTO){
		Map<String, Object> params = new HashMap<String, Object>();
		StringBuilder hql = new StringBuilder();
		hql.append(" select r from Role r where r.deletedFlag = '0'");
		if(!StringUtils.isEmpty(roleDTO.getName())){
			hql.append(" and r.name like :name ");
			params.put("name", "%"+roleDTO.getName()+"%");
		}
		
		if(roleDTO.getRoleSta() != null){
			hql.append(" and r.roleSta = :roleSta ");
			params.put("roleSta", roleDTO.getRoleSta());
		}
		
		hql.append(" order by r.createTime desc ");
		return this.queryForPageWithParams(hql.toString(), params, Integer.parseInt(roleDTO.getCurrentPage()), Integer.parseInt(roleDTO.getPageSize()));
	}
}
