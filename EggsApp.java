/*
*EggsApp.java
*N Varadi
*15 10 2020
*/
import java.util.Scanner;
public class EggsApp{
	public static void main(String args[]){

		//variables

		int eggsCollected;
		int numberOfBoxes;
		int eggsRemaining;

		//objects
		 Scanner keyboard = new Scanner(System.in);
		 Eggs myEggs = new Eggs();

		 //input, ask, store, send out data

		 System.out.println("Joe, please enter the number of eggs collected");
		 eggsCollected = keyboard.nextInt();
		 myEggs.setEggs(eggsCollected);

		//process

		myEggs.countBoxes();
		myEggs.countRemainingEggs();

		//output

		numberOfBoxes = myEggs.getNumberOfBoxes();
		eggsRemaining = myEggs.getRemainingEggs();

		System.out.println("Joe, you need " + numberOfBoxes + " box(es), " + "you have " + eggsRemaining + " egg(s) remaining.");

	}
}
