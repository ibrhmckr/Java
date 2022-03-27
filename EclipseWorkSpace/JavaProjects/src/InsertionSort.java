/**
 * 
 * Preconditions InsertionSort is a class that has 
 * two function InsertionSort and printArray
 * 
 * InsertionSort use the insertion sort algorithm to sort
 * and array. The function need one array parameter @param arr[]
 * 
 * printArray function prints an passed array on the console
 * @param arr[] 
 *
 */


public class InsertionSort {
	
	
	  void sort(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=1; i<n; ++i) 
	        { 
	            int key = arr[i]; 
	            int j = i-1; 
	  
	            /* Move elements of arr[0..i-1], that are 
	               greater than key, to one position ahead 
	               of their current position */
	            while (j>=0 && arr[j] > key) 
	            { 
	                arr[j+1] = arr[j]; 
	                j = j-1; 
	            } 
	            arr[j+1] = key; 
	        }
	
	    }
	  
	  
	  static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.println(arr[i] + " "); 
	  
	        System.out.println(); 
	    } 
	  
	  
	  
	  
	  
	  
	  
	  
}
