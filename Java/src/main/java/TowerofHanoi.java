/*
Source - Cracking the Code Interview Chapter 3 Question 4
Question
In the classic problme of Towers of Hano, you have 3 towers and N
disks of different sizes which can slide onto any tower. The puzzle
starts with disks sorted in ascending order of size form top to bottom
(i.e each disk sites on top of a larger one). You have the following 
constraints

(1) Only one disk can be moved at any time
(2) A disk is slid off the top of one tower onto the next tower
(3) A disk can only be placed on top of a larger disk
Write a program to move the disks from the first tower to the last using
stacks
*/

/*
Base Case and Build Approach
Let's start with the smallest possible example: n = 1.
Case n = 1.
Can we move Disk 1 from Tower 1 to Tower 3 ? Yes.
1. We simply move Disk 1 from Tower 1 to Tower 3.

Case n = 2.
Can we move Disk 1 and Disk 2 from Tower 1 to Tower 3? Yes.
1. Move Disk 1 from Tower 1 to Tower 2
2. Move Disk 2 from Tower 1 to Tower 3
3. Move Disk 1 from Tower 2 to Tower 3
Note how in the above steps, Tower 2 acts as a buffer, holding a disk while we move
other disks to Tower 3.

Case n = 3.
Can we move Disk 1, 2, and 3 from Tower 1 to Tower 3? Yes.
1. We know we can move the top two disks from one tower to another 
(as shown earlier), so let's assume we've already done that. But instead, let's
move them to Tower 2.
2. Move Disk 3 to Tower 3.
3. Move Disk 1 and Disk 2 to Tower 3. We already know how to do this—we just 
repeat what we did in Step 1.

Case n = 4.
Can we move Disk 1,2,3 and 4 from Tower 1 to Tower 3 ? Yes.
1. Move Disks 1,2,and 3 to Tower 2.
We know how to do that from the earlier examples. 
2. Move Disk 4 to Tower 3.
3. Move Disks 1,2 and 3 back to Tower 3.


This approach leads to a natural recursive algorithm. In each part, 
we are doing the followingsteps,outlinedbelowwith pseudocode:
*/



public class TowerOfHanoi {
	private Stack<Integer> disks;
	private int index;
	
	public TowerOfHanoi(int towerIndex) 
	{
		disks = new Stack<Integer>();
		index = towerIndex;
	}

	public int index()
	{
		return index;
	}

	public void add(int disk)
	{
		if(!disks.isEmpty() && disks.peek() <= d) 
			System.out.println("Error placing disk " + d);
		else
			disk.push(disk)
	}

	public void moveTopTo(TowerOfHanoi tower)
	{
		int top = disks.pop();
		tower.add(top);
		System.out.println("Move disk " + top + " from " + index + " to " + tower.index());
	}

	public void moveDisks(int n)


}

public static void main(String[] args) 
{
		int numberOfTowers = 3;
		TowerofHanoi[] towers = new TowerofHanoi[]
		System.out.println("Hello World!");
}


