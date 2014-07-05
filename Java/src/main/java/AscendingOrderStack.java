/*
Source:
Cracking the Code Interview Chapter 3 Question 6

Question:
Write a program to sort a stack in ascending order (with biggest items on top)
You may use at most one addition stack to hold items, buy you may not copy
the elements into any other data structure (such as an array)
The stack supports the following oerations: push, pop, peek, and isEmpty
*/

import java.util.*;

public class AscendingOrderStack 
{
	public Stack<Integer> sort(Stack<Integer> newStack)
	{
		Stack<Integer> sortedStack = new Stack<Integer>();
		while(!newStack.isEmpty())
		{
			int temp = newStack.pop();
			while(!sortedStack.isEmpty() && sortedStack.peek() > temp)
			{
				newStack.push(sortedStack.pop());
			}
			sortedStack.push(temp);
		}
		return sortedStack;
	} 

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}