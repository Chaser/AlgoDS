/*
Source:
Cracking the code interview Chapter 9 Question 5
Question)
Write a method to compute all permutations of a string

Solution)
Base Case: n = 1
The only permutation of S = a

Case:n = 2
ThepermutationsofS = a^.,arethestringsa1a2anda2ar
Case:r\ 3
Here is where the cases get more interesting. How can we generate all permutations of a ^ a j given the permutations of aaa2? That is, we need to generate
given
The difference between these lists is that the first one contains a3 while the second list does not. So, how canwe generate f (3) from f (2)? Bypushing a3 into every possible spot inthestringsinf (2).
Case:r\ 0
Forthegeneralcase,wejustrepeatthisprocess.Wesolveforf (n-1 ),andthenpushan
into every spot in each of these strings.


*/
import java.util.ArrayList;
import java.util.List;

public class RecursionStringPermutation 
{
	public static ArrayList<String> getPerms(String str) {
		if (str == null) 
		{
			return null;
		}
		
		ArrayList<String> permutations = new ArrayList<String>();
		if (str.length() == 0) 
		{ // base case
			permutations.add("");
			return permutations;
		}

		char first = str.charAt(0); 					// get the first character
		String remainder = str.substring(1); 			// remove the first character
		ArrayList<String> words = getPerms(remainder);
		for (String word : words) 
		{
			for (int j = 0; j <= word.length(); j++) 
			{
				String s = insertCharAt(word, first, j);
				permutations.add(s);
			}
		}
		return permutations;
	}

	public static String insertCharAt(String word, char c, int i) {
		String start = word.substring(0, i);
		String end = word.substring(i);
		System.out.println("word=" + word + " start="+start+" c="+c+" end="+end);
		return start + c + end;
	}

	public static void main(String[] args) {
		ArrayList<String> list = getPerms("abc");
		System.out.println("There are " + list.size() + " permutations.");
		for (String s : list) {
			System.out.println(s);
		}
	}

}


