import java.text.DecimalFormat;	//for number formatting
import java.util.Scanner;		//for keyboard input
import java.io.*; //ADD AN IMPORT STATEMENT HERE  //for using files

public class StatsDemo
{
	public static void main(String [] args) throws IOException//ADD A THROWS CLAUSE HERE
	{
		double sum = 0;		//the sum of the numbers
		int count = 0;		   //the number of numbers added
		double mean = 0;  	//the average of the numbers
		double stdDev = 0;	//the standard deviation of the numbers
		String line;		   //a line from the file
		double difference;	//difference between the value and the mean

		//create an object of type Decimal Format
		DecimalFormat threeDecimals = new DecimalFormat("0.000");
		//create an object of type Scanner
		Scanner keyboard = new Scanner (System.in);
		String filename;	// the user input file name

		//Prompt the user and read in the file name
		System.out.println("This program calculates statistics"
			+ "on a file containing a series of numbers");
		System.out.print("Enter the file name:  ");
		filename = keyboard.nextLine();

		//ADD LINES FOR TASK #2 HERE
      //Create a File object passing it the variable filename
      File ip = new File(filename);
            
		//Create a Scanner object passing it the File object
		Scanner ipFile = new Scanner(ip);
				
		//create a loop that continues until you are at the end of the file
		while (ipFile.hasNextDouble() ) {	
         //Following activities are done inside the loop
         //read the next number and add the value to the sum
			double ipDouble = ipFile.nextDouble();
         sum = sum + ipDouble;
			//increment the counter
			count++;
		}	
		//Following activities are done after the end of the loop
		//close the input file
      ipFile.close();
      
		//Calculate the mean
      mean = sum / count;

		//ADD LINES FOR TASK #3 HERE
		//reconnect to the Scanner object passing it the File object
      Scanner ip_stdDev = new Scanner (ip);
		
		//reinitialize the sum  0
      sum = 0;
		//reinitialize the counter to 0
		count = 0;		
		
		//loop that continues until you are at the end of the file
      while (ip_stdDev.hasNextDouble() ) {
         //Following activities are done inside the loop
			//read the number and subtract the mean
         double ipDouble = ip_stdDev.nextDouble();
			difference = ipDouble - mean;
			//add the square of the difference to the sum
			sum = sum + Math.pow(difference, 2);
			//increment the counter
         count ++;
		}	
		//Following activities are done after the end of the loop
		//close the input file
      ipFile.close();
		//store the calculated standard deviation
      stdDev = Math.sqrt(sum / count);

		//ADD LINES FOR TASK #1 HERE
		//create an object of type FileWriter using "Results.txt" as file name.
      FileWriter fw = new FileWriter ("Results.txt");
      
      //create an object of PrintWriter passing it the FileWriter object.
      PrintWriter pw = new PrintWriter (fw);
      
		//print the results to the output file
      pw.println("Mean: " + threeDecimals.format(mean) );
      pw.println("Standard Deviation: " + threeDecimals.format(stdDev) );
      
		//close the output file
      pw.flush();
      pw.close();
	}
}