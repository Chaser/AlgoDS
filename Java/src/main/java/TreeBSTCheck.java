/*
Source:
Cracking the code interview Chapter 4 Question 4.
Question)
Given a binary tree, design an algorithm which creates a linked list of all the nodes at
each depth (e.g., if you have a tree with depth D, you'll have D linked lists).

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


public class TreeBSTCheck {
	public boolean checkBST(TreeNode node)
	{
		return checkBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean checkBST(TreeNode node, int min, int max) 
	{
		//If current node is null still a valid BST
		if(node == null)
			return true;

		//Check that current does not exceed min or max
		if(node.data <= min || node.data > max)
			return false;

		if(!checkBST(node.left, min, node.data) ||
			!checkBST(node.right, node.data, max))
			return false;

		return true;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}