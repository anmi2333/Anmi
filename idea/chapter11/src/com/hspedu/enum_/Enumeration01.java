package com.hspedu.enum_;

public class Enumeration01 {
    public static void main(String[] args) {
        //使用
        Season spring = new Season("春天","温暖");
        Season winter = new Season("冬天","寒冷");
        Season summer = new Season("夏天","炎热");
        Season autumn = new Season("秋天","凉爽");
        //因为对于季节而已,他的对象(具体值),是固定的四个,不会有更多
        Season other = new Season("天","~~~");
    }
}

class Season {
    private String name;
    private String desc;//描述

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
