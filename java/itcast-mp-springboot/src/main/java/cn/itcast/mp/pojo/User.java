package cn.itcast.mp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @projectName: itcast-mp-springboot
 * @package: itcast.mp.pojo
 * @className: User
 * @NAME: WANG CHAO
 * @date: 2023/09/07 11:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_user")
@SuppressWarnings({"all"})
public class User extends Model<User>{
    private Long id;
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private String email;
}
