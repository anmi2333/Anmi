package cn.itcast.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @projectName: javaweb07
 * @package: cn.itcast.domain
 * @className: User
 * @NAME: WANG CHAO
 * @date: 2023/08/17 11:44
 */
@SuppressWarnings({"all"})
public class User {
    private String name;
    private int age;
    private Date birthday;

 public User(String name, int age, Date birthday) {
  this.name = name;
  this.age = age;
  this.birthday = birthday;
 }
public User(){

}

 public String getBirStr() {//逻辑视图方法
     if (birthday != null) {
        //1. 格式化日期对象
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      //2. 返回字符串即可
      return sdf.format(birthday);
     } else {
      return "";
     }
    }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 public Date getBirthday() {
  return birthday;
 }

 public void setBirthday(Date birthday) {
  this.birthday = birthday;
 }
}
