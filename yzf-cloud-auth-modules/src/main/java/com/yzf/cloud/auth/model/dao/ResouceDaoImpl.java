package com.yzf.cloud.auth.model.dao;

import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.yzf.cloud.auth.model.dto.ResourceDTO;
import com.yzf.cloud.auth.model.entity.Resource;
import com.yzf.cloud.common.dao.CustomBaseSqlDaoImpl;
import com.yzf.cloud.common.dao.PageModel;

public class ResouceDaoImpl extends CustomBaseSqlDaoImpl{

	@SuppressWarnings("unchecked")
	public List<Resource> findResource(Map<String, Object> params){
		StringBuilder sb = new StringBuilder();
		
		sb.append(" select re from Resource re");
		StringBuilder sbInner = new StringBuilder();
		Object resource = params.get("funcName");
		if(null!= resource){
			sbInner.append(" and re.funcName = :funcName");
		}
		Object resource2 = params.get("funcUrl");
		if(null!=resource2){
			sbInner.append(" and re.funcUrl = :funcUrl");
		}
		sb.append(sbInner.toString().replaceFirst("and", "where"));
		return this.queryByMapParams(sb.toString(), params);
		}
	
	@SuppressWarnings("unchecked")
	public PageModel<Resource> queryResourcePage(ResourceDTO resourceDTO){
		StringBuilder sb = new StringBuilder();
		sb.append(" select re from Resource re where re.deletedFlag = '1'");
		String funcName = resourceDTO.getFuncName();
		if(StringUtils.isEmpty(funcName)) {
			sb.append(" and re.funcName like "+"%"+funcName+"%");
		}
		String funcType = resourceDTO.getFuncType();
		if(StringUtils.isEmpty(funcType)) {
			sb.append(" and re.funcType is "+funcType);
		}
		return this.queryForPage(sb.toString(), Integer.valueOf(resourceDTO.getCurrentPage()), Integer.valueOf(resourceDTO.getPageSize()));
	}
	
}
