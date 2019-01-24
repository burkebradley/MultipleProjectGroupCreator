import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GenerateGroups
	{
		static ArrayList<Student>namesList = new ArrayList<Student>();
		static ArrayList<String>group1 = new ArrayList<String>();
		static ArrayList<String>group2 = new ArrayList<String>();
		static ArrayList<String>group3 = new ArrayList<String>();
		static ArrayList<String>group4 = new ArrayList<String>();
		static ArrayList<String>group5 = new ArrayList<String>();
		static ArrayList<String>group6 = new ArrayList<String>();
		static ArrayList<String>group7 = new ArrayList<String>();
		static ArrayList<String>group8 = new ArrayList<String>();
		static ArrayList<String>group9 = new ArrayList<String>();
		static ArrayList<String>group10 = new ArrayList<String>();
		static ArrayList<String>group11 = new ArrayList<String>();
		
		public static void makeNames() throws IOException
			{
				
				Scanner names = new Scanner(new File("studentnames.txt"));
				while (names.hasNext())
					{
						namesList.add(new Student(names.nextLine()));	
					}
			}
		public static void makeGroups() throws IOException
			{
				System.out.println("How many groups(1-11) do you want.");
				
				for(int i = 0; i<namesList.size(); i++)
					{
						System.out.println(namesList);
					}
			}
		
		
	}
