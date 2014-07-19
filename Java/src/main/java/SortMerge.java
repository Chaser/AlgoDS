/*
Source:
Cracking the code interview Chapter 11 Question 1
Question)
You are given two sorted arrays, A and B, where A has a large enough buffer at
the end to hold B. Write a method to merge B into A in sorted order.

Solution)

*/
public class SortMerge {
 	public static void merge(int[] a, int[] b, int lastA, int lastB)
 	{
 		int indexA = lastA - 1; 	//Index of last element in array a
		int indexB = lastB - 1; 		//Index of last element in array b
		int indexMerged = lastB + lastA - 1; 

		//Merge a and b, starting from the lastest element each
		while(indexA >= 0 && indexB >= 0)
		{
			//end of a is > than end of b
			if(a[indexA] > b[indexB]) 
			{
				a[indexMerged--] = a[indexA--];
			}
			else
			{
				a[indexMerged--] = b[indexB--];
			}
		}

		//Copy remaining elements from b into place
		while(indexB >= 0) {
			a[indexMerged--] = b[indexB--];
		}
 	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}