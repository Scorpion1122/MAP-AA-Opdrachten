package nl.map.aa.opdracht1;

import java.util.ArrayList;
import java.util.List;

public class StringPartitioner
{
	private List<String>	partitionStrings;

	private int				number	= 0;

	public StringPartitioner()
	{
		partitionStrings = new ArrayList<String>();
	}

	public StringPartitioner(final int numberToPartition)
	{
		this();
		start(numberToPartition);
	}

	public void start(final int numberToPartition)
	{
		number = numberToPartition;
		partition(numberToPartition, numberToPartition, "");
	}

	private void partition(int numberToPartition, int max,
			String partitionString)
	{
		if (numberToPartition == 0)
		{
			partitionStrings.add(partitionString);
			return;
		}

		for (int i = Math.min(max, numberToPartition); i >= 1; i--)
		{
			partition(numberToPartition - i, i, partitionString + " " + i);
		}
		/**
		 * voor elk getal(i) in N:
		 * 		tel eerste twee op
		 * 		if resultaat gelijk aan i
		 * 			ga naar volgende positie in partitie
		 * 
		 * */
	}

	public final List<String> getPartitionStrings()
	{
		return partitionStrings;
	}

	public void printPartitionStrings()
	{
		System.out.println("Partitions for the number " + number + ":");

		for (String s : partitionStrings)
		{
			System.out.println("*" + s);
		}
	}
}
