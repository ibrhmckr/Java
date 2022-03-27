
public class hackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.out.println(sumEven(4));
	}

	public static int sumEven(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				sum +=i; 
			}// end of if
			
		}//end of for
		
		
		return sum;	
	}// end of function
	
}
