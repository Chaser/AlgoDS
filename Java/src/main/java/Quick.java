

import java.util.*;
import java.util.Collections;

public class Quick
{
	
	public static void sort(Comparable[] arry)
	{
		Collections.shuffle(Arrays.asList(arry));
		show(arry);
		sort(arry, 0, arry.length - 1);

	}

	private static void sort(Comparable[] arry, int low, int high)
	{ 
		if(high <= low)
			return;
		int p = partition(arry, low, high);
		sort(arry, low, p - 1);					//Sort left half
		sort(arry, p + 1, high);					//Sort right half
	}

	private static int partition(Comparable[] arry, int left, int right)
	{
		// Partition into arry[lo..pivot-1], arry[pivot], arry[pivot+1..hi].
		Comparable pivot = arry[(left + right) / 2];
		while(left <= right)
		{
			//Find element on left that should be on right
			while(less(arry[left], pivot))
				left++;

			//Find element on right that should be left
			while(less(pivot, arry[right]))
				right--;

			//Swap elements on the right that should be on the left
			if(left <= right)
			{
				swap(arry, left, right);				//swap elements
				left++;
				right++;
			}
		}

		return left;							// with a[low..left-1] <= a[left] <= a[left+1..hi].
	}

	/*
	public void shuffle(Comparable [] arry)
	{
    	for(int i = 0; i < arry.length; i++)
        	swap(arry,i,getRandom(i,a.length-1);
	}
	*/

	private static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w) < 0;
	}

	private static void swap(Comparable[] arry, int i, int j)
	{
		Comparable swapData = arry[i];
		arry[i] = arry[j];
		arry[j] = swapData;
	}

	public static boolean isSorted(Comparable[] arry)
	{
		for(int index = 0; index < arry.length; index++)
		{
			if(less(arry[index], arry[index - 1]))
				return false;
		}
		return true;
	}

	public static void show(Comparable[] arry)
	{
		for(int index = 0; index < arry.length; index++)
			System.out.print(arry[index] + " ");
		System.out.println();
	}

	public static void main(String[] args)
	{
		String[] a = {"Q", "U", "I", "C", "K", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
		sort(a);
		assert isSorted(a);
		show(a);
	}

}