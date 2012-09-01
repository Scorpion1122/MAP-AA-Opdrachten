package nl.map.aa.opdracht1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class PartitionCommandLine {

	private static final String STOP = "stop";
	private StringPartitioner partitioner;

	public PartitionCommandLine() {
		partitioner = new StringPartitioner();
		run();
	}

	public PartitionCommandLine(StringPartitioner partitioner) {
		this.partitioner = partitioner;
		run();
	}

	private void run() {
		while (true) {
			printLine("Enter a number: (type 'stop' to exit)");
			String input = getInput();

			if (isStopCommand(input)) {
				printLine("Stopping.");
				break;
			}

			Integer inputNumber = Integer.parseInt(input);

			if (inputNumber > 0 && inputNumber < 200) {
				partitioner.start(inputNumber);
				printPartitionStrings(partitioner.getPartitionStrings(),
						inputNumber);
			}
			else 
			{
				printLine("Please use a reasonable number.");
			}
		}
	}

	private boolean isStopCommand(String input) {
		return input.equalsIgnoreCase(STOP);
	}

	private String getInput() {

		String input = "";
		BufferedReader inputBuffer = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			input = inputBuffer.readLine();
		} catch (IOException e) {
			// TODO: hackerdehax
			e.printStackTrace();
		}

		return input;
	}

	public void printLine(String line) {
		System.out.println(line);
	}

	public void printPartitionStrings(List<String> partitionStrings, int number) {
		printLine("Partitions for the number " + number + ":");

		for (String s : partitionStrings) {
			printLine("*" + s);
		}
	}
}
