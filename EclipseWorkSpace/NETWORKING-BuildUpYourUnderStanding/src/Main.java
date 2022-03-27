
public class Main {

	public static void main(String[] args) {
		
		serverWriter ServerListener = new serverWriter();
		Thread ThreadServerListener = new Thread(ServerListener);
		ThreadServerListener.start();
		
		clientListener ClientListener = new clientListener();
		Thread ThreadClientListener = new Thread(ClientListener);
		ThreadClientListener.start();
		
	}// end of main
	
	
}
