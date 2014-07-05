/*
Question
Cracking the Code Interview Chapter 3 Question 3.

Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
Therefore, in real life, we would likely start a new stack when the previous stack
exceeds some threshold. Implement a data structure SetOfStacks that mimics this. 
SetOf- Stacks should be composed of several stacks and should create a new stack 
once the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.pop()
should behave identically to a single stack (that is,pop() should return the same
values as it would if there werejust a single stack).
*/

/*
*/
import java.util.*;

public class SetOfStacks
{
	ArrayList<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();

	//Stack<Integer> stacks = new Stack<Integer>();
	private int capacity = 1;

	public SetOfStacks(int capacity)
	{
		if(capacity >= 1)
			this.capacity = capacity;
	}

	public void push(int value)
	{
		Stack<Integer> last = getLastStack();
		if(last !=null && !isFull(last))
		{
			last.push(value);
		} 
		else
		{
			Stack<Integer> newLastStack = new Stack();
			newLastStack.push(value);
			stacks.add(newLastStack);
		}
	}
	
	public Integer pop()
	{
		Stack<Integer> last = getLastStack();
		Integer value = last.pop();
		if(last.size() == 0)
			stacks.remove(stacks.size()-1);				//remove the last stack from the array

		return value;
	}

	private Stack getLastStack()
	{
		int numberOfStacks = stacks.size();
		if(numberOfStacks == 0)
			return null;
		else
			return stacks.get(numberOfStacks-1);
	}

	private boolean isFull(Stack stack)
	{
		return (stack.size() == capacity);
	}

	public static void main(String[] args)
	{
		StackWithMin stackMin = new StackWithMin();
		System.out.format("Stack with Min Test\n");
		System.out.format("Checking Stacks isEmpty %b\n",stackMin.isEmpty());
		System.out.format("Getting Min with empty stack %d\n",stackMin.min());
		System.out.println("Push 5");
		stackMin.push(5);
		System.out.format("Getting Min %d\n",stackMin.min());
		System.out.println("Push 5");
		stackMin.push(5);
		System.out.format("Getting Min %d\n",stackMin.min());
		System.out.println("Push 6");
		stackMin.push(6);
		System.out.format("Getting Min %d\n",stackMin.min());
		System.out.println("Push 3");
		stackMin.push(3);
		System.out.format("Getting Min %d\n",stackMin.min());
		System.out.println("Push 7");
		stackMin.push(7);
		System.out.format("Getting Min %d\n",stackMin.min());
		System.out.println("Push 3");
		stackMin.push(3);
		System.out.format("Getting Min %d\n",stackMin.min());		
		System.out.format("Popping off %d\n",stackMin.pop());			//Pops off 3
		System.out.format("Getting Min %d\n",stackMin.min());			//Should be 3
		System.out.format("Popping off %d\n",stackMin.pop());			//Pops off 7
		System.out.format("Getting Min %d\n",stackMin.min());			//Should be 3
		System.out.format("Popping off %d\n",stackMin.pop());			//Pops off 3
		System.out.format("Getting Min %d\n",stackMin.min());			//Should b 5
		System.out.format("Popping off %d\n",stackMin.pop());			//Pops off 6
		System.out.format("Getting Min %d\n",stackMin.min());			//Should b 5
		System.out.format("Popping off %d\n",stackMin.pop());			//Pops off 5
		System.out.format("Getting Min %d\n",stackMin.min());			//Should b 5
		System.out.format("Popping off %d\n",stackMin.pop());			//Pops off 5
		System.out.format("Getting Min %d\n",stackMin.min());			//Should be empty
		System.out.format("Checking Stacks isEmpty %b\n",stackMin.isEmpty());
	}
}




