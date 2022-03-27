
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		/*
		/////////////////////THREADS\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		
		int running_Threads = Thread.activeCount(); // return how many Thread is currently running
		System.out.println(running_Threads);
		
		Thread.currentThread().setName("mainThread"); // Alter name of the current running thread!
		String running_Threads_Names = Thread.currentThread().getName();
		
		System.out.println(running_Threads_Names);
		
			Thread.currentThread().setPriority(1);
		System.out.println(Thread.currentThread().getPriority());// Scale 1 -5, 5 is higher priority 
		
		System.out.println(Thread.currentThread().isAlive());//check wheither is alive or not
		

		for(int i = 3; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}// end of for
		
		
		System.out.println("It is done");
	
		myThread thread2 = new myThread();
		
		
		//thread2.start(); // Starts the thread !Warning tread2.run() runs the run() but thread2 is not alive 
	    //System.out.println(thread2.isAlive()); 	 
		
		thread2.setName("thread2");
		thread2.setPriority(10);
		System.out.println(thread2.getName());
		
		System.out.println(thread2.getPriority()); 
		
		
		System.out.println(Thread.activeCount());// how many threads are currently active
		
		
			myThread thread2 = new myThread();
		thread2.setDaemon(false);
		thread2.start();
		System.out.println(thread2.isDaemon());
		System.out.println(thread2.getPriority());
		/////////////////////END OF THREADS\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		
		
		
		
		////////////////////MULTIPLE THREAD\\\\\\\\\\\\\\\\\\\\\
		
		 */
	
		multipleThread thread1 = new multipleThread();
		
		myRunnable runnable1 = new myRunnable();
		Thread thread2 = new Thread(runnable1);//Another way to create a thread --- This method used more often
		
		thread1.setDaemon(true);
		thread2.setDaemon(true);
		
		
		thread1.start();
/*Code Blocker  */ thread1.join(); // Pause main thread until thread1 completely done
									  //calling thread(ex.main) wait until the specified thread dies or for x milliseconds	
		thread2.start();
		
		System.out.println(1/0);
		
		////////////////////END OF MULTIPLE THREAD\\\\\\\\\\\\\\\\\\\\\
		
		
		
		

	}//end of main

}// end of class
