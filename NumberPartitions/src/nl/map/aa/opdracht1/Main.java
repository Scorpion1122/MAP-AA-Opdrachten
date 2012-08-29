package nl.map.aa.opdracht1;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 5;
		
		System.out.println(number);
		
		for (int partIndex = 1; partIndex <= number; partIndex++) {
			String result = ":"+partIndex;
			
			int partition = Math.min(partIndex, number - partIndex);
			int counter = partition + partIndex;
			
			result += "+" + partition;
			while(counter < number)
			{
				if(partition > 1)
					partition--;
				counter += partition;
				result += "+" + partition;
			}
			System.out.println(result);
		}
	}
}
