package nl.map.aa.opdracht1;

import java.util.ArrayList;
import java.util.List;

public class Partitioner
{
	private List<String> partitionStrings;

	public Partitioner()
	{
		partitionStrings = new ArrayList<String>();
	}
	
	public void start(final int numberToPartition)
	{
		partitionStrings.addAll(getPartitionStrings(numberToPartition));
		printPartitions(numberToPartition);
	}

	private void printPartitions(int numberToPartition)
	{
		System.out.println("Partitions for the number " + numberToPartition + ":");
		
		for (String s : partitionStrings)
		{
			System.out.println(s);
		}
	}

	/**
	 * for every possible partition: return a printable string with the numbers
	 * in the partition.
	 * 
	 * @param numberToPartition
	 * @return
	 */
	private List<String> getPartitionStrings(final int numberToPartition)
	{
		//TODO: alles!
		return null;
	}

}
