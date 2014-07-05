/*
Source:
Cracking the code interview Chapter 2 Question 1

Question:
Write code to remove duplications from an unsorted link list
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?

Solution:
Hashtable buffer that is based off unique entries
*/

import java.util.*;

class LinkedListNode
{
	int data;
	LinkedListNode next;
}

public class LinkedListDeleteDuplicates 
{
	public static void deleteDuplicates(LinkedListNode node)
	{
		// Create a hash map
      	Hashtable hashtable = new Hashtable();
      	LinkedListNode previous = null;
      	while(node != null)
      	{
      		//If data already exists, then this is a duplicate and we remove its link
      		if(hashtable.containsKey(node.data))
      			previous.next = node.next;
      		else
      		{
      			hashtable.put(node.data, true);
      			previous = node;
      		}

      		node = node.next;
      	}
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}