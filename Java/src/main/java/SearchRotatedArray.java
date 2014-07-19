/*
Cracking the code interview Chapter 11 Question 3
Question)
Given a sorted array of n integers that has been rotated an unknown number of 
times, write code to find an element in the array. You may assume that the array
was originally sorted in increasing order.

Solution)
SearchRotatedArray.java
*/

public class SearchRotatedArray {
 	public static int search(int[] arry, int left, int right, int desired)
 	{
 		int mid = (left + right) / 2;
 		if(desired == mid)
 			return mid;

 		if(right < left)
 		{
 			return -1;
 		}

 		/*Either the left or right half must be normally ordered
 			-Find out which side is normally ordered
			-Use normally ordered half to figure out which side desired 
			is on
		*/
		//Left side is is normally ordered
		if(arry[left] < arry[mid])
		{
			if(desired >= arry[left] && desired <= arry[mid])
				return search(arry, left, mid - 1, desired);
			else
				return search(arry, mid + 1, right, desired);

		}
		//Right half is normmaly ordered
		else if (arry[mid] < arry[left])
		{
			if(desired >= arry[mid] && desired <= arry[right])
				return search(arry, mid + 1, right, desired);
			else
				return search(arry, mid - 1, left, desired);
		}
		//Left half is all repeats until middle
		else if (arry[left] == arry [mid])
		{
			//if right half is different to middle search
			if(arry[mid] != arry[right])
				return search(arry, mid + 1, right, desired);
			//If right half all repeats then search both sides
			else
			{
				int result = search(arry, left, mid - 1, desired);
				if(result >= 0)
					return result;
				else
					return search(arry, mid + 1, right, desired);
			}
		}
		return -1;
 	}

 	public static void main(String[] args) {
		int[] a = { 2, 3, 2, 2, 2, 2, 2, 2 , 2 , 2 };

		System.out.println(search(a, 0, a.length - 1, 2));
		System.out.println(search(a, 0, a.length - 1, 3));
		System.out.println(search(a, 0, a.length - 1, 4));
		System.out.println(search(a, 0, a.length - 1, 1));
		System.out.println(search(a, 0, a.length - 1, 8));
	}
}