package ch.spring.week01.assignment02;

import model.Worker;

import java.util.List;

public class FarmStarter {
    public static void main(String[] args) {

        System.out.println(findTotalDebt());

    }

    private static Double findTotalDebt(){
        List<Worker> workerList = WorkerFactory.generate(4);
        SalaryCalculator salaryCalculator = new SalaryCalculator();

       return salaryCalculator.calculate(workerList);
    }
}
