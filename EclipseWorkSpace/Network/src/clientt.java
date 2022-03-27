import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class clientt {
	
	/* We initialize out socket(tunnel)
	 * and our input reader and output stream
	 * we will take the input from the user
	 * and send it to the socket using output stream
	 */
	
	private Socket socket;
	private BufferedReader input;
	public DataOutputStream out;
	
	//Constructor that takes ip address and the Port Number
	public clientt(String address, int portNumber) {
		
		  // Try to establish a connection
		try {
			 // creates a socket with the given information
			socket = new Socket(address,portNumber);
			System.out.println("Connected to Socket num: "+portNumber+"\n");
			
			// We are ready the input reader
			input = new BufferedReader(new InputStreamReader(System.in));
			
			// and the output that is connected to the Socket
			out = new DataOutputStream(socket.getOutputStream());
		} catch(UnknownHostException u) {
			System.out.println(u);
			
		}// End of catch
		catch(IOException i) {
			System.out.println(i);
			
		}// End of catch
		
		// string to read message from input
		String line = "";
		
		//keep reading until "Stop" is input
		
		while(!line.equals("Stop")) {
			try {
				 line = input.readLine();// Readline from the keyboard
				 
				 out.writeUTF(line);//writes it to be the output stream
				 // now we just need to collect the data from the socket on our server
			}// End of try
			
			catch(IOException i){
				System.out.println(i);
			}// End of catch 
			
		}// End of While
		
			
		
	}// end of CONSTRUCTOR
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clientt client = new  clientt("127.0.0.1",6666);
	}// End of main

}
