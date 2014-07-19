/*
Question
Cracking the Code Interview Chapter 1 Question 4.

Write a method to replace all spaces in a string with '%20'. 
You may assume that the string has sufficient space at the end of the string to 
hold the additional characters, and that you are given the "true" length of the 
string. (Note: if implementing in Java, please usea character array so that you 
can perform this operation in place.)*/

public class StringCharChanger {

	private static void replaceChar(char[] str, int length)
	{
		
		int spaceCount = 0;
		int newLength = 0;
		int i;

		for (i = 0; i < length; i++) 
		{		
			if(str[i]==' ')
				spaceCount++;
		}
		newLength = length + spaceCount * 2; 
		str[newLength] = '\0';
		for(i = length - 1; i >= 0; i--)
		{ 
				if(str[i]==' ')
				{
					str[newLength-1]='%';
					str[newLength-2]='2';
					str[newLength-3]='0';
					newLength= newLength - 3;	
				}
				else
				{
					str[newLength - 1] = str[i]; 
					newLength = newLength - 1;
				}
		}

	}
 
	public static void main(String[] args) 
	{
		//System.out.printf("Is 'Hello' and 'World'? %b",isAnagram("Hello", "World"));
		//System.out.printf("Is 'dog' and 'god' ? %b",isAnagram("dog", "god"));
		//System.out.printf("Is 'Debit card' and 'Bad credit' ? %b",isAnagram("Debit card", "Bad credit"));
	}
}