import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import com.sun.org.apache.xpath.internal.operations.Number;

public class GenerateGroups
	{
		
		static Scanner userInput1;
		static int groupNum;
		static int numOfStudents = 1;
		static int groupSize;
		static int leftover;
	
		
		public static void makeNames() throws IOException
			{
				
				Scanner names = new Scanner(new File("studentnames.txt"));
				while (names.hasNext())
					{
						namesList.add(new Student(numOfStudents, names.nextLine()));
						numOfStudents++;
;					}
				
			}
		public static void numOfGroups() throws IOException
			{
				System.out.println("How many groups?");
				userInput1 = new Scanner(System.in);
				groupNum = userInput1.nextInt();
				makeGroups();

			}
		
		public static void makeGroups() throws IOException
			{
				groupSize = namesList.size()/groupNum;
				leftover = namesList.size()%groupNum;
				System.out.println("There will be " + leftover  + " groups with " + (groupSize+1) + " students and " + (groupNum-leftover) + " groups with "  + (groupSize) + " students.");
			
			}
		
		public static void randomizeGroups() throws IOException
			{
				
				if()
			
			
			}
		
		
	}
