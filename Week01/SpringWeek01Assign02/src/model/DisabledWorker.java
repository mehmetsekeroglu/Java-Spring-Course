package model;

public class DisabledWorker implements Worker {

    private double cost = 10.0;
    private double totalHoursPerWeek = 30.0;

    @Override
    public Double findSalary() {
        return this.cost * this.totalHoursPerWeek;
    }
}
