package cn.itcast.jedis.test;

import cn.itcast.jedis.util.JedisPoolUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @projectName: javaweb13
 * @package: cn.itcast.jedis.test
 * @className: JedisTest
 * @NAME: WANG CHAO
 * @date: 2023/08/20 22:35
 */
@SuppressWarnings({"all"})
public class JedisTest {
    /**
     * jedis测试类
     */
    @Test
    public void test1(){
        //1.获取连接
        Jedis jedis = new Jedis("localhost",6379);
        //2.操作
        // 设置键值对
        jedis.set("name", "WANGCHAO");
        // 获取键值对的值
        String value = jedis.get("key");
        // 执行其他 Redis 命令
        //jedis.incr("counter");
        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test2(){
        //1.获取连接
        Jedis jedis = new Jedis();
        //2.操作
        // 设置键值对
        jedis.set("username", "zhangsan");
        // 获取键值对的值
        String username = jedis.get("username");
        System.out.println(username);
        // 执行其他 Redis 命令
        //可以使用setex()方法存储可以指定过时时间 K-V 此方法是将kv存入并且保存20s
        jedis.setex("activecode",20,"hehe");
        //jedis.incr("counter");
        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test3(){
        //1.获取连接
        Jedis jedis = new Jedis();
        //2.操作
        jedis.hset("user", "name","lisi");
        jedis.hset("user", "age","23");
        jedis.hset("user", "gender","male");
        // 获取键值对的值
        String name = jedis.hget("user","name");
        //获取hash中所有的数据
        Map<String, String> user = jedis.hgetAll("user");
        //keyset
        Set<String> keySet = user.keySet();
        for (String key : keySet) {
            String value = user.get(key);
            System.out.println(key + ":" + value);
        }
        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test4(){
        //1.获取连接
        Jedis jedis = new Jedis();
        //2.操作
        //listcu存储
        jedis.lpush("mylist","a","b","c");//左
        jedis.rpush("mylist","a","b","c");//右
        List<String> lrange = jedis.lrange("", 0, -1);
        System.out.println(lrange);
        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test5(){
        //1.获取连接
        Jedis jedis = new Jedis();
        //2.操作
        //set存储
        jedis.sadd("myset", "java", "php", "c++");
        //set获取
        Set<String> smembers = jedis.smembers("myset");//获取所有元素
        System.out.println(smembers);
        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test6(){
        //1.获取连接
        Jedis jedis = new Jedis();
        //2.操作
        //sorted排序存储
        jedis.zadd("mysortedset", 3, "yase");
        jedis.zadd("mysortedset", 30, "base");
        jedis.zadd("mysortedset", 25, "case");
        //set获取
        Set<String> mysortedset = jedis.zrange("mysortedset",0,-1);//获取所有元素
        System.out.println(mysortedset);
        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test7(){
        /**
         * jedis连接池的使用
         */
        //0.创建一个配置对象
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(50);//设置最大连接数
        config.setMaxIdle(10);//空闲连接

        //1.创建Jedis连接池对象
        JedisPool jedisPool = new JedisPool();
        //2.获取连接
        Jedis jedis = jedisPool.getResource();
        //3.使用
        jedis.set("hehe","haha");
        //4.关闭 归还到连接池中
        jedis.close();
    }

    @Test
    public void test8(){
        /**
         * jedis连接池的使用
         */
        //通过连接池工具类获取
        Jedis jedis = JedisPoolUtils.getJedis();

        //3.使用
        jedis.set("hello","world");
        //4.关闭 归还到连接池中
        jedis.close();
    }
}
