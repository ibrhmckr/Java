import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
   
	/*
	BUILD UP YOUR OWN UNDERSTANDING
		
		1-Write a SINGLE INTERACTION
		2-Learn about threads
		3-Write an interactive client and server (Two way communication)
		
		4-Learn how the server can handle multiple client connections.
		
		5- Put the TextWorld game on the server. Make the client just display outputs sent from the server.
	
	*/
	
	/*   /////////////////SINGLE INTERACTION\\\\\\\\\\\\\\\\\\\\\\
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(3999); //Listen port 3999
		Socket s = ss.accept(); //Blocking code
		System.out.println("///////////CLIENT CONNECTED TO SERVER\\\\\\\\\\\\");
		
		//Sent connected state to client
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("CONNECTED TO SERVER");
		pr.flush();
		/*
		//Read data from Client
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);
		String str =  bf.readLine();
		System.out.println("Client Says : "+str);
		
		
			}// end of main

		/////////////////END SINGLE INTERACTION\\\\\\\\\\\\\\\\\\\\\\
	
   */
	Socket s;
	Server() throws IOException{	
		ServerSocket ss = new ServerSocket(3999);
	    s = ss.accept(); //Blocking line  listen the port
	    System.out.println("CLIENT CONNECTED");
		
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("Connected to Server!");		
	}//end of consructor
	
	
	public Socket getSocket(){
		return s;
	}// end of getsocket
	
	
	
	
}// end of Server






