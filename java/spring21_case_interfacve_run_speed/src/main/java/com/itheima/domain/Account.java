package com.itheima.domain;

import java.io.Serializable;

/**
 * @projectName: spring03_bean_instance
 * @package: com.itheima.domain
 * @className: Account
 * @NAME: WANG CHAO
 * @date: 2023/09/02 10:17
 */
@SuppressWarnings({"all"})
public class Account implements Serializable {

    private Integer id;
    private String name;
    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
