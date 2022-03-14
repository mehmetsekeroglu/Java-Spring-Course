package ch.spring.week01.assignment02;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class WorkerFactory {
   public static List<Worker> generate(int numberOfWorkers){
       List<Worker> workerList = new ArrayList<>();

       workerList.add(new LazyWorker());
       workerList.add(new ChildWorker());
       workerList.add(new GoodWorker());
       workerList.add(new DisabledWorker());

       return workerList;
   }
}
