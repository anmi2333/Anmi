package cn.itcast.test;

import cn.itcast.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.junit.Test;

import java.io.File;

/**
 * @projectName: javaweb12
 * @package: cn.itcast.test
 * @className: JacksonTest
 * @NAME: WANG CHAO
 * @date: 2023/08/19 22:49
 */
@SuppressWarnings({"all"})

    public class JacksonTest {
    @Test
        //1.java对象转为json字符串
        public void test1() throws  Exception {
        Person p = new Person();
        p.setName("jack");
        p.setAge(23);
        p.setGender("man");
        //2.创建jackson的核心对象
        ObjectMapper mapper = new ObjectMapper();
//        String json = mapper.writeValueAsString(p);
//        System.out.println(json);
        mapper.writeValue(new File("/Users/dreamtank121/Desktop/a.rtf"),p);
        //JsonIgnore
        //JsonFormat
    }
}
