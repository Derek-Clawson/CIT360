package exicutables;

import java.util.concurrent.*;

public class ExecutorMain {

    public static void main(String[] args) {

        ExecutorService newExec = Executors.newFixedThreadPool(16);
//this section creates 16 executors
        for (int i = 0; i < 16; i++) {
            Runnable worker = new MultiThread(" " + i);
            newExec.execute(worker);
        }
        newExec.shutdown();

        while (!newExec.isTerminated()) {
        }

        System.out.println("All threads are finished");
    }

    
}
