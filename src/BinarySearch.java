import java.util.Scanner;

public class BinarySearch {
	
	int array[] = {2,4,7,8,9,10,20,30,40,55};
	
	//public method to find out the elements present in the array using binary search 
	
	public void BinarySearchMethod()
	{	
		int search=0,first,last,middle;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter value to find");
	    search = in.nextInt();
	 
	    first  = 0;
	    last   = this.array.length - 1;
	    middle = (first + last)/2;
	 
	    while( first <= last )
	    {
	      if ( array[middle] < search )
	        first = middle + 1;    
	      else if ( array[middle] == search ) 
	      {
	        System.out.println(search + " found at location " + (middle + 1) + ".");
	        break;
	      }
	      else
	         last = middle - 1;
	 
	      middle = (first + last)/2;
	   }
	   if ( first > last )
	      System.out.println(search + " is not present in the list.\n");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearch b =new BinarySearch();
		
		b.BinarySearchMethod();
	}

}
