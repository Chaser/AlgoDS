//Insertion Sort Practice

import java.util.*;

public class Insertion
{
	public static void sort(Comparable[] items)
	{
		int N = items.length;
		for(int i = 1; i < N; i++)
		{
			//Insert a[i] among a[i-1], a[i-2], a[i-3], etc...
			for(int j = i; j > 0 && less(items[i], items[i-1]); j--)
				exchange(items, j, j-1);
		}
	}

	private static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w) < 0;
	}

	private static void exchange(Comparable[] items, int i, int j)
	{
		Comparable t = items[i];
		items[i] = items[j];
		items[j] = t;
	}

	public static void show(Comparable[] items)
	{
		for(int i = 0; i < items.length; i++)
			System.out.print(items[i] + " ");

		System.out.println();
	}

	public static boolean isSorted(Comparable[] items)
	{
		//Test whether an array is in order
		for(int i = 1; i < items.length; i++)
		{
			if(less(items[i],items[i-1]))
				return false;
		}
		return true;
	}


	public static void main(String[] args)
	{
		String[] a = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
		sort(a);
		assert isSorted(a);
		show(a);
	}

}