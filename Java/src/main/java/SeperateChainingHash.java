

import java.util.*;

public class SeperateChainingHash<Key, Value>
{
	private Hashtable<Key,Value> hashtable;

	public SeperateChainingHash()
	{
		this(997);
	}

	public SeperateChainingHash(int M)
	{
		hashtable = new Hashtable<Key, Value>(M);
	}

	public int size()
	{
		return hashtable.size();
	}

	public static void main(String[] args)
	{
		SeperateChainingHash<String, Integer> hash = new SeperateChainingHash<String, Integer>(5);

	}
}