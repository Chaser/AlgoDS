/*
How would you design a stack which, in addition to push and pop, 
also has a function min which returns the minimum element? 
Push, pop and min should all operate in 0(1) time.
*/

/*
Approach 1: Fixed Division
We can divide the array in three equal parts and allow the individual stack to grow in that limited space. Note: we will use the notation"[" to mean inclusive of an end point and"(" to mean exclusive of an end point.
• Forstack1,we willuse[0, n/3).
• For stack2,we will use[n/3j 2n/3).
• For stacks,we will use[2n/3, n).
*/
import java.util.*;


public class StackWithMin extends Stack<Integer>
{
	Stack<Integer> stackMinMonitor;
	public StackWithMin()
	{
		stackMinMonitor = new Stack<Integer>();

	}

	public void push(int value)
	{
		if(value <= min())
			stackMinMonitor.push(value);

		super.push(value);
	}

	public Integer pop()
	{
		Integer value = super.pop();
		if(value == min())
			stackMinMonitor.pop();

		return value;
	}

	public Integer min()
	{
		if(stackMinMonitor.isEmpty())
			return Integer.MAX_VALUE;
		else
			return stackMinMonitor.peek();
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




