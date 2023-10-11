package com.itheima.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @projectName: jedis_demo
 * @package: com.itheima.test
 * @className: JedisTset
 * @NAME: WANG CHAO
 * @date: 2023/09/20 15:42
 */
@SuppressWarnings({"all"})
public class JedisTset {

    @Test
    public void testRedis() {
        //1 获取连接
        Jedis jedis = new Jedis("localhost",6379);

        //2 执行具体操作
        jedis.set("username","xiaoming");//set方法 k-v
        String username = jedis.get("username");
        System.out.println(username);

        //3 关闭连接
        jedis.close();

    }
}
