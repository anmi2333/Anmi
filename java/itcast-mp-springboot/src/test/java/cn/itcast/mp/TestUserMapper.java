package cn.itcast.mp;

import cn.itcast.mp.mapper.UserMapper;
import cn.itcast.mp.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class TestUserMapper {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testSelectPage(){

        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.gt("age",20);

        Page<User> page = new Page<>(1, 1);

        //根据条件查询数据
        IPage<User> userIPage = this.userMapper.selectPage(page, userQueryWrapper);
        System.out.println("数据总条数："+userIPage.getTotal());
        System.out.println("总页数："+userIPage.getPages());

        for (User record : userIPage.getRecords()) {
            System.out.println("user="+record);
        }
    }

}
