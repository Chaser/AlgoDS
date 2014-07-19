//Selection Sort


import java.util.*;

public class Selection
{
	public static void sort(Comparable[] items)
	{
		int N = items.length;
		for(int i = 0; i < N; i++)
		{
			//Exchange items[i] with smallest entry in a[i+1..N]
			int min = i;
			for (int j = i + 1; j < N; j++)
			{
				if(less(items[j], items[min]))
					min = j;
			}
			exchange(items,i, min);
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
		for(int i = 1; i < items.length; i++)
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