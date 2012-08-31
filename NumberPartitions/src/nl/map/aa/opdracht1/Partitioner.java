package nl.map.aa.opdracht1;


public class Partitioner
{
	public Partitioner()
	{
		
	}

	public void start(final int numberToPartition)
	{
		partition(numberToPartition, numberToPartition, "");
	}

	private void partition(int numberToPartition, int max, String prefix)
	{
		if (numberToPartition == 0)
		{
			System.out.println(prefix);
			return;
		}

		for (int i = Math.min(max, numberToPartition); i >= 1; i--)
		{
			partition(numberToPartition - i, i, prefix + " " + i);
		}
	}
}
