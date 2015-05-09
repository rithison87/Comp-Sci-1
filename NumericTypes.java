/**
   This program demonstrates how numeric types and operators behave in Java
   
   @author Rithi Son
   @version 02/17/2015
*/

import java.util.Scanner;   //TASK #2  Add import statement here to use the Scanner class
import javax.swing.JOptionPane;   //TASK #2  (Alternate) Add import statment to use JOptionPane class

public class NumericTypes
{
	public static void main (String [] args)
	{
		//TASK #2 Create a Scanner object here (not used for alternate)
      Scanner keyboard = new Scanner(System.in);
	
		//identifier declarations
		final int NUMBER = 2 ;		// number of scores
		final int SCORE1 = 100;		// first test score
		final int SCORE2 = 95;		// second test score
		final int BOILING_IN_F = 212;  // freezing temperature
		int fToC;						// temperature in celsius
		double average;				// arithmetic average
		String output;					// line of output to print out
		
      //TASK #2 declare variables used here
      String firstName;
      String lastName;
      String fullName; 
      
		//TASK #3 declare variables used here
      char firstInitial;
      
		//TASK #4 declare variables used here
      double diameter;
      double radius;
      double sphereVolume;

		// Find an arithmetic average
		average = (double)(SCORE1 + SCORE2) / NUMBER;
		output = SCORE1 + " and " + SCORE2 + " have an average of "
				+ average;
		System.out.println(output);

		// Convert Fahrenheit temperatures to Celsius
		fToC = (int)((5.0/9.0) * (BOILING_IN_F - 32));
		output = BOILING_IN_F + " in Fahrenheit is " + fToC
			     + " in Celsius.";
		System.out.println(output);
		System.out.println();		// to leave a blank line

		// ADD LINES FOR TASK #2 HERE
		System.out.println("Please enter your first name: ");   // prompt the user for first name
		firstName = keyboard.nextLine();  // read the user's first name

		System.out.println("Please enter your last name: ");// prompt the user for last name
		lastName = keyboard.nextLine();// read the user's last name

		fullName = firstName + " " + lastName; // concatenate the user's first and last names
		System.out.println("Your full name is: " + fullName);// print out the user's full name 
/**      
		// ADD LINES FOR TASK #2 (ALTERNATE) HERE
		firstName = JOptionPane.showInputDialog("First Name");  // read the user's first name

		lastName = JOptionPane.showInputDialog("Last Name");// read the user's last name

		fullName = firstName + " " + lastName; // concatenate the user's first and last names
		JOptionPane.showMessageDialog(null, fullName);// print out the user's full name 
*/
		System.out.println();		// to leave a blank line
		
		// ADD LINES FOR TASK #3 HERE
		firstInitial = firstName.charAt(0);   // get the first character from the user's first name
		System.out.println(firstInitial);   // print out the user's first initial
		fullName = fullName.toUpperCase();   // convert the user's full name to all capital letters
		System.out.println(fullName + " has " + fullName.length() + " characters (including spaces).");// print out the user's full name in all capital letters

		System.out.println();		// to leave a blank line
		
		// ADD LINES FOR TASK #4 HERE
		System.out.println("Please enter diameter of sphere: ");   // prompt the user for a diameter of a sphere
		diameter = keyboard.nextDouble();   // read the diameter
		radius = diameter * 2;  // calculate the radius
		
      sphereVolume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);   // calculate the volume 
		System.out.println(sphereVolume);   // print out the volume
	}	
}