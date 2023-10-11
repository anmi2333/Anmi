package cnm.itcast01.test;

import cnm.itcast01.dao.UserDao;
import cnm.itcast01.domain.User;
import org.junit.Test;

/**
 * @projectName: javaweb04
 * @package: cn.itcast.test
 * @className: UserDaoTest
 * @NAME: WANG CHAO
 * @date: 2023/08/15 17:52
 */
@SuppressWarnings({"all"})
public class UserDaoTest {
    @Test
    public void testLogin() {
        User loginuser = new User();
        loginuser.setUsername("superbaby");
        loginuser.setPassword("123");
        UserDao dao = new UserDao();
        User user = dao.login(loginuser);
        System.out.println(user);
    }
}
