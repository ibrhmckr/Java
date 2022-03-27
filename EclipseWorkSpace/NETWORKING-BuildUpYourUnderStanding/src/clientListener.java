import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class clientListener implements Runnable {
	
	
	public static void main(String[] args) {
		
		clientListener ClientListener = new clientListener();
		Thread ThreadClientListener = new Thread(ClientListener);
		ThreadClientListener.start();
		
	}// end of main
 
 

	@Override
	public void run() {
		try {
			//ip address and socket  to communicate Server
			Socket s = new Socket("localhost",5002);
			while(true) {
			//Read data from s port
			InputStreamReader in = new InputStreamReader(s.getInputStream());
			//Transfer data into buffer memory
			BufferedReader bf = new BufferedReader(in);
			//Resolve buffer
			String str = bf.readLine();
			System.out.println("Server : "+str);
			}// end of while
			
		}// end of try 
			
			catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}// end of run

	
	
	
}// end of class
