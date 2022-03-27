import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int number,temp;
		ServerSocket s1 = new ServerSocket(1342);// Listen the port number "1342"
		Socket ss = s1.accept(); // Accep the incoming request to s1 socket. 
		Scanner sc = new Scanner(ss.getInputStream()); //Accept the number that client pass
		number = sc.nextInt();
		
		temp = number*2;
		
		// Send result to the client
		PrintStream p = new PrintStream(ss.getOutputStream());
		p.println(temp); // Sends the number to the client
	}

}
