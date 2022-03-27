import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class serverWriter implements Runnable  {
   
	public static void main(String[] args) {
		
		serverWriter ServerListener = new serverWriter();
		Thread ThreadServerListener = new Thread(ServerListener);
		ThreadServerListener.start();
		
		
	}// end of main
	
	
	
	Scanner sc;
	PrintWriter pr;
	@Override
	public void run() {
		try {
			// Create a Server port 
			ServerSocket ss = new ServerSocket(5002);
			//Listen server port. When client requested, create a port to communicate over it
			Socket s = ss.accept(); //Blocker code
			System.out.println("Connected to Client");
			//Data send over the s port
			 pr = new PrintWriter(s.getOutputStream());
			//Message
			String str = "Hi Client I am running fine "
			+ "/n Write your message below";	
			//Send Message
			pr.println(str);
			//Flush the PrintWriter
			
			while(true) {
				sc = new Scanner(System.in);
				str = sc.next();
				pr.print(str);
				pr.flush();
			}// end of while
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}// end of class





