/*
Source - Cracking the Code Interview Chapter 3 Question 5

Question:
Implement a MyQueue class which implementws a queue using two stacks.

Solution:
Stack is LIFO, Queue is FIFO.
Need to modify peek() and pop() to go in reverse order
Use second stack to reverse the order of elements by popping S1 and pushing
elements onto S2
*/
import java.util.*;

public class TwoStackQueue<T> 
{
 	Stack<T> stackNewest, stackOldest;

 	public TwoStackQueue()
 	{
 		stackNewest = new Stack<T>();
 		stackOldest = new Stack<T>();
 	}

 	public int size()
 	{
 		return stackNewest.size() + stackOldest.size();
 	}

 	public void add(T value)
 	{
 		//Push onto stackNewest, which always has the newest elements on top
 		stackNewest.push(value);
 	}

 	public T peek()
 	{
 		contentStackTransfer();
 		return stackOldest.peek();
 	}

 	public T pop()
 	{
 		contentStackTransfer();
 		return stackOldest.pop();
 	}

 	private void contentStackTransfer()
 	{
 		if(stackOldest.isEmpty())
 			while(!stackNewest.isEmpty())
 			{
 				stackOldest.push(stackNewest.pop());
 			}
 	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	
}

