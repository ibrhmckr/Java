import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;
import java.io.InputStreamReader;
public class ServerConnection implements Runnable {

	private Socket server;
	private BufferedReader in;
	
	
	ServerConnection(Socket s) throws IOException{
			server = s;
									//!!! do not forget NEW
			in = new BufferedReader(new InputStreamReader(server.getInputStream()));
		
	}// end of constructor

	
	
	
	
	@Override
	public void run() {

	try {
		while(true) {
			String serverResponse = in.readLine();
			if(serverResponse == null) break;
			System.out.println("Server says: "+serverResponse);
			
			
			
		}// end of while	
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}// end of finally
		
		
		
	
		
	}// end of run
	
}// end of main
