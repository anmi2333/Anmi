package cn.itcast.mp.simple.pojo;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @projectName: itcast-mybatis-plus
 * @package: cn.itcast.mp.simple.pojo
 * @className: User
 * @NAME: WANG CHAO
 * @date: 2023/09/07 11:13
 */
@SuppressWarnings({"all"})
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_user")
public class User {
    private Long id;
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private String email;
}
