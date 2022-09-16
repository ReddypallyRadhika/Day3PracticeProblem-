/**
 * 
 */
package com.bridgelabz;

/**
 * @author hp
 *
 */
public class ArrayLargestElement {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //Initialize array  
        int [] arr =  {25, 11, 7, 75, 56};  
        //Initialize max with first element of array.  
        int max = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max  
        	  if(arr[i] > max)  {
               max = arr[i];  
       System.out.println("Largest element in array: " + max);  
           }  
          // else {
        	//   System.out.println("exit");  
               
        	  // }
        }
	}

}
