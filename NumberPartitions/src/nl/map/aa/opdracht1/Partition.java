package nl.map.aa.opdracht1;

import java.util.ArrayList;
import java.util.List;

public class Partition
{
	private List<Integer>	numbers;

	public Partition()
	{
		numbers = new ArrayList<Integer>();
	}

	public final List<Integer> getNummers()
	{
		return numbers;
	}

	public void add(int numberToAdd)
	{
		numbers.add(numberToAdd);
	}

	public void addAll(List<Integer> numbersToAdd)
	{
		numbers.addAll(numbersToAdd);
	}
	
	@Override
	public String toString()
	{
		return numbers.toString();
	}
}
