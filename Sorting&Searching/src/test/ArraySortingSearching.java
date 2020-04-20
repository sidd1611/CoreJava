//Sorting and Searching in Java:

//We use the following methods from "java.util.Arrays" class to perform Sorting & Searching:
//i) Method Signature:  public static void sort(arr[]);  
//	 syntax:            Arrays.sort(array_variable);)
//ii)Method Signature:  public static int binarySearch(arr_var, element); 
//   syntax:            int p = Arrays.binarySearch(array_variable, element);

package test;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingSearching
{
	public static void main(String[] args)
	{
		try(Scanner s = new Scanner(System.in);)
		{
			System.out.println("Enter the number of elements: ");
			int n = Integer.parseInt(s.nextLine());
			
			Integer a[] = new Integer[n];
			
			System.out.println("===Enter the elements===");
			for(int i=0; i<n; i++)
			{
				a[i] = new Integer(s.nextInt());
			}
			
			System.out.println("===Displaying Array before sorting===");
			for(Integer i: a)
			{
				System.out.println(i+" ");
			}//end of loop
			
			Arrays.sort(a);//Quick-Sorting process
			               //Sorts the specified array of objects into ascending-order
			
			System.out.println("==Displaying Array after Sorting==");
			for(Integer k : a)
			{
				System.out.println(k+" ");
			}
			
			System.out.println("Displaying Array in reverse order i.e. in descending order");
			for(int x = n-1; x>=0; x--)
			{
				System.out.println(a[x]);
			}
			
			System.out.println("\nEnter the element to be searched in the Array (sorted in "
					           + "ascending order): ");
			Integer ele = new Integer(s.nextInt());
			
			int p = Arrays.binarySearch(a, ele);//Searches the specified array for the 
			                 //specified object using the binary search algorithm. The array 
			                 //must be sorted into "ascending order" according to the natural 
			                 //ordering of its elements (as by the sort(Object[]) method)
			                 //prior to making this call. Returned index is 0-based
			if(p>=0)
			{
				System.out.println("Element found at index value: "+p);
			}
			else
			{
				System.out.println("Element not available....");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
