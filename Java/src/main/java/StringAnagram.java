/*
Question
Cracking the Code Interview Chapter 1 Question 3.

Given two strings,write a method to decide if one is a permutation of the other.
*/

public class StringAnagram {

	private static boolean isAnagram(String str1, String str2)
	{
		if(str1.length() != str2.length())
			return false;

		int[] str1letters = new int[256];

		char[] strCharArray = str1.toCharArray();
		for(char c: strCharArray)
			str1letters[c]++;

		for(int i = 0; i < str2.length(); i++)
		{
			int check = (int)str2.charAt(i);
			if(--strCharArray[check] < 0)
				return false;
		}

		return true;
	}
 
	public static void main(String[] args) 
	{
		System.out.printf("Is 'Hello' and 'World'? %b",isAnagram("Hello", "World"));
		System.out.printf("Is 'dog' and 'god' ? %b",isAnagram("dog", "god"));
		System.out.printf("Is 'Debit card' and 'Bad credit' ? %b",isAnagram("Debit card", "Bad credit"));
	}
}