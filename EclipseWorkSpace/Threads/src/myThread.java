public class myThread extends Thread {
/*
		 Thread = A thread of execution in a program (kind of like a virtual CPU)
		 			The JVM allows an application to have multiple threads running concurrently
		 			Each thread can execute parts of you code in parallel with the main thread 
		 			Each thread has a priority.
		 			Threads with higher priority are executed in preference compared to threads with lower priority.
		
		 The Java Virtual Machine continues to execute threads until either of the following occours
		 			1.The exit method of class Runtime has been called
		 			2.All user threads have died.
		 			
		 			
		When a JVM stars up, there is a thread is a thread which calls the main method 
		This thread is called "main" 			
		 			
		Daemon  thread is a low priority thread that runs in background to perform tasks such as garbage collection	
		JVM terminate itself when all user threads (non-daemon threads) finish their execution.
		 			
		 			
		Daemon = Arka plan programi
		
		 */

	@Override
	public void run() {
		if(this.isDaemon()) 
		System.out.print("Thread 2 : I am a Daemon thread");
		// end of if
		else 
			System.out.print("Thread 2 : I am a user thread");
		//end of else
		
		}// end of run
	
	
}// end of class
