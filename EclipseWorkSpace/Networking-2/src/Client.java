import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Client {
	//IP address of your computer address for web service
	private static final String SERVER_IP="127.0.0.1";
	//Server port number
	private static final int SERVER_PORT = 9094;
	//Scanner for keyboard
	
	public static void main(String[] args) throws IOException {
	
		//Connect to the server and create a new port to com over
		Socket socket = new Socket(SERVER_IP,SERVER_PORT);
		
		ServerConnection serverCon = new ServerConnection(socket); 
		
		//Receive data from that port  -- listen the socket
		BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//Read keyboard
		//BufferedReader keyboard = new BufferedReader(new InputStreamReader());
		Scanner keyboard = new Scanner(System.in);
		//Send data  /////////WARNING\\\\\\\\ IT IS SO EAST TO FORGET FLUSH() FUNCTION KEEP IT IN MIND
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		
		new Thread(serverCon).start();
		
		while(true) {
		System.out.print("> ");
		
		String command = keyboard.nextLine();
		System.out.println("command:"+command);
		out.print(command);
		
		if(command.equals("quit"))break;
		//Send command to Server
		out.println(command);		
		}// end of while
		
		//close socket
		socket.close();
		//exit the system
		System.exit(0);
	}// end of main

}// end of class
