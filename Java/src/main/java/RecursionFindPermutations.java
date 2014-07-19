/*
Question
Find all the permutations of a given string whose letters are unique.
*/


import java.util.ArrayList;
import java.util.List;

public class RecursionFindPermutations {

	private static void findAllPermutations(String str)
	{
		List charList = new ArrayList();
		char[] charArray = str.toCharArray();
		for (char c: charArray)
			charList.add(c);
	}
 
	public static void main(String[] args) 
	{
		findAllPermutations("abcde");
	}
}


