package model;

public class GoodWorker implements Worker{

    private double cost = 40.0;
    private double totalHoursPerWeek = 40.0;
    @Override
    public Double findSalary() {
        return this.cost * this.totalHoursPerWeek;
    }
}
