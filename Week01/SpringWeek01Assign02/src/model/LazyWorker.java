package model;

public class LazyWorker implements Worker{

    private double cost = 23.0;
    private double totalHoursPerWeek = 20.0;
    @Override
    public Double findSalary() {
        return this.cost * this.totalHoursPerWeek;
    }
}
