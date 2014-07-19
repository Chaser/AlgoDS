//NOTE -When compiling (javac) use -d ./ to specify root directory for package out
//Running (java) use full package name PackageName.HelloWorld

public class StringPalindrome {
 
	private static boolean isPalindrome(String str)
	{
		int strLength = str.length();
		for(int i = 0; i < strLength/2; i++)
		{
			if(str.charAt(i) != str.charAt(strLength-i))
				return false;
		}	
		return true;
	}

	public static void main(String[] args) 
	{
		System.out.printf("Is 'Hello World'? %b",isPalindrome("HelloWorld"));
		System.out.printf("Is 'maam'? %b",isPalindrome("maam"));
			
	}
}