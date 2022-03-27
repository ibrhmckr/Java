import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class serverr {
	
	//Initializing socket and input stream
	private Socket socket;
	private ServerSocket server;
	private DataInputStream in;
	
	
	//Creates a server and connects it to the given port
	public serverr(int port) {
		//starts server and waits for a connection
		try {
			//we start our server
			server = new ServerSocket(port);
			System.out.println("Server started");
			
			System.out.println("Waiting for client....");
			/*We accept the client in the given port 
			 * and create a socket
			 * we now have an established connection between our client and our server on the
			 * given socket 
			 */
			socket = server.accept(); // accept retuns a Socket that can be used for communication with the client
			
			// takes input from the client socket
			in = new DataInputStream(
					new BufferedInputStream(
							socket.getInputStream()
							)
					);
			String line = "";
			
			//reads message from client until "Stop" is sent
			while(!line.equals("Stop")) {
				
				try {
					line = in.readUTF();
					System.out.println(line);
					
				}// End of try
				catch(IOException i){
					System.out.println(i);
				}//End of catch
			}// End Of While loop
			
		}// end of try
		catch(IOException i) {
			System.out.println(i);
		}// end of catch
		
	}// end of Constructor
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		serverr server = new serverr(6666);

	}

}
