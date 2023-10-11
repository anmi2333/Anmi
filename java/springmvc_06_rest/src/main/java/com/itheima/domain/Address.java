package com.itheima.domain;

/**
 * @projectName: springmvc_01_quickstart
 * @package: com.itheima.domain
 * @className: Address
 * @NAME: WANG CHAO
 * @date: 2023/09/02 23:10
 */
@SuppressWarnings({"all"})
public class Address {
    private String province;
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
