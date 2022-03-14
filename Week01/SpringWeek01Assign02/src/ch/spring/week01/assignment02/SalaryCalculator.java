package ch.spring.week01.assignment02;

import model.Worker;

import java.util.List;

public class SalaryCalculator {

    public Double calculate (List<Worker> workerList){
       return workerList.stream()
               .mapToDouble(Worker::findSalary)
               .sum();

    }

}
