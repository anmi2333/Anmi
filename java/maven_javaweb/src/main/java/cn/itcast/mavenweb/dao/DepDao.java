package cn.itcast.mavenweb.dao;

import java.util.List;

import cn.itcast.mavenweb.domain.Dep;

/**
 * 部门接口
 * @author Administrator
 *
 */
public interface DepDao {
	
	public List<Dep> getList();
	
}
