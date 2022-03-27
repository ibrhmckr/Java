import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
	 int number, temp;
		 
      Scanner sc = new Scanner(System.in); // To receive data from user
      //Socket to communiicate -->  Simple socket --> Client use
      Socket s = new Socket("127.0.0.1",1342); //First paramater is the ip address of the computer that you want to connect
      Scanner sc1 = new Scanner(s.getInputStream());// Get output from the server					
      System.out.println("Enter num: ");
      number = sc.nextInt(); // Read interger from console
     
      PrintStream p = new PrintStream(s.getOutputStream()); // Pass the number to server
      p.println(number);
      temp = sc1.nextInt();// Result --> Accepting from server
      System.out.println(temp); // Wrties the server answer to the console
      
      
      
	}

}
