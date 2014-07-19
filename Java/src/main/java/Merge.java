

import java.util.*;

public class Merge
{
	private static Comparable[] aux;

	public static void sort(Comparable[] items)
	{
		aux = new Comparable[items.length];
		sort(items, 0, items.length - 1);
	}

	private static void sort(Comparable[] items, int low, int high)
	{
		if(high <= low)
			return;
		//Sort items[low..high]
		int middle = (low + high) / 2;
		sort(items, low, middle);					//Left half sort
		sort(items, middle + 1, high);				//Right half sort
		merge(items, low, middle, high);				//Middle merge
	}

	public static void merge(Comparable[] items, int low, int middle, int high)
	{
		//Merge a[lo..mid] with a[mid+1..hi].
		int i = low;
		int j = middle + 1;

		//Copy items[low..high] to auxiliary[low..high]
		for(int k = low; k <= high; k++)
			aux[k] = items[k];

		for(int k = low; k <= high; k++)
		{
			if (i > middle)					//Merge back right side
				items[k] = aux[j++];
			else if (j > high)				//Merge back left side
				items[k] = aux[i++];
			else if (less(aux[j], aux[i]))	//Check to see if right side is larger and swap	
				items[k] = aux[j++];
			else
				items[k] = aux[i++];	
		}

	}

	private static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w) < 0;
	}

	private static void exchange(Comparable[] items, int i, int j)
	{
		Comparable swapData = items[i];
		items[i] = items[j];
		items[j] = swapData;
	}

	public static void show(Comparable[] items)
	{
		for(int i = 0; i < items.length; i++)
			System.out.print(items[i] + " ");
		System.out.println();
	}

	public static boolean isSorted(Comparable[] items)
	{
		for(int i = 0; i < items.length; i++)
		{
			if(less(items[i], items[i-1]))
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