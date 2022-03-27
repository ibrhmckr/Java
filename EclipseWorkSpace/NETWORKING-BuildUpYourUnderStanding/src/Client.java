import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
	BUILD UP YOUR OWN UNDERSTANDING
		
		1-Write a SINGLE INTERACTION
		2-Learn about threads
		3-Write an interactive client and server (Two way communication)
		
		4-Learn how the server can handle multiple client connections.
		
		5- Put the TextWorld game on the server. Make the client just display outputs sent from the server.
	
	*/


public class Client {
   /* /////////////////SINGLE INTERACTION\\\\\\\\\\\\\\\\\\\\\\
	public static void main(String[] args)  throws IOException {

		Socket s = new Socket("localhost",3999);
		
		//Get data over the s port
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);
		String str = bf.readLine();
		System.out.println("Server Says : "+str);
		
	}// end of main
	
	/////////////////END SINGLE INTERACTION\\\\\\\\\\\\\\\\\\\\\\
	*/	
	
	Client() throws IOException{
	
	Socket s = new Socket("localhost",3999);
	
	/*
	//Wait Response From Server
	InputStreamReader in = new InputStreamReader(s.getInputStream());
	//Transfer data into arabellek=buffer memory
	BufferedReader bf = new BufferedReader(in);
	//read buffer
	String str = bf.readLine();
	//Display message
	System.out.println("Server : "+str);
	*/
	
	
	
	
	
	
	
	}// end of constructor
	
	
	


}
