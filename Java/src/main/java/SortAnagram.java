/*
Source:
Cracking the code interview Chapter 11 Question 2
Question)
Write a method to sort an array of strings so that all the anagrams are next to each
other.

Solution)

*/
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;

public class SortAnagram {
 	public static String sortChars(String s) 
 	{
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	public static void sort(String[] array) {
		Hashtable<String, LinkedList<String>> hash = new Hashtable<String, LinkedList<String>>();
		/* Group words by anagram */
		for (String s : array) {
			String key = sortChars(s); 
			if (!hash.containsKey(key)) {
				hash.put(key, new LinkedList<String>());
			}
			LinkedList<String> anagrams = hash.get(key);
			anagrams.push(s);
		}

		/* Convert hash table to array */
		int index = 0;
		for (String key : hash.keySet()) {
			LinkedList<String> list = hash.get(key);
			for (String t : list) {
				array[index] = t;
				index++;
			}
		}
	}

	public static void main(String[] args) {
		String[] array = {"apple", "banana", "carrot", "ele", "duck", "papel", "tarroc", "cudk", "eel", "lee"};
		sort(array);
		for (String str : array)
		{
			System.out.print(str + ",");
		}
	}
}