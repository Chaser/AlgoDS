/* 
Source:
Cracking the code interview Chapter 1 Question 8.
Question)
Assume you have a method isSubstring which checks if one word is a substring of
another.
Given two strings,s1 and s2, write code to check If s2 is a rotation of s1 using
only one call to isSubstring (e.g.,"waterbottle" is a rotation of "erbottlewat").
Solution)


If we imagine that s2 is a rotation of s1, then we can ask what the rotation 
point is. 
For example,if you rotate waterbottle after wat, you get erbottlewat.
In a rotation,we cut s1 into two parts,x and y, and re arrange them to get s2.

si = xy = waterbottle
x = wat
y = erbottle
s2 = yx = erbottlewat

So, we need to check if there's a way to split s1 into x and y such that 
xy = s1 and yx = s2. Regardless of where the division between x and y is, 
we can see that yx will always be a substring of xyxy.
That is,s2 will always be a substring of s1s1.
*/

public class StringRotation {

	private static boolean isRotation(String str1, String str2)
	{
		int str1length = str1.length();
		if(str1length == str2.length() && str1length > 0)
		{
			String str1str1 = str1 + str1;
			return str1str1.contains(str2);
		}
		return false;
	}
 
	public static void main(String[] args) 
	{
		System.out.printf("Is 'erbottlewat' a rotated substring of 'waterbottle'? %b",isRotation("waterbottle", "erbottlewat"));
	}

		
}