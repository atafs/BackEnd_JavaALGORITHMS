package data;

public class ArrayStructure {
	
	//ATTRIBUTES
	private int[] theArray = new int[50];
	private int arraySize = 10;
	
	//CONSTRUCTOR
	public ArrayStructure() {}
	
	/** Procedure: generate random array */
	public void generateRandomArray() {
		//LOOP
		for (int i = 0; i < arraySize; i++) {
			theArray[i] = (int)(Math.random()*10)+10;
		}
	}
	
	/** Procedure: print the array */
	public void printArray() {
		System.err.println("-----------");
		for (int i = 0; i < arraySize; i++) {
			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " |");
		}
	}
}
