import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler implements Runnable{

	private Socket client;
	private BufferedReader in;
	private PrintWriter out;
	private ArrayList<ClientHandler> clients;
	public ClientHandler(Socket clientSocket,ArrayList<ClientHandler> clients) throws IOException {
		
		this.client = clientSocket;
		this.clients = clients;
		in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		out = new PrintWriter(client.getOutputStream(),true);
	}// end of constructor
	
	

	
	@Override
	public void run(){
		
		try {
			
			while(true) {
				String request;
			
				request = in.readLine();
			
			if(request.contains("name")) {
				out.println(Server.getRandomName());
			}// end of if
			else if(request.startsWith("say")){   
				
				int firstSpace = request.indexOf(" "); //get index of first space
				outToAll(request.substring(firstSpace + 1 ));
				
			}// end of else if
			
			else out.println("Type 'tell me a name' to get a random name");
			
			
		}// end of while
		
		}// end of try
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			out.close();
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}// end of finally
		
	}




	private void outToAll(String msg) {
		
		for(ClientHandler client : clients) {
			
			client.out.println(msg); // Send message to ?
			
		}// end of for
	}

}
