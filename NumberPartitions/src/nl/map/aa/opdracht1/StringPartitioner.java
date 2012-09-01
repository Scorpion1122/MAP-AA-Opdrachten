package nl.map.aa.opdracht1;

import java.util.ArrayList;
import java.util.List;

public class StringPartitioner {
	private List<String> partitionStrings;

//	private List<Partition> partitions;

	private int number = 0;

	public StringPartitioner() {
		partitionStrings = new ArrayList<String>();
//		partitions = new ArrayList<Partition>();
	}

	public StringPartitioner(final int numberToPartition) {
		this();
		start(numberToPartition);
	}

	public void start(final int numberToPartition) {
		number = numberToPartition;
		partition(numberToPartition, numberToPartition, "");
	}

	private void partition(int numberToPartition, int max,
			String partitionString) {
		if (numberToPartition == 0) {
			partitionStrings.add(partitionString);
			return;
		}

		Partition p = new Partition();

		for (int i = Math.min(max, numberToPartition); i >= 1; i--) {
			partition(numberToPartition - i, i, partitionString + " " + i);
			p.add(i);
		}

//		partitions.add(p);

		/**
		 * voor elk getal(i) in N: tel eerste twee op if resultaat gelijk aan i
		 * ga naar volgende positie in partitie
		 * 
		 * */
	}

	public final List<String> getPartitionStrings() {
		return partitionStrings;
	}

//	public final List<Partition> getPartitions() {
//		return partitions;
//	}
}
