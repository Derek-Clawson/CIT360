package runnables_threads;

public class MultiThread implements Runnable {

	
	private String tNumber;
	
	public MultiThread(String threadNumber) {
        this.tNumber = threadNumber;
    }
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Thread Number = " + tNumber);
		getNumber();
		
	}

	private void getNumber() {
		
		 try {
	            Thread.sleep(500);
	        }
	        catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
}


