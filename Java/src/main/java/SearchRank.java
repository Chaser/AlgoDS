/*
Cracking the code interview Chapter 11 Question 8
Question)
Imagine you are reading in a stream of integers. Periodically, you wish to be able to look up the rank of a number x (the number of values less than or equal to x). 
Implement the data structures and algorithms to support these operations. 
That is,implement the method track(int x), which is called when each number is generated, and the method getRankOfNumber (int x), which returns the number of values less than or equal to x (not including x itself).

*/

class RankNode
{
	public RankNode left;
	public RankNode right;
	public int data;
	public int left_size = 0;

	public RankNode(int data)
	{
		this.data = data;
	}

	public void insert(int data) 
	{
		//Check for insert point
		if(data <= this.data)
		{
			//Check to see if a node already exists in left node
			if(left != null)
				left.insert(data);
			else
			{
				left = new RankNode(data);
			}
			left_size++;
		}
		else
		{
			if(right != null)
				right.insert(data);
			else
				right = new RankNode(data);
		}
	}

	public int getRank(int data)
	{
		if(data == this.data)
			return left_size;
		else if (data < this.data)
		{	
			if(left == null)
				return -1;
			else
				return left.getRank(data);
		}
		else
		{
			int right_rank;
			if(right == null)
				right_rank = -1;
			else 
				right_rank = right.getRank(data);

			if(right_rank == -1)
				return -1;
			else
				return left_size + 1 + right_rank;

		}	
	}

}

public class SearchRank 
{

}