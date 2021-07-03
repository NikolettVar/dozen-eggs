/*
*Eggs.java
*N Varadi
*15 10 2020
*/

public class Eggs{

	//data members
	private int eggsCollected;
	private final int DOZEN;
	private int numberOfBoxes;
	private int eggsRemaining;

	//constructor
		public Eggs(){
		eggsCollected = 0;
		DOZEN = 12;
		numberOfBoxes = 0;
		eggsRemaining = 0;
	}

	//input

	public void setEggs(int eggsCollected){
		this.eggsCollected = eggsCollected;
	}

	//process

	public void countBoxes(){
		numberOfBoxes = eggsCollected / DOZEN;
	}

	public void countRemainingEggs(){
		eggsRemaining = eggsCollected % DOZEN;
	}

	//output

	public int getNumberOfBoxes(){
		return numberOfBoxes;
	}

	public int getRemainingEggs(){
		return eggsRemaining;
	}

}