/*
Source:
Cracking the code interview Chapter 2 Question 5

Question:
You have two numbers presented by a linked list, where each node contains
a single digit. The digits are stored in reverse order such that 1s
digit is at the head of the list. Write a function that adds the two
numbers and returns the sum as a linked list

EXAMPLE
Input: (7 -> 1 -> 6) + (5 -> 9 -> 2). That is 617 + 295.
Output: (2 -> 1 -> 9). That is 912

FOLLOW UP
Suppose the digits are stored in the forware order. Repeate the above
problem

Input: (6 -> 1 -> 7) + (2 -> 9 -> 5). That is 617 + 295.
Output: (9 -> 1 -> 2). That is 912.

*/

import java.util.*;

class LinkedListNode
{
	int data;
	LinkedListNode next;
}

public class LinkedListTwoNumbersAdd
{
	public static LinkedListNode addLists(LinkedListNode listOne, LinkedListNode listTwo, int carry)
	{
		//Error checking
		if(listOne == null && listTwo == null && carry == 0) 
			return null;

		LinkedListNode nextnode = node.next;
		node.data = nextnode.data;
		node.next = nextnode.next;
		return true;
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}