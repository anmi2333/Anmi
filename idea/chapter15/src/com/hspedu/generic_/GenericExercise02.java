package com.hspedu.generic_;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
@SuppressWarnings("all")
public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom", 20000, new MyDate(2000,11,11)));
        employees.add(new Employee("jack", 12000, new MyDate(2001,12,12)));
        employees.add(new Employee("wc", 20000, new MyDate(1980,10,1)));

        System.out.println(employees);
        System.out.println("==对雇员进行排序==");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return 0;
            }
        });
    }
}
