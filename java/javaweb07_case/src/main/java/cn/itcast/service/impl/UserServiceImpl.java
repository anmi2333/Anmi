package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.domain.User;
import cn.itcast.service.UserService;

import java.util.List;

/**
 * @projectName: javaweb07_case
 * @package: cn.itcast.service.impl
 * @className: UserServiceImp
 * @NAME: WANG CHAO
 * @date: 2023/08/17 17:39
 */
@SuppressWarnings({"all"})
public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();
    @Override
    public List<User> findAll() {
        //调用Dao完成查询
        return null;
    }
}
