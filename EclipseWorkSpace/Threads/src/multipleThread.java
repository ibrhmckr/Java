
public class multipleThread extends Thread{

	/*
	multithreading = Process of executing multiple threads simultaneously 
	  				 Helps maximum utilization of CPU
	  				 Threads are independent, they don`t affect the execution of other threads.
	  				  An exception in one thread will not interrupt other threads
	  				  useful for serving multiple clients, multiplayer games, or other mutually tasks
	 
	*/
	
	@Override
	//After starting the tread the method execute automaticially 
	public void run() {
		for(int i = 10; i > 0; i-- ) {
			System.out.println("Thread #1: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}// end of for
		System.out.println("Thread #1 finished :)");
		
	}// end of run
	
	
	
	
	
	
	
	
	
	
	
	
}
