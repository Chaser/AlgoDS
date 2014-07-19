/*
Source
Cracking the Code Interview Chapter 1 Question 2.

Question
Implement a function void reverse(char* str) in C or C++ which reverses a null-terminated string.
*/

import java.util.*;

public class StringReverse {
 	public void reverse(String str)
 	{
		Stack<Character> reverseStack = new Stack<Character>();

		for(int i = 0; i < str.length(); i++)
			reverseStack.push(str.charAt(i)); 		

		while(!reverseStack.isEmpty())
			System.out.print(reverseStack.pop());

 	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}