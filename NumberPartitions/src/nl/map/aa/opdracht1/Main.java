package nl.map.aa.opdracht1;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringPartitioner p = new StringPartitioner();
		p.start(5);
		p.printPartitionStrings();
	}
}
