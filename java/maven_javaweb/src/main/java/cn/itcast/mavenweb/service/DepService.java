package cn.itcast.mavenweb.service;

import java.util.List;

import cn.itcast.mavenweb.domain.Dep;

/**
 * 部门业务逻辑层
 * @author Administrator
 *
 */
public interface DepService {

	public List<Dep> getList();
	
}
