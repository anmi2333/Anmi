package cn.itcast.jedis.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @projectName: javaweb13
 * @package: cn.itcast.jedis.util
 * @className: JedisPoolUtils
 * @NAME: WANG CHAO
 * @date: 2023/08/21 11:35
 * 加载配置文件 配置连接池参数
 * 提供获取连接方法
 */
@SuppressWarnings({"all"})
public class JedisPoolUtils {

    private static JedisPool jedisPool;

    static {
        //创建Properties对象
        Properties pro = new Properties();

        try (InputStream is = JedisPoolUtils.class.getClassLoader().getResourceAsStream("jedis.properties")) {
            //关联文件
            pro.load(is);

            //获取数据,设置到JedisPoolConfig中
            JedisPoolConfig config = new JedisPoolConfig();
            System.out.println(Integer.parseInt(pro.getProperty("maxTotal")));
            config.setMaxTotal(Integer.parseInt(pro.getProperty("maxTotal")));
            config.setMaxIdle(Integer.parseInt(pro.getProperty("MaxIdle")));

            jedisPool = new JedisPool(config, pro.getProperty("host"), Integer.parseInt(pro.getProperty("port")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //获取连接方法
    public static Jedis getJedis() {
        return jedisPool.getResource();
    }
}


