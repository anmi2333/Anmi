package cn.itcast.mavenweb.service.impl;

import java.util.List;

import cn.itcast.mavenweb.dao.DepDao;
import cn.itcast.mavenweb.domain.Dep;
import cn.itcast.mavenweb.service.DepService;
/**
 * 部门业务逻辑层
 * @author Administrator
 *
 */
public class DepServiceImpl implements DepService {

	private DepDao depDao;
	
	public void setDepDao(DepDao depDao) {
		this.depDao = depDao;
	}

	@Override
	public List<Dep> getList() {
		// TODO Auto-generated method stub
		return depDao.getList();
	}

}
