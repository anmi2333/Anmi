package com.hspedu.abstract_;

public class Manage extends Employee {

    private double bonus;
    public Manage(String name, int id, double salary) {
        super(name, id, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {

    }
}

