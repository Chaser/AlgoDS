/*
Source:
Cracking the code interview Chapter 2 Question 2

Question
Implement an algorithm to find the kth to last element of a singly linked list

Solution

*/

import java.util.*;

class LinkedListNode
{
	int data;
	LinkedListNode next;
}

public class LinkedListFindKthToLast 
{
	public static LinkedListNode kthToLast(LinkedListNode head, int k)
	{
		if(k <= 0) 
			return null;		//Check for valid search

		LinkedListNode pointerEnd = head;
		LinkedListNode pointerKth = head;

		//Move End pointer ahead kth times
		for(int i = 0; i < k - 1; i++)
		{
			if(pointerEnd == null) return null; 	//Check list is long enough
				pointerEnd = pointerEnd.next;
		}
		if(pointerEnd == null) return null; 	//Check list is long enough
		
		//Now move both pointers
		while(pointerEnd.next != null)
		{
			pointerEnd = pointerEnd.next;
			pointerKth = pointerKth.next;
		}
		return pointerKth;
	}


	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}