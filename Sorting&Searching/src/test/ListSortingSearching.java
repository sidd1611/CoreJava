//Sorting & Searching on Collection<E> objects:

//We cannot perform sorting on Set & Queue Object as these do not contain index values. We
//can use (public abstract boolean contains(java.lang.Object) method from java.util.Set &
//java.util.Deque to perform search operations on them straightway.

//When we want to perform Sorting & Searching process on Collection<E>  objects, we perform
//on List<E> objects Collections, because only List<E> type Collections has index-value.

//We use following methods from "java.util.Collections" class for Sorting & Searching process:
//i) Method Signature: public static <T> void sort(List<T>); 
//	 Syntax:           Collections.sort(list_variable);)
//ii)Method Signature: public static <T> int binarySearch(List<T>, element); 
//   syntax:           int p = Collections.binarySearch(list_variable, element);)

package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListSortingSearching
{
	public static void main(String[] args)
	{
		try(Scanner s = new Scanner(System.in);)
		{
			ArrayList<Integer> a1 = new ArrayList<Integer>();
			
			System.out.println("Enter the number of elements: ");
			int n = Integer.parseInt(s.nextLine());
			
			System.out.println("Enter the elements: ");
			for(int i=0; i<n; i++)
			{
				a1.add(new Integer(s.nextInt()));
			}//end of loop
			
			System.out.println("==Displaying from List<E> before Sorting: ");
			a1.forEach((k)->
			{
				System.out.println(k+" ");
			});
			
			Collections.sort(a1);//Quick Sorting Process
			
			System.out.println("==Displaying from List<E> after Sorting (in ascending order): ");
			a1.forEach((k)->
			{
				System.out.println(k+" ");
			});
			
			System.out.println("Enter the element to be searched: ");
			Integer ele = new Integer(s.nextInt());
			
			int p = Collections.binarySearch(a1, ele);
			if(p>=0)
				System.out.println("Element found in List (sorted in ascending order)"
						           + " at index value: "+ p);
			else
				System.out.println("Element not available....");
		}//end of try
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}