import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.lang.*;
//import java.util.Collection;
//import java.util.Comparator;
class Emps{
	String name;
	int age;
	Emps(String name,int age){
		this.name = name;
		this.age = age;
		
	}// END OF CONSTRUCTOR
	
	
	
}// END OF Emps
public class Generic{
	public static <A> void  print(A[] a) {
		for(A item : a) {
			System.out.printf("%s \n", item);	
			}
		
	}//END OF PRINT
	public static void main(String[] args) {
		/*
		String[] s = {"Monday","Tuesday","Wednesday", "Thursday","Friday","Saturday","Sunday"}; 
		Generic g = new Generic();
		g.print(s);	
		*/
		
	  ArrayList<Emps> al = new ArrayList<>();
	  al.add(new Emps("Monica",80));
	  al.add(new Emps("Sameer",45));
	  
	  
     Collections.sort(al, new AgeComparator());
     
     for(Emps e1 : al) {
    	 System.out.println(e1.name+" "+e1.age);
     }
     
     
     
     
		
		
		
		
		
		
		
	}// END OFMAIN
}//END OF CLASS
