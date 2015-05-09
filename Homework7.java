import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class Homework7 {
   public static void main (String[] args) throws IOException, ArrayIndexOutOfBoundsException {
      
      // Declaration of variables
		boolean done;
		boolean found;
		Scanner scnr;
		String task; // task input by the user
		String name; // array to store girl names
      String name_boys; // array to store boy names
		ArrayList<String> list;
		ArrayList<String> listboys;
		File file; // GirlNames.txt
      File file_boys; // BoyNames.txt
		PrintWriter pw;
		Scanner sc; // scans girls
      Scanner sc_boys; // scans boys
		int index; // used to find name
      int fileSelection; // use to work with girl or boy names file; entered by user
		
		// Initialization of variables
		scnr = new Scanner (System.in);
		list = new ArrayList<String>();
      listboys = new ArrayList<String>();
		file = new File("GirlNames.txt");
		file_boys = new File("BoyNames.txt");
      
      // Read files for boys and girls names
		// This first section reads the girl names from GirlNames.txt
      sc = new Scanner (file);
		list.clear();
					
		while (sc.hasNext() )
		{
		   name = sc.nextLine();
		   list.add(name);
		}
					
		sc.close();
      
      // This section reads the girls names from the BoyNames.txt
      sc_boys = new Scanner (file_boys);
		listboys.clear();
					
		while (sc_boys.hasNext() )
		{
		   name_boys = sc_boys.nextLine();
		   listboys.add(name_boys);
		}
					
		sc_boys.close();
      
      System.out.println("Enter 1 for Girl names. Enter 2 to use Boy names. Please choose: ");
      fileSelection = scnr.nextInt();
      
      if (fileSelection == 1) {
   		
   		// While loop
   		done = false;
   		task = "";
   		while (!done)
   		{
   		   System.out.println("Please select a task:\n");
   		   System.out.println("A - Add a name to the list");
   		   System.out.println("X - Remove a name from the list");
   		   System.out.println("F - Find a name in the list");
   		   System.out.println("D - Display the list");
   		   System.out.println("S - Save the list to a file");
   //		   System.out.println("R - Read the data from a file");
   		   System.out.println("Q - Quit the program");
   
   			task = scnr.nextLine();
            
   			// Switch statement
   			switch (task)
   			{
   			   case "A":
   				   System.out.print("Enter a name:\n");
   					name = scnr.nextLine();
   					list.add(name);
   					System.out.println(name + " was added to the list\n");
   				   break;
   					
   			   case "X":
   				   System.out.println("Enter index number of name to remove from list: \n");
   					index = scnr.nextInt();
   					scnr.nextLine();
   					
   					if (index < 1 || index > list.size() )
   					{
   					   System.out.println("Error: index is out of range.\n");
   					} else {
   					   name = list.get(index - 1);
   						System.out.println(name + " was removed from the list");
   						list.remove(index - 1);
   					}
   					
   				   break;
   					
   			   case "F":
   				   System.out.print("Enter a name to find: \n");
   					name = scnr.nextLine();
   					found = false;
   					index = 0;
   					
   					for (int i = 0; i < list.size() && !found; i++)
   					{
   					   if ( list.get(i).equals (name) )
   						{
   						   found = true;
   							index = i + 1;
   						}
   					}
   					
   					if (index != 0)
   					{
   					   System.out.println(name + " is in the list at location " + index + ".\n");
   					} else {
   					   System.out.println(name + " is not in the list.\n");
   					}
   										
   				   break;
   					
   			   case "D":
   				   System.out.println("List of names:\n");
   					System.out.println("No.  Name");
   					System.out.println("===============");
   					
   					for (int i = 0; i < list.size(); i++)
   					{
   					   System.out.println( (i + 1) + "  " + list.get(i) );
   					}
   					
   					System.out.println("===============");
   				   break;
   					
   			   case "S":
   				   System.out.println("Saving the list...\n");
   					pw = new PrintWriter(file);
   					
   					for (int i = 0; i < list.size(); i++)
   					{
   					   pw.println( list.get(i) );
   					}					
   					
   					pw.flush();
   					pw.close();
   					System.out.println("List saved.\n");
   				   break;
   					
   			   case "Q":
   				   done = true;
   				   break;
   			}
   		}
      } // closing if statement for girls(1)
      else if (fileSelection == 2) {
            		// While loop
   		done = false;
   		task = "";
   		while (!done)
   		{
   		   System.out.println("Please select a task:\n");
   		   System.out.println("A - Add a name to the list");
   		   System.out.println("X - Remove a name from the list");
   		   System.out.println("F - Find a name in the list");
   		   System.out.println("D - Display the list");
   		   System.out.println("S - Save the list to a file");
   //		   System.out.println("R - Read the data from a file");
   		   System.out.println("Q - Quit the program");
   
   			task = scnr.nextLine();
            
   			// Switch statement
   			switch (task)
   			{
   			   case "A":
   				   System.out.print("Enter a name:\n");
   					name_boys = scnr.nextLine();
   					listboys.add(name_boys);
   					System.out.println(name_boys + " was added to the list\n");
   				   break;
   					
   			   case "X":
   				   System.out.println("Enter index number of name to remove from list: \n");
   					index = scnr.nextInt();
   					scnr.nextLine();
   					
   					if (index < 1 || index > listboys.size() )
   					{
   					   System.out.println("Error: index is out of range.\n");
   					} else {
   					   name_boys = listboys.get(index - 1);
   						System.out.println(name_boys + " was removed from the list");
   						listboys.remove(index - 1);
   					}
   					
   				   break;
   					
   			   case "F":
   				   System.out.print("Enter a name to find: \n");
   					name_boys = scnr.nextLine();
   					found = false;
   					index = 0;
   					
   					for (int i = 0; i < listboys.size() && !found; i++)
   					{
   					   if ( listboys.get(i).equals (name_boys) )
   						{
   						   found = true;
   							index = i + 1;
   						}
   					}
   					
   					if (index != 0)
   					{
   					   System.out.println(name_boys + " is in the list at location " + index + ".\n");
   					} else {
   					   System.out.println(name_boys + " is not in the list.\n");
   					}
   										
   				   break;
   					
   			   case "D":
   				   System.out.println("List of names:\n");
   					System.out.println("No.  Name");
   					System.out.println("===============");
   					
   					for (int i = 0; i < listboys.size(); i++)
   					{
   					   System.out.println( (i + 1) + "  " + listboys.get(i) );
   					}
   					
   					System.out.println("===============");
   				   break;
   					
   			   case "S":
   				   System.out.println("Saving the list...\n");
   					pw = new PrintWriter(file_boys);
   					
   					for (int i = 0; i < listboys.size(); i++)
   					{
   					   pw.println( listboys.get(i) );
   					}					
   					
   					pw.flush();
   					pw.close();
   					System.out.println("List saved.\n");
   				   break;
   					
   			   case "Q":
   				   done = true;
   				   break;
   			}
   		}
      } // closing if statement for boys(1)

   }
}

/**					
			   case "R":
				   sc = new Scanner (file);
					list.clear();
					
					while (sc.hasNext() )
					{
					   name = sc.nextLine();
						list.add(name);
					}
					
					sc.close();
				   System.out.println("Reading a file\n");
				   break;
*/