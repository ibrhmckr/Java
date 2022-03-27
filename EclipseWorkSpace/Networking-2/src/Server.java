import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

	
	//Variable  Declarations
	private static String[] names = {"Wily","Felix","Carlbad","Hobob"};
	private static String[] adjs = {"the gentle","the un-gentle","the overwrought"};
	private static final int PORT = 9094;
	
	private static ArrayList<ClientHandler> clients = new ArrayList<>();
	private static ExecutorService pool = Executors.newFixedThreadPool(4);
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		// Listen the PORT
		ServerSocket listener = new ServerSocket(PORT);
		
		while(true) {
		
		System.out.println("[SERVER] Waiting for client connection...");
		//Waiting for request
		Socket client = listener.accept();//Blocking code
		System.out.println("[SERVER] Connected to client!");
		
		ClientHandler clientThread = new ClientHandler(client,clients);
		clients.add(clientThread);
		
		pool.execute(clientThread);
		}// end of while
		
	}//end of main

	public static String getRandomName() {
		String name = names[(int)(Math.random() * names.length)];
		String adj = adjs[(int)(Math.random() *  adjs.length)];
		return name +" "+ adj;
	}// end of getRandomName
	
	
	
	
	
}// end of class
