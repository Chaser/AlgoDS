
public class StringLength {
 
	private static int StrLen(String str)
	{
		if(str == null)
			return 0;
		else if (str.isEmpty())
			return 0;
		else 
			return 1 + StrLen(str.substring(1));

	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}