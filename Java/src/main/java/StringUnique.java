/*
Question
Cracking the Code Interview Chapter 1 Question 1.

Implement an algorithm to determine if a string has all unique characters. 
What if you cannot use additional data structures?
*/

import java.util.*;

public class StringUnique {
 	public boolean isUniqueChars(String str)
 	{
 		Hashtable hashtable = new Hashtable();
 		if(str.length() > 256)
 			return false;

 		char c;
 		for (int i = 0; i < str.length(); i++)
 		{
 			 c = str.charAt(i);
 			 if(hashtable.containsKey(c))
 			 	return false;
 			 else
 			  	hashtable.put(c,true);
 		}
 		return true;

 	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}