import java.util.Scanner;


public class view { // Get data and presents current data to user. 
	public void printString(String s){
		System.out.println(s);
		}
	public int getInt() {
		Scanner s = null;
		try{
			 s = new Scanner(System.in);
		}catch(Exception e) {
			System.out.println(e);
		}
		return s.nextInt();
		
	}
	
	

}// End of class
