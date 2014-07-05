/*
Source:
Cracking the code interview Chapter 2 Question 3

Question:
Implement an algorithm to delete a node in the middle of a singly linked,
given only access to that node

EXAMPLE:
Input: the node c from the linked list a->b->c->d->e
Result: nothing is returned but the new linked list looks like a->b->d->e


Solution:
Only have access to the next node. Duplicate next node then remove its link
*/

import java.util.*;

class LinkedListNode
{
	int data;
	LinkedListNode next;
}

public class LinkedListDeleteMiddleNode 
{
	public static boolean deleteNode(LinkedListNode node)
	{
		//Error checking
		if(node == null || node.next == null) 
			return false;

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