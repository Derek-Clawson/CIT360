package runnables_threads;

public class Threds implements Runnable {

	private Thread first;
	private String name;
	
	Threds(String name1) {
		name = name1;
		System.out.println("Created " + name);
	                 
	}
	public void run() {
		System.out.println("Running " + name);
		
		try {
			for(int i =7; i>0; i--){
				System.out.println(name + " will sleep in " + i);
				Thread.sleep(500);
			                       }
		    }
		catch(InterruptedException e) {
			System.out.println("Timer Interrupted");
		                              }
		System.out.println("Timer Finished");
	                  }
	
	public void start () {
        System.out.println("Starting " +  name );
        if (first == null) {
            first = new Thread (this, name);
            first.start ();
        }
	}
}