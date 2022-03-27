import java.util.Comparator;

public class AgeComparator implements Comparator<Emps>{
	
	public int compare(Emps e1,Emps e2) {
		if(e1.age == e2.age) {
			return 0;
		}
		else if(e1.age > e2.age) {
			return 1;
		}
		else return -1;
		
	}// 	END OF compare
}	// END OF AgeComparator