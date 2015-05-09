/**
   This program will take user input to calculate mileage per gallon.
   
   @author Rithi Son
   @duedate 02/17/2015

*/

import java.util.Scanner;

public class Mileage
{
   public static void main (String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      // Variables used in program
      double milesDriven = 0.0; // number of miles driven
      double gasUsed     = 0.0; // gallons of gas used
      double mpg         = 0.0; // miles per gallon
      
      // Introduction message to user
      System.out.println("This program will calculate mileage.");
      
      // User will input miles driven
      System.out.println("Please enter number of miles driven.");
      milesDriven = keyboard.nextDouble();
      
      // User will input gallons of gas used
      System.out.println("Please enter gallons of gas used.");
      gasUsed = keyboard.nextDouble();
      
      // Miles per gallon is calculated and printed for user review to drive more efficiently
      mpg = milesDriven / gasUsed;
      System.out.println("Your MPG is: " + mpg + ".");
      
   }
}