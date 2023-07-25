package com.hspedu.homework;

public class Homework01 {
    public static void main(String[] args) {
        /*
        定义一个person类 {name,age,job},初始化Person 对象数组,有3个person对象,
        * */
      /*  Person[] persons = new Person[3];
        persons[0] = new Person("jack", 10, "JavaEE工程师");
        persons[1] = new Person("tom", 50, "大数据工程师");
        persons[2] = new Person("mary", 30, "人工智能工程师");
        //输入当前对象数组
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);//默认对象toString
        }
        //使用冒泡排序
        Person tmp = null;//临时变量，用于交换
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1; j++) {
                //按照年龄从大到小
                if (persons[i].getName().length > persons[i + 1].getage().length()) {
                    tmp = persons[i];
                    persons[i] = persons[i + 1];
                    persons[i + 1] = tmp;
                }
            }
        }
        System.out.println("排序后的");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);//默认对象toString
        }
    }

    class Person{
        private String name;
        private int age;
        private String job;

        public Person(String name, int age, String job) {
            this.name = name;
            this.age = age;
            this.job = job;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setJob(String job) {
            this.job = job;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", job='" + job + '\'' +
                    '}';
        }

       */
    }
}
