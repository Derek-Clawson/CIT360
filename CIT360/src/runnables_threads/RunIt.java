package runnables_threads;

import java.util.concurrent.*;

import exicutables.MultiThread;

public class RunIt {
	
	public static void main(String args[]) {
		Threds firstRun = new Threds("Runnable 1");
		firstRun.start();
		
		Threds secondRun = new Threds("Runnable 2");
		secondRun.start();
		
		Threds thirdRun = new Threds("Runnable 3");
		thirdRun.start();
		
		Threds fourthRun = new Threds("Runnable 4");
		fourthRun.start();
		
		Threds fifthRun = new Threds("Runnable 5");
		fifthRun.start();
		
		Threds sixthRun = new Threds("Runnable 6");
		sixthRun.start();
		
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


