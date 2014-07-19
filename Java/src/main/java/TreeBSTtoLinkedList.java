/*
Source:
Cracking the code interview Chapter 4 Question 2.
Question)
Given a directed graph, design an algorithm to find out whether there is a 
route between two nodes.

Solution)
*/

class TreeNode {
	public int data;      
	public TreeNode left;    
	public TreeNode right; 
	
	public TreeNode(int d) {
		data = d;
	}

	private static TreeNode createMinimalBST(int array[], int start, int end)
	{
		//Finished setting up tree
		if(end < start)
			return null;
		int mid = (start + end) / 2;
		TreeNode n = new TreeNode(array[mid]);
		n.left =  createMinimalBST(array, start, mid - 1);
		n.right = createMinimalBST(array, mid + 1, end);
		return n;

	}

	public static TreeNode createMinimalBST(int array[]) 
	{
		return createMinimalBST(array, 0, array.length - 1);
	}
}


public class TreeBSTtoLinkedList {

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}