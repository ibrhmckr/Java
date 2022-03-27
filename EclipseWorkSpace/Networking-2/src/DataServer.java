import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Date;

public class DataServer {

	
	//VARIABLE DECLERATION
	private static final int PORT = 9090;
	
	public static void main(String[] args) throws IOException {
		//Listen the port
	   ServerSocket listener = new ServerSocket(PORT);
	   //When received request assign it to a port to com on it
	   Socket client = listener.accept();//blocker line
	  System.out.println("Server: CLIENT CONNECTED");
	   
	   //Write output information to clinet                     //auto flush
	   PrintWriter out = new PrintWriter(client.getOutputStream(),true);
	   out.println(   (new Date(0)).toString()     );
	   
	   //Close the socket otherwise it will keep track the connection
	   client.close();
	   //Close the socket otherwise it will keep track the connection
	   listener.close();
	   
	}

}
