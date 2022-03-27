import java.util.Scanner;

public class tryme {

	public static void main(String[] args) {
		
	String s = "Opthema Teknoloji";
	//char array = getChars(s);
	char[] array = new char[50];
	char[] reverseArray = new char[50];	
	s.getChars(0, s.length(), array, 0);
	//System.out.println(s);
	for(int i=s.length()-1,j=0; i >= 0; i--,j++) {
		  reverseArray[j] = array[i];
		  System.out.println(reverseArray);
		  
	}// end of for
	//System.out.println(array[0]);
	
		
	}

	
	
	
	
	
	
	
	
	
	
	
	/*
	
	public static void reverse(String[] s) {
		
		
		
		
	}// end of 
	*/
}
