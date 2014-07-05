/*
Question
Describe how you could usea single array to implement three stack
*/

/*
Approach 1: Fixed Division
We can divide the array in three equal parts and allow the individual stack to grow in that limited space. Note: we will use the notation"[" to mean inclusive of an end point and"(" to mean exclusive of an end point.
• Forstack1,wewilluse[0, n/3).
• For stack2,wewill use[n/3j 2n/3).
• For stacks,wewill use[2n/3, n).
*/

class ThreeStacksSingleArrayA1 {
 	private int stackSize = 10;
 	private int[] buffer;
 	private int[] stackPointer = {-1,-1,-1};

 	public ThreeStacksSingleArrayA1(int size)
 	{
 		stackSize = size;
 		buffer = new int[size*3];
 	}

 	public void push(int stackNumber, int value) throws Exception 
 	{
 		//Check to see if space is available
 		if(stackPointer[stackNumber] + 1 >= stackSize)
 		{
 			throw new Exception("Out of space");
 		}
 		/*Increment stack pointer then update the value*/
 		stackPointer[stackNumber]++;
 		buffer[relativeTopOfStack(stackNumber)] = value;
 	}

 	public int pop(int stackNumber) throws Exception 
 	{
 		if(stackPointer[stackNumber] == -1)
 		{
 			throw new Exception("Trying to pop an empty stack");
 		}
 		int index = relativeTopOfStack(stackNumber);
 		int value = buffer[index];
 		buffer[index] = 0;
 		stackPointer[stackNumber]--;
 		return value;
 	}

 	public int peek(int stackNumber)
 	{
 		int index = relativeTopOfStack(stackNumber);
 		return buffer[index];
 	}
 	
 	public boolean isEmpty(int stackNumber)
 	{
 		return (stackPointer[stackNumber] == -1);
 	}

 	private int relativeTopOfStack(int stackNumber)
 	{
 		return stackNumber * stackSize + stackPointer[stackNumber];

 	}

}

public class ThreeStacksSingleArray {

	public static void main(String[] args) 
	{
		Rectangle rectangle = new Rectangle();
		ThreeStacksSingleArrayA1 threestacksinglearray = new ThreeStacksSingleArrayA1();
		ThreeStacksSingleArrayA1 threestacksinglearray = new ThreeStacksSingleArrayA1();
		
		//System.out.println("Is Stack 1 Empty %b, Stack 2 %b, Stack 3 %b",threestacksinglearray.IsEmpty(0),threestacksinglearray.IsEmpty(1),threestacksinglearray.IsEmpty(2));

	}
}
