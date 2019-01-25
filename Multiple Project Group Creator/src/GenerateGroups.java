import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import com.sun.org.apache.xpath.internal.operations.Number;

public class GenerateGroups
	{
		static ArrayList<Student>namesList = new ArrayList<Student>();
		static ArrayList<String>group1 = new ArrayList<String>();
		static ArrayList<String>group2 = new ArrayList<String>();
		static ArrayList<String>group3 = new ArrayList<String>();
		static ArrayList<String>group4 = new ArrayList<String>();
		static ArrayList<String>group5 = new ArrayList<String>();
		static ArrayList<String>group6 = new ArrayList<String>();
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
				leftover = numOfStudents - (groupSize*groupNum);
				System.out.println(groupSize);
			
			}
		
		
	}
